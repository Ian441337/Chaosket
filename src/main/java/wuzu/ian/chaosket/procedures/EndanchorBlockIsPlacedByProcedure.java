package wuzu.ian.chaosket.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EndanchorBlockIsPlacedByProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == Level.END) {
			entity.getPersistentData().putDouble("endAnchorX", x);
			entity.getPersistentData().putDouble("endAnchorY", y);
			entity.getPersistentData().putDouble("endAnchorZ", z);
		}
	}
}
