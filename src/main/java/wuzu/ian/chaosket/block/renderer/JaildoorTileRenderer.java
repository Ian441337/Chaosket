package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.JaildoorBlockModel;
import wuzu.ian.chaosket.block.entity.JaildoorTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class JaildoorTileRenderer extends GeoBlockRenderer<JaildoorTileEntity> {
	public JaildoorTileRenderer() {
		super(new JaildoorBlockModel());
	}

	@Override
	public RenderType getRenderType(JaildoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
