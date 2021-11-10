package me.purplepineapple.testingmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("testing")
public class TestingMod
{
    public static final String MOD_ID = "testing"; // MOD ID
    public static final Logger LOGGER = LogManager.getLogger(); // LOGGER

    public TestingMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::clientSetup);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        // Render layers, entity renderers, etc.
    }


}
