package wuzu.ian.chaosket.block.listener;

import wuzu.ian.chaosket.init.ChaosketModBlockEntities;
import wuzu.ian.chaosket.block.renderer.TravelAnchorBlockTileRenderer;
import wuzu.ian.chaosket.block.renderer.JaildoorTileRenderer;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = ChaosketMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(ChaosketModBlockEntities.JAILDOOR.get(), context -> new JaildoorTileRenderer());
		event.registerBlockEntityRenderer(ChaosketModBlockEntities.TRAVEL_ANCHOR_BLOCK.get(), context -> new TravelAnchorBlockTileRenderer());
	}
}
