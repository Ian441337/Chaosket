
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.item.StaffoftravelingItem;
import wuzu.ian.chaosket.item.RingOfUnduingItem;
import wuzu.ian.chaosket.item.RedStrohhutItem;
import wuzu.ian.chaosket.item.GreenStrohhutItem;
import wuzu.ian.chaosket.block.display.JaildoorDisplayItem;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;

public class ChaosketModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChaosketMod.MODID);
	public static final RegistryObject<Item> PINGUIN_SPAWN_EGG = REGISTRY.register("pinguin_spawn_egg", () -> new ForgeSpawnEggItem(ChaosketModEntities.PINGUIN, -16764058, -3342337, new Item.Properties()));
	public static final RegistryObject<Item> JAILDOOR = REGISTRY.register(ChaosketModBlocks.JAILDOOR.getId().getPath(), () -> new JaildoorDisplayItem(ChaosketModBlocks.JAILDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> TRAVELANCHORBLOCK = block(ChaosketModBlocks.TRAVELANCHORBLOCK);
	public static final RegistryObject<Item> RING_OF_UNDUING = REGISTRY.register("ring_of_unduing", () -> new RingOfUnduingItem());
	public static final RegistryObject<Item> STAFFOFTRAVELING = REGISTRY.register("staffoftraveling", () -> new StaffoftravelingItem());
	public static final RegistryObject<RedStrohhutItem> RED_STROHHUT_HELMET = REGISTRY.register("red_strohhut_helmet", () -> new RedStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<GreenStrohhutItem> GREEN_STROHHUT_HELMET = REGISTRY.register("green_strohhut_helmet", () -> new GreenStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
