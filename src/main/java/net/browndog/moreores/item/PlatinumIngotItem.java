
package net.browndog.moreores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.browndog.moreores.init.BrowndogOresModTabs;

public class PlatinumIngotItem extends Item {
	public PlatinumIngotItem() {
		super(new Item.Properties().tab(BrowndogOresModTabs.TAB_ORE_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
