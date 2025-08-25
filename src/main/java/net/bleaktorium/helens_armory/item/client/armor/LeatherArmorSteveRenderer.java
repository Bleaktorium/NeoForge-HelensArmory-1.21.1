package net.bleaktorium.helens_armory.item.client.armor;

import net.bleaktorium.helens_armory.item.client.custom.LeatherArmorSteveItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class LeatherArmorSteveRenderer extends GeoArmorRenderer<LeatherArmorSteveItem> {

    public LeatherArmorSteveRenderer() {
        super(new LeatherArmorSteveModel());
    }
}
