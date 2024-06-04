package wuzu.ian.chaosket.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OutlineRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Minecraft.getInstance().gameRenderer.loadEffect(new ResourceLocation("minecraft:shaders/post/outline.json"));
	}
}
