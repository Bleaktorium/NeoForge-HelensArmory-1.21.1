package net.bleaktorium.helens_armory.client.model;

import net.bleaktorium.helens_armory.item.TestBackCurioItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TestBackCurioModel extends GeoModel<TestBackCurioItem> {
    private static final ResourceLocation GEO = ResourceLocation.fromNamespaceAndPath("helens_armory", "geo/test_back_item.geo.json");
    private static final ResourceLocation TEX = ResourceLocation.fromNamespaceAndPath("helens_armory", "textures/entity/test_back_item.png");
    private static final ResourceLocation ANIM = ResourceLocation.fromNamespaceAndPath("helens_armory", "animations/test_back_item.animation.json");


    @Override
    public ResourceLocation getModelResource(TestBackCurioItem animatable) {
        return GEO;
    }

    @Override
    public ResourceLocation getTextureResource(TestBackCurioItem animatable) {
        return TEX;
    }

    @Override
    public ResourceLocation getAnimationResource(TestBackCurioItem animatable) {
        return ANIM;
    }
}
