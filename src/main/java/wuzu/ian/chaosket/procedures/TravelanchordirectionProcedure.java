package wuzu.ian.chaosket.procedures;

import wuzu.ian.chaosket.init.ChaosketModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

public class TravelanchordirectionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer && ChaosketModItems.STAFFOFTRAVELING.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((entity.getLookAngle().x + " ; " + entity.getLookAngle().y + " ; " + entity.getLookAngle().z)), true);
		}
	}
}
