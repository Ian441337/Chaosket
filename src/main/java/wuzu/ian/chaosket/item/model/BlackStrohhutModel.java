package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.BlackStrohhutItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class BlackStrohhutModel extends GeoModel<BlackStrohhutItem> {
	@Override
	public ResourceLocation getAnimationResource(BlackStrohhutItem object) {
		return new ResourceLocation("chaosket", "animations/strohhut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackStrohhutItem object) {
		return new ResourceLocation("chaosket", "geo/strohhut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackStrohhutItem object) {
		return new ResourceLocation("chaosket", "textures/item/strohhut-schwartz.png");
	}
}
