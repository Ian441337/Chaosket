
package wuzu.ian.chaosket.client.renderer;

public class PinguinRenderer extends GeoEntityRenderer<PinguinEntity> {
	public PinguinRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PinguinModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PinguinEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PinguinEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 0.5f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}