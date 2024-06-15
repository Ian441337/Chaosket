
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.item.WhiteStrohhutItem;
import wuzu.ian.chaosket.item.StopshaderItem;
import wuzu.ian.chaosket.item.StaffoftravelingItem;
import wuzu.ian.chaosket.item.SobelItem;
import wuzu.ian.chaosket.item.ShrinkdeviceItem;
import wuzu.ian.chaosket.item.RingOfUnduingItem;
import wuzu.ian.chaosket.item.RedStrohhutItem;
import wuzu.ian.chaosket.item.OutlineItem;
import wuzu.ian.chaosket.item.LilaStrohhutItem;
import wuzu.ian.chaosket.item.GreenStrohhutItem;
import wuzu.ian.chaosket.item.EndportalItem;
import wuzu.ian.chaosket.item.BlueStrohhutItem;
import wuzu.ian.chaosket.item.BlackStrohhutItem;
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
	public static final RegistryObject<Item> PINGUIN_SPAWN_EGG = REGISTRY.register("pinguin_spawn_egg", () -> new ForgeSpawnEggItem(ChaosketModEntities.PINGUIN, -16764058, -3342337, new Item.Properties()));
	public static final RegistryObject<Item> RING_OF_UNDUING = REGISTRY.register("ring_of_unduing", () -> new RingOfUnduingItem());
	public static final RegistryObject<Item> STAFFOFTRAVELING = REGISTRY.register("staffoftraveling", () -> new StaffoftravelingItem());
	public static final RegistryObject<RedStrohhutItem> RED_STROHHUT_HELMET = REGISTRY.register("red_strohhut_helmet", () -> new RedStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<GreenStrohhutItem> GREEN_STROHHUT_HELMET = REGISTRY.register("green_strohhut_helmet", () -> new GreenStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<LilaStrohhutItem> LILA_STROHHUT_HELMET = REGISTRY.register("lila_strohhut_helmet", () -> new LilaStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<BlueStrohhutItem> BLUE_STROHHUT_HELMET = REGISTRY.register("blue_strohhut_helmet", () -> new BlueStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<WhiteStrohhutItem> WHITE_STROHHUT_HELMET = REGISTRY.register("white_strohhut_helmet", () -> new WhiteStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<BlackStrohhutItem> BLACK_STROHHUT_HELMET = REGISTRY.register("black_strohhut_helmet", () -> new BlackStrohhutItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<Item> SHRINKDEVICE = REGISTRY.register("shrinkdevice", () -> new ShrinkdeviceItem());
	public static final RegistryObject<Item> LASERBRIGE = block(ChaosketModBlocks.LASERBRIGE);
	public static final RegistryObject<Item> LASERBRIGEPROJECTOR = block(ChaosketModBlocks.LASERBRIGEPROJECTOR);
	public static final RegistryObject<Item> JAIL_DOOR = doubleBlock(ChaosketModBlocks.JAIL_DOOR);
	public static final RegistryObject<Item> TRAVEL_ANCHORBLOCK = block(ChaosketModBlocks.TRAVEL_ANCHORBLOCK);
	public static final RegistryObject<Item> ENDANCHOR = block(ChaosketModBlocks.ENDANCHOR);
	public static final RegistryObject<Item> STOPSHADER = REGISTRY.register("stopshader", () -> new StopshaderItem());
	public static final RegistryObject<Item> SOBEL = REGISTRY.register("sobel", () -> new SobelItem());
	public static final RegistryObject<Item> OUTLINE = REGISTRY.register("outline", () -> new OutlineItem());
	public static final RegistryObject<Item> NOTCH = REGISTRY.register("notch", () -> new EndportalItem());
	public static final RegistryObject<Item> CHAOSALTAR = REGISTRY.register(ChaosketModBlocks.CHAOSALTAR.getId().getPath(), () -> new ChaosaltarDisplayItem(ChaosketModBlocks.CHAOSALTAR.get(), new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
