
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.world.inventory.TravelanchorMenu;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class ChaosketModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ChaosketMod.MODID);
	public static final RegistryObject<MenuType<TravelanchorMenu>> TRAVELANCHOR = REGISTRY.register("travelanchor", () -> IForgeMenuType.create(TravelanchorMenu::new));
}
