package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.BlueStrohhutItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class BlueStrohhutModel extends GeoModel<BlueStrohhutItem> {
	@Override
	public ResourceLocation getAnimationResource(BlueStrohhutItem object) {
		return new ResourceLocation("chaosket", "animations/strohhut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlueStrohhutItem object) {
		return new ResourceLocation("chaosket", "geo/strohhut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlueStrohhutItem object) {
		return new ResourceLocation("chaosket", "textures/item/strohhut-item-blue.png");
	}
}
