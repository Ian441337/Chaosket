
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.item.RingOfUnduingItem;
import wuzu.ian.chaosket.block.display.JaildoorDisplayItem;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ChaosketModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChaosketMod.MODID);
	public static final RegistryObject<Item> PINGUIN_SPAWN_EGG = REGISTRY.register("pinguin_spawn_egg", () -> new ForgeSpawnEggItem(ChaosketModEntities.PINGUIN, -16764058, -3342337, new Item.Properties()));
	public static final RegistryObject<Item> JAILDOOR = REGISTRY.register(ChaosketModBlocks.JAILDOOR.getId().getPath(), () -> new JaildoorDisplayItem(ChaosketModBlocks.JAILDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> TRAVELANCHORBLOCK = block(ChaosketModBlocks.TRAVELANCHORBLOCK);
	public static final RegistryObject<Item> RING_OF_UNDUING = REGISTRY.register("ring_of_unduing", () -> new RingOfUnduingItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
