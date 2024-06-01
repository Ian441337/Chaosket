package wuzu.ian.chaosket.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Display;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Comparator;

public class TravelanchorblockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(Display.BlockDisplay.class, AABB.ofSize(new Vec3(x, y, z), 0.5, 0.5, 0.5), e -> true).isEmpty()
				&& (((Entity) world.getEntitiesOfClass(Display.BlockDisplay.class, AABB.ofSize(new Vec3(x, y, z), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("tag")).equals("travel_anchor_display")) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Display.BlockDisplay.class, AABB.ofSize(new Vec3(x, y, z), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "data merge entity @s {block_state:{Name:\"minecraft:air\"}}");
				}
			}
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Display.BlockDisplay.class, AABB.ofSize(new Vec3(x, y, z), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "data modify entity @s block_state.Name set from block ~ ~ ~ Items[0].id");
				}
			}
		} else {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BLOCK_DISPLAY.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (!world.getEntitiesOfClass(Display.BlockDisplay.class, AABB.ofSize(new Vec3(x, y, z), 0.5, 0.5, 0.5), e -> true).isEmpty()) {
				((Entity) world.getEntitiesOfClass(Display.BlockDisplay.class, AABB.ofSize(new Vec3(x, y, z), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("tag", "travel_anchor_display");
			}
		}
	}
}
