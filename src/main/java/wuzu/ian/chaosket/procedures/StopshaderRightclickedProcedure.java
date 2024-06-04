package wuzu.ian.chaosket.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StopshaderRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Minecraft.getInstance().gameRenderer.shutdownEffect();
	}
}
