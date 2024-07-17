package wuzu.ian.chaosket.block.renderer;

public class CapsuelTileRenderer extends GeoBlockRenderer<CapsuelTileEntity> {
	public CapsuelTileRenderer() {
		super(new CapsuelBlockModel());
	}

	@Override
	public RenderType getRenderType(CapsuelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}