/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.browndog.moreores;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import net.browndog.moreores.init.BrowndogOresModTabs;
import net.browndog.moreores.init.BrowndogOresModItems;
import net.browndog.moreores.init.BrowndogOresModFeatures;
import net.browndog.moreores.init.BrowndogOresModBlocks;

public class BrowndogOresMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "browndog_ores";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing BrowndogOresMod");

		BrowndogOresModTabs.load();

		BrowndogOresModBlocks.load();
		BrowndogOresModItems.load();

		BrowndogOresModFeatures.load();

	}
}
