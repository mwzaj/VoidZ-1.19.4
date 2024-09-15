package net.voidz.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemInit {
    // Item Group
    public static final ItemGroup VOIDZ_ITEM_GROUP = FabricItemGroup.builder(new Identifier("voidz", "item_group"))
            .build();

    public static void init() {

    }
}
