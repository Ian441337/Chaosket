package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.TravelancherBlockModel;
import wuzu.ian.chaosket.block.entity.TravelancherTileEntity;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TravelancherTileRenderer extends GeoBlockRenderer<TravelancherTileEntity> {
	public TravelancherTileRenderer() {
		super(new TravelancherBlockModel());
	}

	@Override
	public RenderType getRenderType(TravelancherTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
