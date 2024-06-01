package wuzu.ian.chaosket.procedures;

import wuzu.ian.chaosket.init.ChaosketModBlocks;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class LaserbrigeprojectorRedstoneOffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double scalingx = 0;
		double Scaling = 0;
		Scaling = z;
		scalingx = x;
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
			for (int index0 = 0; index0 < 100; index0++) {
				if ((world.getBlockState(BlockPos.containing(x, y, Scaling + 1))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(x, y, Scaling + 1), false);
					Scaling = Scaling + 1;
				} else {
					break;
				}
				ChaosketMod.queueServerWork(20, () -> {
				});
			}
		} else if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
			for (int index1 = 0; index1 < 100; index1++) {
				if ((world.getBlockState(BlockPos.containing(x, y, Scaling - 1))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(x, y, Scaling - 1), false);
					Scaling = Scaling - 1;
				} else {
					break;
				}
				ChaosketMod.queueServerWork(20, () -> {
				});
			}
		} else if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
			for (int index2 = 0; index2 < 100; index2++) {
				if ((world.getBlockState(BlockPos.containing(scalingx + 1, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(scalingx + 1, y, z), false);
					scalingx = scalingx + 1;
				} else {
					break;
				}
				ChaosketMod.queueServerWork(20, () -> {
				});
			}
		} else if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
			for (int index3 = 0; index3 < 100; index3++) {
				if ((world.getBlockState(BlockPos.containing(scalingx - 1, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(scalingx - 1, y, z), false);
					scalingx = scalingx - 1;
				} else {
					break;
				}
				ChaosketMod.queueServerWork(20, () -> {
				});
			}
		}
	}
}
