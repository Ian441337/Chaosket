package wuzu.ian.chaosket.block.renderer;

public class CapsuelDisplayItemRenderer extends GeoItemRenderer<CapsuelDisplayItem> {
	public CapsuelDisplayItemRenderer() {
		super(new CapsuelDisplayModel());
	}

	@Override
	public RenderType getRenderType(CapsuelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}