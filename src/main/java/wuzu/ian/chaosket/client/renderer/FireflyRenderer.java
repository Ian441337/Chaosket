
package wuzu.ian.chaosket.client.renderer;

import wuzu.ian.chaosket.entity.model.FireflyModel;
import wuzu.ian.chaosket.entity.layer.FireflyLayer;
import wuzu.ian.chaosket.entity.FireflyEntity;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FireflyRenderer extends GeoEntityRenderer<FireflyEntity> {
	public FireflyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FireflyModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new FireflyLayer(this));
	}

	@Override
	public RenderType getRenderType(FireflyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FireflyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
