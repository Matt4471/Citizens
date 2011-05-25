package com.fullwall.Citizens;

import com.fullwall.Citizens.Economy.EconomyHandler;
import com.fullwall.Citizens.Interfaces.Storage;
import com.fullwall.Citizens.Properties.Properties.UtilityProperties;

public class Constants {
	public static int tickDelay = 1;
	public static int saveDelay = 72000;
	public static int maxNPCsPerPlayer = 10;
	public static int healerGiveHealthItem = 35;
	public static int healerTakeHealthItem = 276;
	public static int wizardMaxLocations = 10;
	public static int wizardInteractItem = 288;
	public static int evilNPCTameItem = 354;
	public static int healerHealthRegenIncrement = 12000;
	public static int banditStealRadius = 5;
	public static int maxStationaryTicks = 25;
	public static int maxPathingTicks = -1;

	public static double npcRange = 5;
	public static double defaultBouncerProtectionRadius = 10;
	public static final double JUMP_FACTOR = 0.1D;
	public static final double GRAVITY = 0.02D;
	public static final double PATH_LEEWAY = 0.5D;

	public static float pathFindingRange = 16F;

	public static String chatFormat = "[%name%]: ";
	public static String convertToSpaceChar = "/";
	public static String npcColour = "�f";

	public static boolean convertSlashes = false;
	public static boolean defaultFollowingEnabled = true;
	public static boolean defaultTalkWhenClose = false;
	public static boolean saveOften = true;
	public static boolean useItemList = true;
	public static boolean useNPCColours = true;
	public static boolean useSaveTask = true;

	/**
	 * Sets up miscellaneous variables, mostly reading from property files.
	 */
	public static void setupVariables() {
		EconomyHandler.setUpVariables();
		Storage settings = UtilityProperties.settings;

		// Boolean defaults
		convertSlashes = settings.getBoolean("general.chat.slashes-to-spaces");
		defaultFollowingEnabled = settings
				.getBoolean("general.defaults.enable-following");
		defaultTalkWhenClose = settings
				.getBoolean("general.defaults.talk-when-close");
		useNPCColours = settings.getBoolean("general.colors.use-npc-colours");
		useItemList = settings.getBoolean("items.item-list-on");
		saveOften = settings.getBoolean("ticks.saving.save-often");
		useSaveTask = settings.getBoolean("ticks.saving.use-task");

		// String defaults
		chatFormat = settings.getString("general.chat.format");
		npcColour = UtilityProperties.settings
				.getString("general.colors.npc-colour");

		// Double defaults
		defaultBouncerProtectionRadius = settings
				.getDouble("range.guards.default-bouncer-protection-radius");
		npcRange = settings.getDouble("range.basic.look");
		pathFindingRange = (float) settings
				.getDouble("range.guards.pathfinding");

		// int defaults
		banditStealRadius = settings.getInt("range.bandits.steal-radius");
		maxNPCsPerPlayer = settings.getInt("general.npcs-per-player");
		evilNPCTameItem = settings.getInt("items.evil.tame-item");
		healerGiveHealthItem = settings
				.getInt("items.healers.give-health-item");
		healerTakeHealthItem = settings
				.getInt("items.healers.take-health-item");
		wizardMaxLocations = settings
				.getInt("general.wizards.wizard-max-locations");
		wizardInteractItem = settings.getInt("items.wizards.interact-item");
		healerHealthRegenIncrement = settings
				.getInt("ticks.healers.health-regen-increment");
		maxPathingTicks = settings.getInt("ticks.pathing.max-pathing");
		maxStationaryTicks = settings.getInt("ticks.pathing.max-stationary");
		saveDelay = settings.getInt("ticks.saving.delay");
		tickDelay = settings.getInt("ticks.general.delay");
	}
}