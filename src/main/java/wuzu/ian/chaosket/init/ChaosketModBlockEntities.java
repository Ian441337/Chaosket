
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.block.entity.TravelAnchorblockBlockEntity;
import wuzu.ian.chaosket.block.entity.TestskinblockBlockEntity;
import wuzu.ian.chaosket.block.entity.ChaosaltarTileEntity;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class ChaosketModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ChaosketMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TRAVEL_ANCHORBLOCK = register("travel_anchorblock", ChaosketModBlocks.TRAVEL_ANCHORBLOCK, TravelAnchorblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<ChaosaltarTileEntity>> CHAOSALTAR = REGISTRY.register("chaosaltar", () -> BlockEntityType.Builder.of(ChaosaltarTileEntity::new, ChaosketModBlocks.CHAOSALTAR.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> TESTSKINBLOCK = register("testskinblock", ChaosketModBlocks.TESTSKINBLOCK, TestskinblockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
