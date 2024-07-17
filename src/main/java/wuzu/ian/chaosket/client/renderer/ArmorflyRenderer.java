
package wuzu.ian.chaosket.client.renderer;

import wuzu.ian.chaosket.entity.ArmorflyEntity;
import wuzu.ian.chaosket.client.model.Modelarmor_fly;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ArmorflyRenderer extends MobRenderer<ArmorflyEntity, Modelarmor_fly<ArmorflyEntity>> {
	public ArmorflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarmor_fly(context.bakeLayer(Modelarmor_fly.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ArmorflyEntity entity) {
		return new ResourceLocation("chaosket:textures/entities/pinguin.png");
	}
}
