package wuzu.ian.chaosket.block.renderer;

public class ChaosaltarDisplayItemRenderer extends GeoItemRenderer<ChaosaltarDisplayItem> {
	public ChaosaltarDisplayItemRenderer() {
		super(new ChaosaltarDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChaosaltarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}