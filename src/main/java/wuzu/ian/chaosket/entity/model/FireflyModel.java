package wuzu.ian.chaosket.entity.model;

import wuzu.ian.chaosket.entity.FireflyEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class FireflyModel extends GeoModel<FireflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(FireflyEntity entity) {
		return new ResourceLocation("chaosket", "animations/firefly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireflyEntity entity) {
		return new ResourceLocation("chaosket", "geo/firefly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireflyEntity entity) {
		return new ResourceLocation("chaosket", "textures/entities/" + entity.getTexture() + ".png");
	}

}
