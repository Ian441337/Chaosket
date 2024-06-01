package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.entity.TravelAnchorBlockTileEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class TravelAnchorBlockBlockModel extends GeoModel<TravelAnchorBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TravelAnchorBlockTileEntity animatable) {
		return new ResourceLocation("chaosket", "animations/travel_anchor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TravelAnchorBlockTileEntity animatable) {
		return new ResourceLocation("chaosket", "geo/travel_anchor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TravelAnchorBlockTileEntity entity) {
		return new ResourceLocation("chaosket", "textures/block/texture.png");
	}
}
