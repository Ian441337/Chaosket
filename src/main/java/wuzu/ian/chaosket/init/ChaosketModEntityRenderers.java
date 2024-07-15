
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.client.renderer.SoulFireflyRenderer;
import wuzu.ian.chaosket.client.renderer.PinguinRenderer;
import wuzu.ian.chaosket.client.renderer.Pauk2GODRenderer;
import wuzu.ian.chaosket.client.renderer.FireflyRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChaosketModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ChaosketModEntities.PAUK_2_GOD.get(), Pauk2GODRenderer::new);
		event.registerEntityRenderer(ChaosketModEntities.FIREFLY.get(), FireflyRenderer::new);
		event.registerEntityRenderer(ChaosketModEntities.SOUL_FIREFLY.get(), SoulFireflyRenderer::new);
		event.registerEntityRenderer(ChaosketModEntities.PINGUIN.get(), PinguinRenderer::new);
	}
}
