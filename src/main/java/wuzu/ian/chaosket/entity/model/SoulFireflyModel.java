package wuzu.ian.chaosket.entity.model;

import wuzu.ian.chaosket.entity.SoulFireflyEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class SoulFireflyModel extends GeoModel<SoulFireflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(SoulFireflyEntity entity) {
		return new ResourceLocation("chaosket", "animations/firefly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SoulFireflyEntity entity) {
		return new ResourceLocation("chaosket", "geo/firefly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SoulFireflyEntity entity) {
		return new ResourceLocation("chaosket", "textures/entities/" + entity.getTexture() + ".png");
	}

}
