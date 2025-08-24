package net.bleaktorium.helens_armory.item;

import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;

import static software.bernie.geckolib.util.GeckoLibUtil.createInstanceCache;

public class TestBackCurioItem extends Item implements GeoItem {
    private final AnimatableInstanceCache cache =
            createInstanceCache(this);


    public TestBackCurioItem(Properties props) {
        super(props);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar c) {}

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
