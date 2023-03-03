
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aftercraftcore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aftercraftcore.item.SwordTemplateItem;
import net.mcreator.aftercraftcore.item.ShovelTemplateItem;
import net.mcreator.aftercraftcore.item.PickTemplateItem;
import net.mcreator.aftercraftcore.item.IronSwordBilletItem;
import net.mcreator.aftercraftcore.item.IronShovelBilletItem;
import net.mcreator.aftercraftcore.item.IronPickBilletItem;
import net.mcreator.aftercraftcore.item.IronHoeBilletItem;
import net.mcreator.aftercraftcore.item.IronBilletItem;
import net.mcreator.aftercraftcore.item.IronAxeBilletItem;
import net.mcreator.aftercraftcore.item.HotIronSwordBilletItem;
import net.mcreator.aftercraftcore.item.HotIronIngotItem;
import net.mcreator.aftercraftcore.item.HotIronBilletItem;
import net.mcreator.aftercraftcore.item.HoeTemplateItem;
import net.mcreator.aftercraftcore.item.GreenhouseEditItem;
import net.mcreator.aftercraftcore.item.ForgingHammerItem;
import net.mcreator.aftercraftcore.item.AxeTemplateItem;
import net.mcreator.aftercraftcore.AftercraftCoreMod;

public class AftercraftCoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AftercraftCoreMod.MODID);
	public static final RegistryObject<Item> RESEARCH_BENCH = block(AftercraftCoreModBlocks.RESEARCH_BENCH, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRON_SWORD_BILLET = REGISTRY.register("iron_sword_billet", () -> new IronSwordBilletItem());
	public static final RegistryObject<Item> IRON_PICK_BILLET = REGISTRY.register("iron_pick_billet", () -> new IronPickBilletItem());
	public static final RegistryObject<Item> IRON_AXE_BILLET = REGISTRY.register("iron_axe_billet", () -> new IronAxeBilletItem());
	public static final RegistryObject<Item> FORGING_HAMMER = REGISTRY.register("forging_hammer", () -> new ForgingHammerItem());
	public static final RegistryObject<Item> HOT_IRON_INGOT = REGISTRY.register("hot_iron_ingot", () -> new HotIronIngotItem());
	public static final RegistryObject<Item> HOT_IRON_BILLET = REGISTRY.register("hot_iron_billet", () -> new HotIronBilletItem());
	public static final RegistryObject<Item> IRON_BILLET = REGISTRY.register("iron_billet", () -> new IronBilletItem());
	public static final RegistryObject<Item> HOT_IRON_SWORD_BILLET = REGISTRY.register("hot_iron_sword_billet", () -> new HotIronSwordBilletItem());
	public static final RegistryObject<Item> GREENHOUSE_EDIT = REGISTRY.register("greenhouse_edit", () -> new GreenhouseEditItem());
	public static final RegistryObject<Item> SWORD_TEMPLATE = REGISTRY.register("sword_template", () -> new SwordTemplateItem());
	public static final RegistryObject<Item> PICK_TEMPLATE = REGISTRY.register("pick_template", () -> new PickTemplateItem());
	public static final RegistryObject<Item> AXE_TEMPLATE = REGISTRY.register("axe_template", () -> new AxeTemplateItem());
	public static final RegistryObject<Item> SHOVEL_TEMPLATE = REGISTRY.register("shovel_template", () -> new ShovelTemplateItem());
	public static final RegistryObject<Item> HOE_TEMPLATE = REGISTRY.register("hoe_template", () -> new HoeTemplateItem());
	public static final RegistryObject<Item> IRON_SHOVEL_BILLET = REGISTRY.register("iron_shovel_billet", () -> new IronShovelBilletItem());
	public static final RegistryObject<Item> IRON_HOE_BILLET = REGISTRY.register("iron_hoe_billet", () -> new IronHoeBilletItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
