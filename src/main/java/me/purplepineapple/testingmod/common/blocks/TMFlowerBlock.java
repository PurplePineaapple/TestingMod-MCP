package me.purplepineapple.testingmod.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.potion.Effect;

public class TMFlowerBlock extends FlowerBlock {
    private final Effect stewEffect;
    private final int stewEffectDuration;
    public TMFlowerBlock(Effect effect, int effectDuration, AbstractBlock.Properties properties) {
        super(effect, effectDuration, properties); // Effect for suspicious stew (Effects.EFFECT_NAME), duration in ticks, block properties
        this.stewEffect = effect;
        if (effect.isInstant()) {
            this.stewEffectDuration = effectDuration;
        } else {
            this.stewEffectDuration = effectDuration * 20;
        }

    }
}
