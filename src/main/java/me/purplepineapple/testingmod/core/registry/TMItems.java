package me.purplepineapple.testingmod.core.registry;

import me.purplepineapple.testingmod.TestingMod;
import me.purplepineapple.testingmod.common.items.TMItemTier;
import me.purplepineapple.testingmod.core.itemgroup.TMItemGroup;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TMItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> PINK_STONE_SWORD = ITEMS.register("pink_stone_sword", () ->
            new SwordItem(TMItemTier.PINK_STONE, 3, -2.4f, new Item.Properties().group(TMItemGroup.TEST_MOD)));
    public static final RegistryObject<Item> PINK_STONE_PICKAXE = ITEMS.register("pink_stone_pickaxe", () ->
            new PickaxeItem(TMItemTier.PINK_STONE, 1, -2.8F, new Item.Properties().group(TMItemGroup.TEST_MOD)));
    public static final RegistryObject<Item> PINK_STONE_SHOVEL = ITEMS.register("pink_stone_shovel", () ->
            new ShovelItem(TMItemTier.PINK_STONE, 1.5F, -3.0F, new Item.Properties().group(TMItemGroup.TEST_MOD)));
    public static final RegistryObject<Item> PINK_STONE_AXE = ITEMS.register("pink_stone_axe", () ->
            new AxeItem(TMItemTier.PINK_STONE, 7.0F, -3.2F, new Item.Properties().group(TMItemGroup.TEST_MOD)));
    public static final RegistryObject<Item> PINK_STONE_HOE = ITEMS.register("pink_stone_hoe", () ->
            new HoeItem(TMItemTier.PINK_STONE, -1, -2.0F, new Item.Properties().group(TMItemGroup.TEST_MOD)));


    // Block Items
    public static final RegistryObject<Item> PINK_STONE = ITEMS.register("pink_stone", () ->
            new BlockItem(TMBlocks.PINK_STONE.get(), new Item.Properties().group(TMItemGroup.TEST_MOD)));
    public static final RegistryObject<Item> PINK_STAR_FLOWER = ITEMS.register("pink_star_flower", () ->
            new BlockItem(TMBlocks.PINK_STAR_FLOWER.get(), new Item.Properties().group(TMItemGroup.TEST_MOD)));
    public static final RegistryObject<Item> TALL_PINK_STAR_FLOWER = ITEMS.register("tall_pink_star_flower", () ->
            new BlockItem(TMBlocks.TALL_PINK_STAR_FLOWER.get(), new Item.Properties().group(TMItemGroup.TEST_MOD)));
    public static final RegistryObject<Item> PINK_VINE = ITEMS.register("pink_vine", () ->
            new BlockItem(TMBlocks.PINK_VINE.get(), new Item.Properties().group(TMItemGroup.TEST_MOD)));


}
