package com.essk.levermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item myItem;
    public static void createItems(){
        // this might work better
        // GameRegistry.register(myItem = new BasicItem("my_item").setUnlocalizedName("my_item"));
        GameRegistry.registerItem(myItem = new BasicItem("my_item"), "my_item");
    }
}
