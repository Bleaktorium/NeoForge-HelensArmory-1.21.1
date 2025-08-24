package net.bleaktorium.helens_armory.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;
import net.bleaktorium.helens_armory.item.TestBackCurioItem;
import net.bleaktorium.helens_armory.client.model.TestBackCurioModel;

public class TestBackCurioGeoRenderer extends GeoItemRenderer<TestBackCurioItem>
        implements ICurioRenderer {

    public TestBackCurioGeoRenderer() { super(new TestBackCurioModel()); }

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(
            ItemStack stack,
            SlotContext slotCtx,
            PoseStack pose,
            RenderLayerParent<T, M> parent,
            MultiBufferSource buffers,
            int light,
            float limbSwing, float limbSwingAmount,
            float partialTick, float ageInTicks,
            float netHeadYaw, float headPitch) {

        pose.pushPose();

        if (parent.getModel() instanceof HumanoidModel<?> anyHum) {
            @SuppressWarnings("unchecked")
            HumanoidModel<LivingEntity> hum = (HumanoidModel<LivingEntity>) (HumanoidModel<?>) anyHum;
            ICurioRenderer.followBodyRotations(slotCtx.entity(), hum);
            hum.body.translateAndRotate(pose);
        }

        // adjust
        pose.translate(0.0D, 0.15D, 0.25D);

        super.renderByItem(stack, ItemDisplayContext.NONE, pose, buffers, light, OverlayTexture.NO_OVERLAY);
        pose.popPose();
    }
}
