package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.WhiteStrohhutItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class WhiteStrohhutModel extends GeoModel<WhiteStrohhutItem> {
	@Override
	public ResourceLocation getAnimationResource(WhiteStrohhutItem object) {
		return new ResourceLocation("chaosket", "animations/strohhut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhiteStrohhutItem object) {
		return new ResourceLocation("chaosket", "geo/strohhut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhiteStrohhutItem object) {
		return new ResourceLocation("chaosket", "textures/item/strohhut-weiss.png");
	}
}
