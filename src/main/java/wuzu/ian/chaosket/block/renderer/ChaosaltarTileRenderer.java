package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.ChaosaltarBlockModel;
import wuzu.ian.chaosket.block.entity.ChaosaltarTileEntity;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class ChaosaltarTileRenderer extends GeoBlockRenderer<ChaosaltarTileEntity> {
	public ChaosaltarTileRenderer() {
		super(new ChaosaltarBlockModel());
	}

	@Override
	public RenderType getRenderType(ChaosaltarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
