package wuzu.ian.chaosket.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ArmorflyRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof TamableAnimal _toTame && entity instanceof Player _owner)
			_toTame.tame(_owner);
	}
}
