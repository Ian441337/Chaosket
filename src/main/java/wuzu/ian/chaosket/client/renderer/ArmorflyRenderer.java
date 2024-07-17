
package wuzu.ian.chaosket.client.renderer;

public class ArmorflyRenderer extends MobRenderer<ArmorflyEntity, Modelarmor_fly<ArmorflyEntity>> {

	public ArmorflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarmor_fly(context.bakeLayer(Modelarmor_fly.LAYER_LOCATION)), 1f);

	}

	@Override
	public ResourceLocation getTextureLocation(ArmorflyEntity entity) {
		return new ResourceLocation("chaosket:textures/entities/pinguin.png");
	}

}
