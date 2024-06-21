package wuzu.ian.chaosket.block.model;

import wuzu.ian.chaosket.block.display.ChaosaltarDisplayItem;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class ChaosaltarDisplayModel extends GeoModel<ChaosaltarDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChaosaltarDisplayItem animatable) {
		return new ResourceLocation("chaosket", "animations/chaosaltar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChaosaltarDisplayItem animatable) {
		return new ResourceLocation("chaosket", "geo/chaosaltar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChaosaltarDisplayItem entity) {
		return new ResourceLocation("chaosket", "textures/block/chaosaltar.png");
	}
}
