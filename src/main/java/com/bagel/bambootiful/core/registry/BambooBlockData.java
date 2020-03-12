package com.bagel.bambootiful.core.registry;

import com.bagel.bambootiful.core.util.DataUtils;

public class BambooBlockData {
	public static void registerCompostables() {
		DataUtils.registerCompostable(0.65F, BambooBlocks.THATCH.get());
	}
	
	public static void registerFlammables() {
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_PILLAR.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.VERTICAL_BAMBOO_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_VERTICAL_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_BOOKSHELF.get(), 5, 20);
		
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_PILLAR.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.VERTICAL_DRIED_BAMBOO_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_VERTICAL_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.DRIED_BAMBOO_BOOKSHELF.get(), 5, 20);
		
		DataUtils.registerFlammable(BambooBlocks.THATCH.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.THATCH_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.THATCH_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.THATCH_VERTICAL_SLAB.get(), 5, 20);
	}
}
