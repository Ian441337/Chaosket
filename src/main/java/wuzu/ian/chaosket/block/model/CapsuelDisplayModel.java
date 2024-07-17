package wuzu.ian.chaosket.block.model;

public class CapsuelDisplayModel extends GeoModel<CapsuelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CapsuelDisplayItem animatable) {
		return new ResourceLocation("chaosket", "animations/capsel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CapsuelDisplayItem animatable) {
		return new ResourceLocation("chaosket", "geo/capsel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CapsuelDisplayItem entity) {
		return new ResourceLocation("chaosket", "textures/block/capsuel.png");
	}
}