package net.devilswarchild.blockparty.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.devilswarchild.blockparty.BlockPartyMod;

public class CozyCafeItem extends Item {
	public CozyCafeItem() {
		super(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(BlockPartyMod.MODID, "cozy_cafe"))));
	}
}