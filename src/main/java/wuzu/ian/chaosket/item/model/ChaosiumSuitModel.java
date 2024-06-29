package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.ChaosiumSuitItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class ChaosiumSuitModel extends GeoModel<ChaosiumSuitItem> {
	@Override
	public ResourceLocation getAnimationResource(ChaosiumSuitItem object) {
		return new ResourceLocation("chaosket", "animations/chaosiumsuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChaosiumSuitItem object) {
		return new ResourceLocation("chaosket", "geo/chaosiumsuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChaosiumSuitItem object) {
		return new ResourceLocation("chaosket", "textures/item/chaosiumsuit.png");
	}
}
