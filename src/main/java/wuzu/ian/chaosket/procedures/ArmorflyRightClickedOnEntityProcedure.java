package wuzu.ian.chaosket.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

public class ArmorflyRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof TamableAnimal _toTame && entity instanceof Player _owner)
			_toTame.tame(_owner);
	}
}
