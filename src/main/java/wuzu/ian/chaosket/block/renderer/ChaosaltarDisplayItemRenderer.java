package wuzu.ian.chaosket.block.renderer;

import wuzu.ian.chaosket.block.model.ChaosaltarDisplayModel;
import wuzu.ian.chaosket.block.display.ChaosaltarDisplayItem;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class ChaosaltarDisplayItemRenderer extends GeoItemRenderer<ChaosaltarDisplayItem> {
	public ChaosaltarDisplayItemRenderer() {
		super(new ChaosaltarDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChaosaltarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
