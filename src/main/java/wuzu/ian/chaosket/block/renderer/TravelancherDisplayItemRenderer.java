package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.TravelancherDisplayModel;
import wuzu.ian.chaosket.block.display.TravelancherDisplayItem;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TravelancherDisplayItemRenderer extends GeoItemRenderer<TravelancherDisplayItem> {
	public TravelancherDisplayItemRenderer() {
		super(new TravelancherDisplayModel());
	}

	@Override
	public RenderType getRenderType(TravelancherDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
