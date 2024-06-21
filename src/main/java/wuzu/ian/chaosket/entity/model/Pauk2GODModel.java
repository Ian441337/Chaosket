package wuzu.ian.chaosket.entity.model;

import wuzu.ian.chaosket.entity.Pauk2GODEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class Pauk2GODModel extends GeoModel<Pauk2GODEntity> {
	@Override
	public ResourceLocation getAnimationResource(Pauk2GODEntity entity) {
		return new ResourceLocation("chaosket", "animations/paul2craft.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Pauk2GODEntity entity) {
		return new ResourceLocation("chaosket", "geo/paul2craft.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Pauk2GODEntity entity) {
		return new ResourceLocation("chaosket", "textures/entities/" + entity.getTexture() + ".png");
	}

}
