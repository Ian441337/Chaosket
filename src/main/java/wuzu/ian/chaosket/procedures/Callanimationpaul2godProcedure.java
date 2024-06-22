package wuzu.ian.chaosket.procedures;

import wuzu.ian.chaosket.entity.Pauk2GODEntity;

import net.minecraft.world.entity.Entity;

public class Callanimationpaul2godProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Pauk2GODEntity) {
			((Pauk2GODEntity) entity).setAnimation("animation.Paul2Craft.execute");
		}
	}
}
