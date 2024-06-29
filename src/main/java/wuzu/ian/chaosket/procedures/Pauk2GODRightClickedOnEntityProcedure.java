package wuzu.ian.chaosket.procedures;

import net.minecraft.world.entity.Entity;

public class Pauk2GODRightClickedOnEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		Callanimationpaul2godProcedure.execute(entity);
	}
}
