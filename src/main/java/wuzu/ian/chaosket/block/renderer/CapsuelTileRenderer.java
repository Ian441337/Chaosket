package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.CapsuelBlockModel;
import wuzu.ian.chaosket.block.entity.CapsuelTileEntity;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class CapsuelTileRenderer extends GeoBlockRenderer<CapsuelTileEntity> {
	public CapsuelTileRenderer() {
		super(new CapsuelBlockModel());
	}

	@Override
	public RenderType getRenderType(CapsuelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
