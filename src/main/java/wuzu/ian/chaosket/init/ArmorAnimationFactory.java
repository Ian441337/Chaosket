package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.item.WhiteStrohhutItem;
import wuzu.ian.chaosket.item.RedStrohhutItem;
import wuzu.ian.chaosket.item.LilaStrohhutItem;
import wuzu.ian.chaosket.item.GreenStrohhutItem;
import wuzu.ian.chaosket.item.ChaosiumarmorItem;
import wuzu.ian.chaosket.item.ChaosiumSuitItem;
import wuzu.ian.chaosket.item.BlueStrohhutItem;
import wuzu.ian.chaosket.item.BlackStrohhutItem;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

@Mod.EventBusSubscriber
public class ArmorAnimationFactory {
	@SubscribeEvent
	public static void animatedArmors(TickEvent.PlayerTickEvent event) {
		String animation = "";
		if (event.phase == TickEvent.Phase.END) {
			if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof RedStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof GreenStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof LilaStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof BlueStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof WhiteStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof BlackStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ChaosiumSuitItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ChaosiumarmorItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
			if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof RedStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof GreenStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof LilaStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof BlueStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof WhiteStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof BlackStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof ChaosiumSuitItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof ChaosiumarmorItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
			if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof RedStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof GreenStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof LilaStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof BlueStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof WhiteStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof BlackStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof ChaosiumSuitItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof ChaosiumarmorItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
			if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RedStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GreenStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof LilaStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof BlueStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof WhiteStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof BlackStrohhutItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof ChaosiumSuitItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof ChaosiumarmorItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
		}
	}
}
