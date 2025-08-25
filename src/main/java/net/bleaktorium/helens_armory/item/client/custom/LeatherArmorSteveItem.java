package net.bleaktorium.helens_armory.item.client.custom;

import net.bleaktorium.helens_armory.item.client.armor.LeatherArmorSteveModel;
import net.bleaktorium.helens_armory.item.client.armor.LeatherArmorSteveRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.SingletonGeoAnimatable;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class LeatherArmorSteveItem extends ArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);


    public LeatherArmorSteveItem(Holder<ArmorMaterial> material, Type type, Item.Properties props) {
        super(material, type, props);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<LeatherArmorSteveItem>(this, "idle", 0, state -> {
            // later stuff
            return software.bernie.geckolib.animation.PlayState.STOP;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private final GeoArmorRenderer<LeatherArmorSteveItem> renderer =
                    new GeoArmorRenderer<>(new LeatherArmorSteveModel());

            @Override
            public <T extends LivingEntity>
            net.minecraft.client.model.HumanoidModel<?> getGeoArmorRenderer(
                    @Nullable T living, ItemStack stack,
                    @Nullable EquipmentSlot slot,
                    @Nullable HumanoidModel<T> original) {

                if (renderer == null) renderer = new LeatherArmorSteveRenderer();
                return renderer;
            }
        });
    }
}
