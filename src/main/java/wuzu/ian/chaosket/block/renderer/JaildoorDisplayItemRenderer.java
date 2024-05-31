package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.JaildoorDisplayModel;
import wuzu.ian.chaosket.block.display.JaildoorDisplayItem;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class JaildoorDisplayItemRenderer extends GeoItemRenderer<JaildoorDisplayItem> {
	public JaildoorDisplayItemRenderer() {
		super(new JaildoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(JaildoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
