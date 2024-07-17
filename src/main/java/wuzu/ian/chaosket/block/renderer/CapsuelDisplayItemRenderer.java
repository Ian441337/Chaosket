package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.CapsuelDisplayModel;
import wuzu.ian.chaosket.block.display.CapsuelDisplayItem;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class CapsuelDisplayItemRenderer extends GeoItemRenderer<CapsuelDisplayItem> {
	public CapsuelDisplayItemRenderer() {
		super(new CapsuelDisplayModel());
	}

	@Override
	public RenderType getRenderType(CapsuelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
