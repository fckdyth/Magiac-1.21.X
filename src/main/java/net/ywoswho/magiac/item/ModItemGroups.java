package net.ywoswho.magiac.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ywoswho.magiac.Magiac;
import net.ywoswho.magiac.block.ModBlocks;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> MAGIAC_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of(Magiac.MOD_ID, "item_group")
    );

    public static final ItemGroup MAGIAC_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.SUSPICIOUS_SUBSTANCE))
            .displayName(Text.translatable("itemGroup.magiac"))
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, MAGIAC_ITEM_GROUP_KEY, MAGIAC_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(MAGIAC_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE);
            itemGroup.add(ModBlocks.CONDENSED_DIRT);
        });
    }
}
