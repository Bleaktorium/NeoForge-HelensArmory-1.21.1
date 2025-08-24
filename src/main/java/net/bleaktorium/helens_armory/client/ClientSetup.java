package net.bleaktorium.helens_armory.client;

import net.bleaktorium.helens_armory.client.render.TestBackCurioGeoRenderer;
import net.bleaktorium.helens_armory.item.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;
import net.neoforged.fml.common.Mod;


@Mod.EventBusSubscriber(modid = "helens_armory", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent e) {
        e.enqueueWork( () -> {
            CuriosRendererRegistry.register(ModItems.TEST_BACK_ITEM.get(), TestBackCurioGeoRenderer::new);
        });
    }
}
