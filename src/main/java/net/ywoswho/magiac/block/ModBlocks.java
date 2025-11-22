package net.ywoswho.magiac.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ywoswho.magiac.Magiac;

public class ModBlocks {
    public static final Block CONDENSED_DIRT = register(
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)),
            "condensed_dirt"
    );

    public static Block register(Block block, String name) {
        Identifier id = Identifier.of(Magiac.MOD_ID, name);

        Registry.register(Registries.ITEM, Identifier.of(Magiac.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(itemGroup -> {
                    itemGroup.add(CONDENSED_DIRT);
                });
    }
}
