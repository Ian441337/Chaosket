
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.client.gui.TravelanchorScreen;
import wuzu.ian.chaosket.client.gui.ChaosaltarguiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChaosketModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ChaosketModMenus.TRAVELANCHOR.get(), TravelanchorScreen::new);
			MenuScreens.register(ChaosketModMenus.CHAOSALTARGUI.get(), ChaosaltarguiScreen::new);
		});
	}
}
