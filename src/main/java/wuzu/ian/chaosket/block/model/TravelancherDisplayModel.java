package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.display.TravelancherDisplayItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class TravelancherDisplayModel extends GeoModel<TravelancherDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TravelancherDisplayItem animatable) {
		return new ResourceLocation("chaosket", "animations/travel_anchor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TravelancherDisplayItem animatable) {
		return new ResourceLocation("chaosket", "geo/travel_anchor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TravelancherDisplayItem entity) {
		return new ResourceLocation("chaosket", "textures/block/texture.png");
	}
}
