package me.purplepineapple.testingmod.core.itemgroup;

import me.purplepineapple.testingmod.core.registry.TMBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TMItemGroup extends ItemGroup {

    public static final ItemGroup TEST_MOD = new TMItemGroup("test_mod");

    public TMItemGroup(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return TMBlocks.PINK_STONE.get().asItem().getDefaultInstance();
    }
}
