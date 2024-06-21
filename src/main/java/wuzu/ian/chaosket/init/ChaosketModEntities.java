
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.entity.PinguinEntity;
import wuzu.ian.chaosket.entity.Pauk2GODEntity;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChaosketModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChaosketMod.MODID);
	public static final RegistryObject<EntityType<PinguinEntity>> PINGUIN = register("pinguin",
			EntityType.Builder.<PinguinEntity>of(PinguinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PinguinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pauk2GODEntity>> PAUK_2_GOD = register("pauk_2_god",
			EntityType.Builder.<Pauk2GODEntity>of(Pauk2GODEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pauk2GODEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PinguinEntity.init();
			Pauk2GODEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PINGUIN.get(), PinguinEntity.createAttributes().build());
		event.put(PAUK_2_GOD.get(), Pauk2GODEntity.createAttributes().build());
	}
}
