package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.RedStrohhutItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class RedStrohhutModel extends GeoModel<RedStrohhutItem> {
	@Override
	public ResourceLocation getAnimationResource(RedStrohhutItem object) {
		return new ResourceLocation("chaosket", "animations/strohhut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RedStrohhutItem object) {
		return new ResourceLocation("chaosket", "geo/strohhut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RedStrohhutItem object) {
		return new ResourceLocation("chaosket", "textures/item/strohhut-rot.png");
	}
}
