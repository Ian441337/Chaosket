package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.display.JaildoorDisplayItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class JaildoorDisplayModel extends GeoModel<JaildoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JaildoorDisplayItem animatable) {
		return new ResourceLocation("chaosket", "animations/jail_door.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JaildoorDisplayItem animatable) {
		return new ResourceLocation("chaosket", "geo/jail_door.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JaildoorDisplayItem entity) {
		return new ResourceLocation("chaosket", "textures/block/jail_door.png");
	}
}
