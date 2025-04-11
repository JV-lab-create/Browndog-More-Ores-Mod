
package net.browndog.moreores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.browndog.moreores.init.BrowndogOresModItems;

public class SteelAxeItem extends AxeItem {
	public SteelAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 953;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 21f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 36;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BrowndogOresModItems.STEEL_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
