package wuzu.ian.chaosket.block.model;

public class ChaosaltarBlockModel extends GeoModel<ChaosaltarTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChaosaltarTileEntity animatable) {
		return new ResourceLocation("chaosket", "animations/chaosaltar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChaosaltarTileEntity animatable) {
		return new ResourceLocation("chaosket", "geo/chaosaltar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChaosaltarTileEntity entity) {
		return new ResourceLocation("chaosket", "textures/block/chaosaltar.png");
	}
}