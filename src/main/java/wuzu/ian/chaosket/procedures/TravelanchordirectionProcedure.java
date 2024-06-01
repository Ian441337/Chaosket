package wuzu.ian.chaosket.procedures;

import wuzu.ian.chaosket.init.ChaosketModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class TravelanchordirectionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double graph_point_x1 = 0;
		double graph_point_x2 = 0;
		double graph_point_y1 = 0;
		double graph_point_y2 = 0;
		double graph_point_z1 = 0;
		double graph_point_z2 = 0;
		double s1 = 0;
		double s2 = 0;
		double s3 = 0;
		double anchor_x = 0;
		double anchor_y = 0;
		double anchor_z = 0;
		if (entity instanceof ServerPlayer && ChaosketModItems.STAFFOFTRAVELING.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ArmorStand && (entityiterator.getPersistentData().getString("tag")).equals("travelAnchor")) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Math.round(((entityiterator.getX() * 10 - entity.getX() * 10) / (entity.getLookAngle().x * 10)) * 0.1) + ";"
									+ Math.round(((entityiterator.getY() * 10 - (entity.getY() + 1.62) * 10) / (entity.getLookAngle().y * 10)) * 0.1) + ";"
									+ Math.round(((entityiterator.getZ() * 10 - entity.getZ() * 10) / (entity.getLookAngle().z * 10)) * 0.1))), true);
						if (Math.round(((entityiterator.getX() * 10 - entity.getX() * 10) / (entity.getLookAngle().x * 10)) * 0.1) == Math.round(((entityiterator.getY() * 10 - (entity.getY() + 1.62) * 10) / (entity.getLookAngle().y * 10)) * 0.1)
								&& Math.round(((entityiterator.getX() * 10 - entity.getX() * 10) / (entity.getLookAngle().x * 10)) * 0.1) == Math.round(((entityiterator.getZ() * 10 - entity.getZ() * 10) / (entity.getLookAngle().z * 10)) * 0.1)) {
							{
								Entity _ent = entityiterator;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands()
											.performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level().getServer(), _ent),
													"data merge entity @e[type=block_display,limit=1,sort=nearest,distance=..3,nbt={ForgeData:{tag:\"travelAnchorDisplay\"}}] {Glowing:1b}");
								}
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"say 1");
						} else {
							{
								Entity _ent = entityiterator;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands()
											.performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level().getServer(), _ent),
													"data merge entity @e[type=block_display,limit=1,sort=nearest,distance=..3,nbt={ForgeData:{tag:\"travelAnchorDisplay\"}}] {Glowing:0b}");
								}
							}
						}
					}
				}
			}
		}
	}
}
