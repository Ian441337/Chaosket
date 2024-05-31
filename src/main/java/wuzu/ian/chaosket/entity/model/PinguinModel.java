package wuzu.ian.chaosket.entity.model;

import wuzu.ian.chaosket.entity.PinguinEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class PinguinModel extends GeoModel<PinguinEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinguinEntity entity) {
		return new ResourceLocation("chaosket", "animations/pinguin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinguinEntity entity) {
		return new ResourceLocation("chaosket", "geo/pinguin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinguinEntity entity) {
		return new ResourceLocation("chaosket", "textures/entities/" + entity.getTexture() + ".png");
	}

}
