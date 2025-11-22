package net.ywoswho.magiac.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ywoswho.magiac.Magiac;

public class ModItems {
    public static final Item SUSPICIOUS_SUBSTANCE = register(new Item(new Item.Settings()), "suspicious_substance");

    public static Item register(Item item, String id) {
        return Registry.register(Registries.ITEM, Identifier.of(Magiac.MOD_ID, id), item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(itemGroup -> {
                    itemGroup.add(SUSPICIOUS_SUBSTANCE);
                });
    }
}