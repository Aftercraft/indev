
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aftercraftcore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.aftercraftcore.world.inventory.ResearchBenchGUIMenu;
import net.mcreator.aftercraftcore.AftercraftCoreMod;

public class AftercraftCoreModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AftercraftCoreMod.MODID);
	public static final RegistryObject<MenuType<ResearchBenchGUIMenu>> RESEARCH_BENCH_GUI = REGISTRY.register("research_bench_gui",
			() -> IForgeMenuType.create(ResearchBenchGUIMenu::new));
}
