package com.essk.levermod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block myBlock;

    public static void createBlocks(){
            GameRegistry.registerBlock(myBlock = new BasicBlock("my_block").setLightLevel(1.0f), "my_block");
    }
}
