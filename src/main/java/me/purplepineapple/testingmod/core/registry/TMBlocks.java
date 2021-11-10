package me.purplepineapple.testingmod.core.registry;

import me.purplepineapple.testingmod.TestingMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * MCP Methods to Mojmaps:
 * #create -> #of
 * #hardnessAndResistance -> #strength
 * Material#ROCK -> Material#STONE
 */
public class TMBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestingMod.MOD_ID); // Create Deferred Register

    // Block Objects to be Registered in Main Class | .create -> mojmaps -> .of

    // Stone block duplicate
    public static final RegistryObject<Block> PINK_STONE = BLOCKS.register("pink_stone", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().hardnessAndResistance(1.5f, 6f)));

}
