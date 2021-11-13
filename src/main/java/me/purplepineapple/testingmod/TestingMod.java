package me.purplepineapple.testingmod;

import me.purplepineapple.testingmod.core.registry.TMBlocks;
import me.purplepineapple.testingmod.core.registry.TMItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("testing")
@Mod.EventBusSubscriber(modid = TestingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestingMod
{
    public static final String MOD_ID = "testing"; // MOD ID
    public static final Logger LOGGER = LogManager.getLogger(); // LOGGER

    public TestingMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TMItems.ITEMS.register(bus);
        TMBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::clientSetup); // Used for renderers / render layers
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(TMBlocks.PINK_STAR_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TMBlocks.TALL_PINK_STAR_FLOWER.get(), RenderType.getCutout());
    }


}
