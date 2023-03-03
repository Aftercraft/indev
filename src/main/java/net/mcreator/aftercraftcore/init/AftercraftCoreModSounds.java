
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aftercraftcore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aftercraftcore.AftercraftCoreMod;

public class AftercraftCoreModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AftercraftCoreMod.MODID);
	public static final RegistryObject<SoundEvent> KOKUSAIKEDIT = REGISTRY.register("kokusaikedit",
			() -> new SoundEvent(new ResourceLocation("aftercraft_core", "kokusaikedit")));
}
