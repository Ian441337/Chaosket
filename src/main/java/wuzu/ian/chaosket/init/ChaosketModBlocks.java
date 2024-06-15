
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.block.TravelAnchorblockBlock;
import wuzu.ian.chaosket.block.LaserbrigeprojectorBlock;
import wuzu.ian.chaosket.block.LaserbrigeBlock;
import wuzu.ian.chaosket.block.JailDoorBlock;
import wuzu.ian.chaosket.block.EndanchorBlock;
import wuzu.ian.chaosket.block.ChaosaltarBlock;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ChaosketModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChaosketMod.MODID);
	public static final RegistryObject<Block> LASERBRIGE = REGISTRY.register("laserbrige", () -> new LaserbrigeBlock());
	public static final RegistryObject<Block> LASERBRIGEPROJECTOR = REGISTRY.register("laserbrigeprojector", () -> new LaserbrigeprojectorBlock());
	public static final RegistryObject<Block> JAIL_DOOR = REGISTRY.register("jail_door", () -> new JailDoorBlock());
	public static final RegistryObject<Block> TRAVEL_ANCHORBLOCK = REGISTRY.register("travel_anchorblock", () -> new TravelAnchorblockBlock());
	public static final RegistryObject<Block> ENDANCHOR = REGISTRY.register("endanchor", () -> new EndanchorBlock());
	public static final RegistryObject<Block> CHAOSALTAR = REGISTRY.register("chaosaltar", () -> new ChaosaltarBlock());
}
