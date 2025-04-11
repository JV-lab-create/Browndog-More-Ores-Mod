
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndog.moreores.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.browndog.moreores.world.features.ores.ZinkOreFeature;
import net.browndog.moreores.world.features.ores.YellowDiamondOreFeature;
import net.browndog.moreores.world.features.ores.TopazOreFeature;
import net.browndog.moreores.world.features.ores.TitaniumOreFeature;
import net.browndog.moreores.world.features.ores.TinOreFeature;
import net.browndog.moreores.world.features.ores.TanzaniteOreFeature;
import net.browndog.moreores.world.features.ores.SteelOreFeature;
import net.browndog.moreores.world.features.ores.SliverOreFeature;
import net.browndog.moreores.world.features.ores.SapphireOreFeature;
import net.browndog.moreores.world.features.ores.RubyOreFeature;
import net.browndog.moreores.world.features.ores.Red_DiamondOreFeature;
import net.browndog.moreores.world.features.ores.PurpleDiamondOreFeature;
import net.browndog.moreores.world.features.ores.PlatinumOreFeature;
import net.browndog.moreores.world.features.ores.OrangeDiamondOreFeature;
import net.browndog.moreores.world.features.ores.OpalOreFeature;
import net.browndog.moreores.world.features.ores.NickelOreFeature;
import net.browndog.moreores.world.features.ores.LuminousGemOreFeature;
import net.browndog.moreores.world.features.ores.LithiumOreFeature;
import net.browndog.moreores.world.features.ores.GreenDiamondOreFeature;
import net.browndog.moreores.world.features.ores.BlueDiamondOreFeature;
import net.browndog.moreores.world.features.ores.BlackDiamondOreFeature;
import net.browndog.moreores.world.features.ores.AetheriumOreFeature;
import net.browndog.moreores.BrowndogOresMod;

import java.util.function.Predicate;

public class BrowndogOresModFeatures {
	public static void load() {
		register("aetherium_ore", AetheriumOreFeature.feature(), AetheriumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("sliver_ore", SliverOreFeature.feature(), SliverOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("steel_ore", SteelOreFeature.feature(), SteelOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("nickel_ore", NickelOreFeature.feature(), NickelOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("ruby_ore", RubyOreFeature.feature(), RubyOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("sapphire_ore", SapphireOreFeature.feature(), SapphireOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("topaz_ore", TopazOreFeature.feature(), TopazOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("opal_ore", OpalOreFeature.feature(), OpalOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("titanium_ore", TitaniumOreFeature.feature(), TitaniumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("tanzanite_ore", TanzaniteOreFeature.feature(), TanzaniteOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("luminous_gem_ore", LuminousGemOreFeature.feature(), LuminousGemOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("zink_ore", ZinkOreFeature.feature(), ZinkOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lithium_ore", LithiumOreFeature.feature(), LithiumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("tin_ore", TinOreFeature.feature(), TinOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("platinum_ore", PlatinumOreFeature.feature(), PlatinumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("red_diamond_ore", Red_DiamondOreFeature.feature(), Red_DiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("orange_diamond_ore", OrangeDiamondOreFeature.feature(), OrangeDiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("yellow_diamond_ore", YellowDiamondOreFeature.feature(), YellowDiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("black_diamond_ore", BlackDiamondOreFeature.feature(), BlackDiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("green_diamond_ore", GreenDiamondOreFeature.feature(), GreenDiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("blue_diamond_ore", BlueDiamondOreFeature.feature(), BlueDiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("purple_diamond_ore", PurpleDiamondOreFeature.feature(), PurpleDiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(BrowndogOresMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(BrowndogOresMod.MODID, registryName)));
	}
}
