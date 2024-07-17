
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.entity.SoulFireflyEntity;
import wuzu.ian.chaosket.entity.PinguinEntity;
import wuzu.ian.chaosket.entity.Pauk2GODEntity;
import wuzu.ian.chaosket.entity.FireflyEntity;
import wuzu.ian.chaosket.entity.ArmorflyEntity;
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
	public static final RegistryObject<EntityType<Pauk2GODEntity>> PAUK_2_GOD = register("pauk_2_god",
			EntityType.Builder.<Pauk2GODEntity>of(Pauk2GODEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pauk2GODEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireflyEntity>> FIREFLY = register("firefly",
			EntityType.Builder.<FireflyEntity>of(FireflyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireflyEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<SoulFireflyEntity>> SOUL_FIREFLY = register("soul_firefly",
			EntityType.Builder.<SoulFireflyEntity>of(SoulFireflyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoulFireflyEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PinguinEntity>> PINGUIN = register("pinguin",
			EntityType.Builder.<PinguinEntity>of(PinguinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PinguinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ArmorflyEntity>> ARMORFLY = register("armorfly",
			EntityType.Builder.<ArmorflyEntity>of(ArmorflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(ArmorflyEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Pauk2GODEntity.init();
			FireflyEntity.init();
			SoulFireflyEntity.init();
			PinguinEntity.init();
			ArmorflyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PAUK_2_GOD.get(), Pauk2GODEntity.createAttributes().build());
		event.put(FIREFLY.get(), FireflyEntity.createAttributes().build());
		event.put(SOUL_FIREFLY.get(), SoulFireflyEntity.createAttributes().build());
		event.put(PINGUIN.get(), PinguinEntity.createAttributes().build());
		event.put(ARMORFLY.get(), ArmorflyEntity.createAttributes().build());
	}
}
