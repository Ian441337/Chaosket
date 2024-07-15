
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ChaosketModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChaosketMod.MODID);
	public static final RegistryObject<CreativeModeTab> CHAOS_KET = REGISTRY.register("chaos_ket",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chaosket.chaos_ket")).icon(() -> new ItemStack(ChaosketModItems.ITEMCREATIVE_TAB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChaosketModBlocks.BASALT.get().asItem());
				tabData.accept(ChaosketModBlocks.DATABLOCK.get().asItem());
				tabData.accept(ChaosketModBlocks.DER_HOSEN_TEPPICH.get().asItem());
				tabData.accept(ChaosketModBlocks.LASERBRIGEPROJECTOR.get().asItem());
				tabData.accept(ChaosketModBlocks.TRAVEL_ANCHORBLOCK.get().asItem());
				tabData.accept(ChaosketModBlocks.ENDANCHOR.get().asItem());
				tabData.accept(ChaosketModBlocks.CHAOSALTAR.get().asItem());
				tabData.accept(ChaosketModItems.STAFFOFTRAVELING.get());
				tabData.accept(ChaosketModBlocks.JAIL_DOOR.get().asItem());
				tabData.accept(ChaosketModItems.RED_STROHHUT_HELMET.get());
				tabData.accept(ChaosketModItems.PAUK_2_GOD_SPAWN_EGG.get());
				tabData.accept(ChaosketModItems.FIREFLY_SPAWN_EGG.get());
				tabData.accept(ChaosketModItems.SOUL_FIREFLY_SPAWN_EGG.get());
				tabData.accept(ChaosketModItems.PINGUIN_SPAWN_EGG.get());
				tabData.accept(ChaosketModBlocks.LOSTSPACELASERBRIGE.get().asItem());
				tabData.accept(ChaosketModBlocks.LASERBRIGE.get().asItem());
				tabData.accept(ChaosketModItems.STOPSHADER.get());
				tabData.accept(ChaosketModItems.SOBEL.get());
				tabData.accept(ChaosketModItems.SIREN.get());
			})

					.build());
}
