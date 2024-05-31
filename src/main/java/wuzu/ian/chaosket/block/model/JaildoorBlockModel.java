package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.entity.JaildoorTileEntity;

import net.minecraft.resources.ResourceLocation;

public class JaildoorBlockModel extends GeoModel<JaildoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JaildoorTileEntity animatable) {
		return new ResourceLocation("chaosket", "animations/jail_door.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JaildoorTileEntity animatable) {
		return new ResourceLocation("chaosket", "geo/jail_door.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JaildoorTileEntity entity) {
		return new ResourceLocation("chaosket", "textures/block/jail_door.png");
	}
}
