package com.kingili.items.item;

import com.kingili.items.Items;
import com.kingili.items.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
                    () -> new Item(new Item.Properties().group(Items.ITEMS_TAB).setNoRepair()));
    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire",
                    () -> new Item(new Item.Properties().group(Items.ITEMS_TAB).maxStackSize(16)));
    public static final RegistryObject<Item> WOOD_SPEAR =
            Registration.ITEMS.register("wood_spear",
                    () -> new Item(new Item.Properties().group(Items.ITEMS_TAB).maxStackSize(1)));
    public static final RegistryObject<Item> IRON_SPEARHEAD =
            Registration.ITEMS.register("iron_spearhead",
                    () -> new Item(new Item.Properties().group(Items.ITEMS_TAB).maxStackSize(16)));
    public static void register() { }

}
