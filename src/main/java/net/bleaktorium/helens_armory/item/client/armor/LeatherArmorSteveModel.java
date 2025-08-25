package net.bleaktorium.helens_armory.item.client.armor;

import net.bleaktorium.helens_armory.Helens_Armory;
import net.bleaktorium.helens_armory.item.client.custom.LeatherArmorSteveItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.model.GeoModel;

public class LeatherArmorSteveModel extends DefaultedItemGeoModel<LeatherArmorSteveItem> {

    public LeatherArmorSteveModel() {
        super(new ResourceLocation(Helens_Armory.MOD_ID, "geo/armor/leather_armor_steve.geo.json"));
    }
}