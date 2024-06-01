package wuzu.ian.chaosket.procedures;

import wuzu.ian.chaosket.init.ChaosketModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class TravelanchordirectionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
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
			graph_point_x1 = entity.getX();
			graph_point_x2 = entity.getLookAngle().x;
			graph_point_y1 = entity.getY();
			graph_point_y2 = entity.getLookAngle().y;
			graph_point_z1 = entity.getZ();
			graph_point_z2 = entity.getLookAngle().z;
			if (true) {
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
					}
				}
			}
		}
	}
}
