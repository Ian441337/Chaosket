
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChaosketModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChaosketMod.MODID);
	public static final RegistryObject<CreativeModeTab> CHAOS_KET = REGISTRY.register("chaos_ket",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chaosket.chaos_ket")).icon(() -> new ItemStack(ChaosketModItems.SHRINKDEVICE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChaosketModItems.STAFFOFTRAVELING.get());
				tabData.accept(ChaosketModItems.RED_STROHHUT_HELMET.get());
				tabData.accept(ChaosketModItems.GREEN_STROHHUT_HELMET.get());
				tabData.accept(ChaosketModItems.LILA_STROHHUT_HELMET.get());
				tabData.accept(ChaosketModItems.BLUE_STROHHUT_HELMET.get());
				tabData.accept(ChaosketModItems.WHITE_STROHHUT_HELMET.get());
				tabData.accept(ChaosketModItems.BLACK_STROHHUT_HELMET.get());
				tabData.accept(ChaosketModItems.SHRINKDEVICE.get());
				tabData.accept(ChaosketModBlocks.LASERBRIGE.get().asItem());
				tabData.accept(ChaosketModBlocks.LASERBRIGEPROJECTOR.get().asItem());
				tabData.accept(ChaosketModBlocks.JAIL_DOOR.get().asItem());
				tabData.accept(ChaosketModBlocks.TRAVEL_ANCHORBLOCK.get().asItem());
				tabData.accept(ChaosketModBlocks.ENDANCHOR.get().asItem());
				tabData.accept(ChaosketModItems.STOPSHADER.get());
				tabData.accept(ChaosketModItems.SOBEL.get());
				tabData.accept(ChaosketModItems.OUTLINE.get());
				tabData.accept(ChaosketModItems.NOTCH.get());
				tabData.accept(ChaosketModBlocks.CHAOSALTAR.get().asItem());
				tabData.accept(ChaosketModItems.LOADSTONEBLOOM.get());
				tabData.accept(ChaosketModItems.TRAVEL_ARMOR_HELMET.get());
				tabData.accept(ChaosketModItems.TRAVEL_ARMOR_CHESTPLATE.get());
				tabData.accept(ChaosketModItems.TRAVEL_ARMOR_LEGGINGS.get());
				tabData.accept(ChaosketModItems.TRAVEL_ARMOR_BOOTS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ChaosketModItems.PINGUIN_SPAWN_EGG.get());
		}
	}
}
