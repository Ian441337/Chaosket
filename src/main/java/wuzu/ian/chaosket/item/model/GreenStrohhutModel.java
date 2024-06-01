package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.GreenStrohhutItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class GreenStrohhutModel extends GeoModel<GreenStrohhutItem> {
	@Override
	public ResourceLocation getAnimationResource(GreenStrohhutItem object) {
		return new ResourceLocation("chaosket", "animations/strohhut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreenStrohhutItem object) {
		return new ResourceLocation("chaosket", "geo/strohhut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreenStrohhutItem object) {
		return new ResourceLocation("chaosket", "textures/item/strohhut-green.png");
	}
}
