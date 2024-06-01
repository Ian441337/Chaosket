package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.TravelAnchorBlockDisplayModel;
import wuzu.ian.chaosket.block.display.TravelAnchorBlockDisplayItem;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TravelAnchorBlockDisplayItemRenderer extends GeoItemRenderer<TravelAnchorBlockDisplayItem> {
	public TravelAnchorBlockDisplayItemRenderer() {
		super(new TravelAnchorBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(TravelAnchorBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
