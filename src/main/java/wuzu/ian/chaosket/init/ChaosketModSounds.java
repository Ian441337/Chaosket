
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ChaosketModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChaosketMod.MODID);
	public static final RegistryObject<SoundEvent> LASER = REGISTRY.register("laser", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chaosket", "laser")));
	public static final RegistryObject<SoundEvent> IMMER_DABEI = REGISTRY.register("immer_dabei", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chaosket", "immer_dabei")));
}
