/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.devilswarchild.blockparty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.devilswarchild.blockparty.BlockPartyMod;

public class BlockPartyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockPartyMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOCK_PARTY = REGISTRY.register("block_party",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.block_party.block_party")).icon(() -> new ItemStack(BlockPartyModItems.BEACH_DAYS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BlockPartyModItems.BLANK_DISC.get());
				tabData.accept(BlockPartyModItems.BEACH_DAYS.get());
				tabData.accept(BlockPartyModItems.BEACH_SUNSET.get());
				tabData.accept(BlockPartyModItems.BEYOND_THE_BLOCK.get());
				tabData.accept(BlockPartyModItems.BLOCK_BEAT_ODYSSEY.get());
				tabData.accept(BlockPartyModItems.BLOCK_KING.get());
				tabData.accept(BlockPartyModItems.BUILDERS_OF_TITANS.get());
				tabData.accept(BlockPartyModItems.BUILDING_DREAMS_IN_THE_WILD.get());
				tabData.accept(BlockPartyModItems.BUILDING_OUR_TOMORROW.get());
				tabData.accept(BlockPartyModItems.COZY_CAFE.get());
				tabData.accept(BlockPartyModItems.DIMENSIONAL_ODYSSEY.get());
				tabData.accept(BlockPartyModItems.DISCO_BLOCKS.get());
				tabData.accept(BlockPartyModItems.DREAMING_IN_DIMENSIONS.get());
				tabData.accept(BlockPartyModItems.DREAMING_IN_PIXELS.get());
				tabData.accept(BlockPartyModItems.ENDERS_END.get());
				tabData.accept(BlockPartyModItems.ENERGY_SURGE.get());
				tabData.accept(BlockPartyModItems.FORGE_OF_THE_LOST_REALMS.get());
				tabData.accept(BlockPartyModItems.JIVE_IN_THE_COLONIES.get());
				tabData.accept(BlockPartyModItems.MYSTICAL_FOREST.get());
				tabData.accept(BlockPartyModItems.NEON_DREAMS.get());
				tabData.accept(BlockPartyModItems.NETHER_REVERIE.get());
				tabData.accept(BlockPartyModItems.PIXEL_DREAMS.get());
				tabData.accept(BlockPartyModItems.PIXEL_ECHOES.get());
				tabData.accept(BlockPartyModItems.PIXEL_SURGE.get());
				tabData.accept(BlockPartyModItems.PIXELATED_QUEST.get());
				tabData.accept(BlockPartyModItems.PIXELS_IN_MOTION.get());
				tabData.accept(BlockPartyModItems.ROCK_THE_COLONIES.get());
				tabData.accept(BlockPartyModItems.RUINS_OF_THE_NETHER.get());
				tabData.accept(BlockPartyModItems.SWINGIN_IN_THE_COLONIES.get());
				tabData.accept(BlockPartyModItems.VALLEY_OF_THE_ENDER.get());
				tabData.accept(BlockPartyModItems.WHISPERS_IN_THE_BLOCKS.get());
				tabData.accept(BlockPartyModBlocks.JUKE_BOX.get().asItem());
			}).build());
}