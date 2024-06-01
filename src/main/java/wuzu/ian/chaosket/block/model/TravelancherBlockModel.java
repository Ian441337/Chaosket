package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.entity.TravelancherTileEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class TravelancherBlockModel extends GeoModel<TravelancherTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TravelancherTileEntity animatable) {
		return new ResourceLocation("chaosket", "animations/travel_anchor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TravelancherTileEntity animatable) {
		return new ResourceLocation("chaosket", "geo/travel_anchor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TravelancherTileEntity entity) {
		return new ResourceLocation("chaosket", "textures/block/texture.png");
	}
}
