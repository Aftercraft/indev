
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aftercraftcore.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.aftercraftcore.client.gui.ResearchBenchGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AftercraftCoreModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AftercraftCoreModMenus.RESEARCH_BENCH_GUI.get(), ResearchBenchGUIScreen::new);
		});
	}
}
