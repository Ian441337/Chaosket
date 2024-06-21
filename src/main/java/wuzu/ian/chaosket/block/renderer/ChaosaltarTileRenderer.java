package wuzu.ian.chaosket.block.renderer;

public class ChaosaltarTileRenderer extends GeoBlockRenderer<ChaosaltarTileEntity> {
	public ChaosaltarTileRenderer() {
		super(new ChaosaltarBlockModel());
	}

	@Override
	public RenderType getRenderType(ChaosaltarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}