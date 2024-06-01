package wuzu.ian.chaosket.procedures;

import wuzu.ian.chaosket.init.ChaosketModBlocks;

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
				if ((world.getBlockState(BlockPos.containing(x, y, Scaling))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(x, y, Scaling), false);
					Scaling = Scaling + 1;
				} else {
					break;
				}
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
				if ((world.getBlockState(BlockPos.containing(x, y, Scaling))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(x, y, Scaling), false);
					Scaling = Scaling + 1;
				} else {
					break;
				}
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
				if ((world.getBlockState(BlockPos.containing(scalingx, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(scalingx, y, z), false);
					Scaling = scalingx + 1;
				} else {
					break;
				}
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
				if ((world.getBlockState(BlockPos.containing(scalingx, y, z))).getBlock() == ChaosketModBlocks.LASERBRIGE.get()) {
					world.destroyBlock(BlockPos.containing(scalingx, y, z), false);
					Scaling = scalingx - 1;
				} else {
					break;
				}
			}
		}
	}
}
