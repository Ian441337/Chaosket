package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.LilaStrohhutItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class LilaStrohhutModel extends GeoModel<LilaStrohhutItem> {
	@Override
	public ResourceLocation getAnimationResource(LilaStrohhutItem object) {
		return new ResourceLocation("chaosket", "animations/strohhut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LilaStrohhutItem object) {
		return new ResourceLocation("chaosket", "geo/strohhut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LilaStrohhutItem object) {
		return new ResourceLocation("chaosket", "textures/item/strohhut-lila.png");
	}
}
