package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.display.TravelAnchorBlockDisplayItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class TravelAnchorBlockDisplayModel extends GeoModel<TravelAnchorBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TravelAnchorBlockDisplayItem animatable) {
		return new ResourceLocation("chaosket", "animations/travel_anchor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TravelAnchorBlockDisplayItem animatable) {
		return new ResourceLocation("chaosket", "geo/travel_anchor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TravelAnchorBlockDisplayItem entity) {
		return new ResourceLocation("chaosket", "textures/block/texture.png");
	}
}
