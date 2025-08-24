package net.bleaktorium.helens_armory.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.bleaktorium.helens_armory.client.model.TestBackCurioModel;
import net.bleaktorium.helens_armory.item.TestBackCurioItem;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

public class TestBackCurioGeoRenderer extends GeoItemRenderer<TestBackCurioItem> implements ICurioRenderer {
    public TestBackCurioGeoRenderer() {
        super(new TestBackCurioModel());
    }


    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(
            ItemStack stack, SlotContext slotContext, PoseStack matrixStack,
            RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer,
            int light, float limbSwing, float limbSwingAmount, float partialTicks,
            float ageInTicks, float netHeadYaw, float headPitch) {
        pose.pushPose();

        if (renderLayerParent.getModel() instanceof HumanoidModel<?> hum) {
            top.theillusivec4.curios.api.client.ICurioRenderer.followBodyRotations(ctx.entity(), hum);
            hum.body.translateAndRotate(pose);
        }

        pose.translate(0.0D, 0.15D, 0.25D);
        this.render(stack, net.minecraft.world.item.ItemDisplayContext.NONE, pose, buffers, light,
                net.minecraft.client.renderer.texture.OverlayTexture.NO_OVERLAY);
        pose.popPose();

    }
}
