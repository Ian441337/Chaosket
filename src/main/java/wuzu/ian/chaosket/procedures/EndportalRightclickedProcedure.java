package wuzu.ian.chaosket.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class EndportalRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Minecraft.getInstance().gameRenderer.loadEffect(new ResourceLocation("minecraft:shaders/post/notch.json"));
	}
}
