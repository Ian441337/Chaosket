package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.entity.CapsuelTileEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class CapsuelBlockModel extends GeoModel<CapsuelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CapsuelTileEntity animatable) {
		return new ResourceLocation("chaosket", "animations/capsel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CapsuelTileEntity animatable) {
		return new ResourceLocation("chaosket", "geo/capsel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CapsuelTileEntity entity) {
		return new ResourceLocation("chaosket", "textures/block/capsuel.png");
	}
}
