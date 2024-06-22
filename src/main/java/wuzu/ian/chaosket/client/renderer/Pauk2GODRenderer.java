
package wuzu.ian.chaosket.client.renderer;

import wuzu.ian.chaosket.entity.model.Pauk2GODModel;
import wuzu.ian.chaosket.entity.layer.Pauk2GODLayer;
import wuzu.ian.chaosket.entity.Pauk2GODEntity;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Pauk2GODRenderer extends GeoEntityRenderer<Pauk2GODEntity> {
	public Pauk2GODRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new Pauk2GODModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new Pauk2GODLayer(this));
	}

	@Override
	public RenderType getRenderType(Pauk2GODEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, Pauk2GODEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 15f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
