
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aftercraftcore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.aftercraftcore.block.entity.ResearchBenchBlockEntity;
import net.mcreator.aftercraftcore.AftercraftCoreMod;

public class AftercraftCoreModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			AftercraftCoreMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> RESEARCH_BENCH = register("research_bench", AftercraftCoreModBlocks.RESEARCH_BENCH,
			ResearchBenchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
