package wuzu.ian.chaosket.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class VevProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Minecraft.getInstance().gameRenderer.loadEffect(new ResourceLocation("chaosket:shaders/core/vev.json"));
	}
}
