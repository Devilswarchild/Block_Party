/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.devilswarchild.blockparty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.devilswarchild.blockparty.item.*;
import net.devilswarchild.blockparty.BlockPartyMod;

public class BlockPartyModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BlockPartyMod.MODID);
	public static final DeferredItem<Item> BLANK_DISC;
	public static final DeferredItem<Item> JUKE_BOX;
	public static final DeferredItem<Item> COZY_CAFE;
	public static final DeferredItem<Item> BEACH_DAYS;
	public static final DeferredItem<Item> BEACH_SUNSET;
	public static final DeferredItem<Item> BEYOND_THE_BLOCK;
	public static final DeferredItem<Item> BLOCK_BEAT_ODYSSEY;
	public static final DeferredItem<Item> BUILDERS_OF_TITANS;
	public static final DeferredItem<Item> BLOCK_KING;
	public static final DeferredItem<Item> BUILDING_DREAMS_IN_THE_WILD;
	public static final DeferredItem<Item> BUILDING_OUR_TOMORROW;
	public static final DeferredItem<Item> DIMENSIONAL_ODYSSEY;
	public static final DeferredItem<Item> DISCO_BLOCKS;
	public static final DeferredItem<Item> DREAMING_IN_DIMENSIONS;
	public static final DeferredItem<Item> DREAMING_IN_PIXELS;
	public static final DeferredItem<Item> ENDERS_END;
	public static final DeferredItem<Item> ENERGY_SURGE;
	public static final DeferredItem<Item> JIVE_IN_THE_COLONIES;
	public static final DeferredItem<Item> FORGE_OF_THE_LOST_REALMS;
	public static final DeferredItem<Item> MYSTICAL_FOREST;
	public static final DeferredItem<Item> NEON_DREAMS;
	public static final DeferredItem<Item> NETHER_REVERIE;
	public static final DeferredItem<Item> PIXEL_DREAMS;
	public static final DeferredItem<Item> PIXEL_ECHOES;
	public static final DeferredItem<Item> PIXEL_SURGE;
	public static final DeferredItem<Item> PIXELATED_QUEST;
	public static final DeferredItem<Item> PIXELS_IN_MOTION;
	public static final DeferredItem<Item> ROCK_THE_COLONIES;
	public static final DeferredItem<Item> RUINS_OF_THE_NETHER;
	public static final DeferredItem<Item> SWINGIN_IN_THE_COLONIES;
	public static final DeferredItem<Item> VALLEY_OF_THE_ENDER;
	public static final DeferredItem<Item> WHISPERS_IN_THE_BLOCKS;
	static {
		BLANK_DISC = REGISTRY.register("blank_disc", BlankDiscItem::new);
		JUKE_BOX = block(BlockPartyModBlocks.JUKE_BOX);
		COZY_CAFE = REGISTRY.register("cozy_cafe", CozyCafeItem::new);
		BEACH_DAYS = REGISTRY.register("beach_days", BeachDaysItem::new);
		BEACH_SUNSET = REGISTRY.register("beach_sunset", BeachSunsetItem::new);
		BEYOND_THE_BLOCK = REGISTRY.register("beyond_the_block", BeyondTheBlockItem::new);
		BLOCK_BEAT_ODYSSEY = REGISTRY.register("block_beat_odyssey", BlockBeatOdysseyItem::new);
		BUILDERS_OF_TITANS = REGISTRY.register("builders_of_titans", BuildersOfTitansItem::new);
		BLOCK_KING = REGISTRY.register("block_king", BlockKingItem::new);
		BUILDING_DREAMS_IN_THE_WILD = REGISTRY.register("building_dreams_in_the_wild", BuildingDreamsInTheWildItem::new);
		BUILDING_OUR_TOMORROW = REGISTRY.register("building_our_tomorrow", BuildingOurTomorrowItem::new);
		DIMENSIONAL_ODYSSEY = REGISTRY.register("dimensional_odyssey", DimensionalOdysseyItem::new);
		DISCO_BLOCKS = REGISTRY.register("disco_blocks", DiscoBlocksItem::new);
		DREAMING_IN_DIMENSIONS = REGISTRY.register("dreaming_in_dimensions", DreamingInDimensionsItem::new);
		DREAMING_IN_PIXELS = REGISTRY.register("dreaming_in_pixels", DreamingInPixelsItem::new);
		ENDERS_END = REGISTRY.register("enders_end", EndersEndItem::new);
		ENERGY_SURGE = REGISTRY.register("energy_surge", EnergySurgeItem::new);
		JIVE_IN_THE_COLONIES = REGISTRY.register("jive_in_the_colonies", JiveInTheColoniesItem::new);
		FORGE_OF_THE_LOST_REALMS = REGISTRY.register("forge_of_the_lost_realms", ForgeOfTheLostRealmsItem::new);
		MYSTICAL_FOREST = REGISTRY.register("mystical_forest", MysticalForestItem::new);
		NEON_DREAMS = REGISTRY.register("neon_dreams", NeonDreamsItem::new);
		NETHER_REVERIE = REGISTRY.register("nether_reverie", NetherReverieItem::new);
		PIXEL_DREAMS = REGISTRY.register("pixel_dreams", PixelDreamsItem::new);
		PIXEL_ECHOES = REGISTRY.register("pixel_echoes", PixelEchoesItem::new);
		PIXEL_SURGE = REGISTRY.register("pixel_surge", PixelSurgeItem::new);
		PIXELATED_QUEST = REGISTRY.register("pixelated_quest", PixelatedQuestItem::new);
		PIXELS_IN_MOTION = REGISTRY.register("pixels_in_motion", PixelsInMotionItem::new);
		ROCK_THE_COLONIES = REGISTRY.register("rock_the_colonies", RockTheColoniesItem::new);
		RUINS_OF_THE_NETHER = REGISTRY.register("ruins_of_the_nether", RuinsOfTheNetherItem::new);
		SWINGIN_IN_THE_COLONIES = REGISTRY.register("swingin_in_the_colonies", SwinginInTheColoniesItem::new);
		VALLEY_OF_THE_ENDER = REGISTRY.register("valley_of_the_ender", ValleyOfTheEnderItem::new);
		WHISPERS_IN_THE_BLOCKS = REGISTRY.register("whispers_in_the_blocks", WhispersInTheBlocksItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}