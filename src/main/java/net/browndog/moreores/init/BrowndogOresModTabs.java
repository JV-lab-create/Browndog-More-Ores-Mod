
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndog.moreores.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class BrowndogOresModTabs {
	public static CreativeModeTab TAB_ORE_CREATIVE_TAB;

	public static void load() {
		TAB_ORE_CREATIVE_TAB = FabricItemGroupBuilder.create(new ResourceLocation("browndog_ores", "ore_creative_tab")).icon(() -> new ItemStack(BrowndogOresModItems.PLATINUM_INGOT)).build();
	}
}
