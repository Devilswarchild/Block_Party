/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.devilswarchild.blockparty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.devilswarchild.blockparty.block.JukeBoxBlock;
import net.devilswarchild.blockparty.BlockPartyMod;

public class BlockPartyModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BlockPartyMod.MODID);
	public static final DeferredBlock<Block> JUKE_BOX;
	static {
		JUKE_BOX = REGISTRY.register("juke_box", JukeBoxBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}