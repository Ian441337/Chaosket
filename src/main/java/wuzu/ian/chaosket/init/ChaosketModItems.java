
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.item.StopshaderItem;
import wuzu.ian.chaosket.item.StaffoftravelingItem;
import wuzu.ian.chaosket.item.SobelItem;
import wuzu.ian.chaosket.item.SirenItem;
import wuzu.ian.chaosket.item.RedStrohhutItem;
import wuzu.ian.chaosket.item.ItemcreativeTabItem;
import wuzu.ian.chaosket.block.display.ChaosaltarDisplayItem;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;

public class ChaosketModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChaosketMod.MODID);
	public static final RegistryObject<Item> BASALT = block(ChaosketModBlocks.BASALT);
	public static final RegistryObject<Item> BASALTWITHLIGHT = block(ChaosketModBlocks.BASALTWITHLIGHT);
	public static final RegistryObject<Item> DATABLOCK = block(ChaosketModBlocks.DATABLOCK);
	public static final RegistryObject<Item> DER_HOSEN_TEPPICH = block(ChaosketModBlocks.DER_HOSEN_TEPPICH);
	public static final RegistryObject<Item> LASERBRIGEPROJECTOR = block(ChaosketModBlocks.LASERBRIGEPROJECTOR);
	public static final RegistryObject<Item> TRAVEL_ANCHORBLOCK = block(ChaosketModBlocks.TRAVEL_ANCHORBLOCK);
	public static final RegistryObject<Item> ENDANCHOR = block(ChaosketModBlocks.ENDANCHOR);
	public static final RegistryObject<Item> CHAOSALTAR = REGISTRY.register(ChaosketModBlocks.CHAOSALTAR.getId().getPath(), () -> new ChaosaltarDisplayItem(ChaosketModBlocks.CHAOSALTAR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STAFFOFTRAVELING = REGISTRY.register("staffoftraveling", () -> new StaffoftravelingItem());
	public static final RegistryObject<Item> JAIL_DOOR = doubleBlock(ChaosketModBlocks.JAIL_DOOR);
	public static final RegistryObject<RedStrohhutItem> RED_STROHHUT_HELMET = REGISTRY.register("red_strohhut_helmet", () -> new RedStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<Item> PAUK_2_GOD_SPAWN_EGG = REGISTRY.register("pauk_2_god_spawn_egg", () -> new ForgeSpawnEggItem(ChaosketModEntities.PAUK_2_GOD, -16738048, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> FIREFLY_SPAWN_EGG = REGISTRY.register("firefly_spawn_egg", () -> new ForgeSpawnEggItem(ChaosketModEntities.FIREFLY, -10079488, -256, new Item.Properties()));
	public static final RegistryObject<Item> SOUL_FIREFLY_SPAWN_EGG = REGISTRY.register("soul_firefly_spawn_egg", () -> new ForgeSpawnEggItem(ChaosketModEntities.SOUL_FIREFLY, -10079488, -16711681, new Item.Properties()));
	public static final RegistryObject<Item> PINGUIN_SPAWN_EGG = REGISTRY.register("pinguin_spawn_egg", () -> new ForgeSpawnEggItem(ChaosketModEntities.PINGUIN, -16764058, -3342337, new Item.Properties()));
	public static final RegistryObject<Item> LOSTSPACELASERBRIGE = block(ChaosketModBlocks.LOSTSPACELASERBRIGE);
	public static final RegistryObject<Item> LASERBRIGE = block(ChaosketModBlocks.LASERBRIGE);
	public static final RegistryObject<Item> STOPSHADER = REGISTRY.register("stopshader", () -> new StopshaderItem());
	public static final RegistryObject<Item> SOBEL = REGISTRY.register("sobel", () -> new SobelItem());
	public static final RegistryObject<Item> SIREN = REGISTRY.register("siren", () -> new SirenItem());
	public static final RegistryObject<Item> ITEMCREATIVE_TAB = REGISTRY.register("itemcreative_tab", () -> new ItemcreativeTabItem());
	public static final RegistryObject<Item> TESTSKINBLOCK = block(ChaosketModBlocks.TESTSKINBLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
