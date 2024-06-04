package wuzu.ian.chaosket.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

public class StopshaderRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Minecraft.getInstance().gameRenderer.shutdownEffect();
	}
}
