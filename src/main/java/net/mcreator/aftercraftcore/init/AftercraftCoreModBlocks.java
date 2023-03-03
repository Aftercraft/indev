
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aftercraftcore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.aftercraftcore.block.ResearchBenchBlock;
import net.mcreator.aftercraftcore.AftercraftCoreMod;

public class AftercraftCoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AftercraftCoreMod.MODID);
	public static final RegistryObject<Block> RESEARCH_BENCH = REGISTRY.register("research_bench", () -> new ResearchBenchBlock());
}
