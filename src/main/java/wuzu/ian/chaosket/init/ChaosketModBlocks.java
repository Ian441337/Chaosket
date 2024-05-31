
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.block.JaildoorBlock;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ChaosketModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChaosketMod.MODID);
	public static final RegistryObject<Block> JAILDOOR = REGISTRY.register("jaildoor", () -> new JaildoorBlock());
}
