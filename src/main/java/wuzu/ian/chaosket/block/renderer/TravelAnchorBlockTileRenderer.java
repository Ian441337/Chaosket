package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.TravelAnchorBlockBlockModel;
import wuzu.ian.chaosket.block.entity.TravelAnchorBlockTileEntity;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TravelAnchorBlockTileRenderer extends GeoBlockRenderer<TravelAnchorBlockTileEntity> {
	public TravelAnchorBlockTileRenderer() {
		super(new TravelAnchorBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(TravelAnchorBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
