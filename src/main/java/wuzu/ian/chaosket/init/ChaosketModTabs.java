
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
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chaosket.chaos_ket")).icon(() -> new ItemStack(ChaosketModBlocks.TRAVELANCHORBLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChaosketModBlocks.JAILDOOR.get().asItem());
				tabData.accept(ChaosketModBlocks.TRAVELANCHORBLOCK.get().asItem());
				tabData.accept(ChaosketModItems.STAFFOFTRAVELING.get());
				tabData.accept(ChaosketModItems.RED_STROHHUT_HELMET.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ChaosketModItems.PINGUIN_SPAWN_EGG.get());
		}
	}
}
