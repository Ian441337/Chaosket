package wuzu.ian.chaosket.procedures;

import wuzu.ian.chaosket.init.ChaosketModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LaserbrigeUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGEPROJECTOR.get()) && !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGE.get())
				&& !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGEPROJECTOR.get()) && !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGE.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == ChaosketModBlocks.LASERBRIGEPROJECTOR.get()) && !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == ChaosketModBlocks.LASERBRIGE.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == ChaosketModBlocks.LASERBRIGEPROJECTOR.get()) && !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == ChaosketModBlocks.LASERBRIGE.get())) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
	}
}
