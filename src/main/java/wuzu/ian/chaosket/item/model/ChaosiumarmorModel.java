package wuzu.ian.chaosket.item.model;

import wuzu.ian.chaosket.item.ChaosiumarmorItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class ChaosiumarmorModel extends GeoModel<ChaosiumarmorItem> {
	@Override
	public ResourceLocation getAnimationResource(ChaosiumarmorItem object) {
		return new ResourceLocation("chaosket", "animations/customarmorv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChaosiumarmorItem object) {
		return new ResourceLocation("chaosket", "geo/customarmorv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChaosiumarmorItem object) {
		return new ResourceLocation("chaosket", "textures/item/.png");
	}
}
