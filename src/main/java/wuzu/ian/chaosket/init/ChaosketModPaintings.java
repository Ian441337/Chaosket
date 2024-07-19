
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class ChaosketModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ChaosketMod.MODID);
	public static final RegistryObject<PaintingVariant> WANTED = REGISTRY.register("wanted", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> LANDSCAPE = REGISTRY.register("landscape", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> SKY = REGISTRY.register("sky", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> PAUL_2MICESSEN = REGISTRY.register("paul_2micessen", () -> new PaintingVariant(48, 32));
	public static final RegistryObject<PaintingVariant> PAUL_2_LOGO = REGISTRY.register("paul_2_logo", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> PAUL_2_LOGO_2 = REGISTRY.register("paul_2_logo_2", () -> new PaintingVariant(32, 32));
}
