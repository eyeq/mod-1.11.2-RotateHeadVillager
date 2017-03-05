package eyeq.rotateheadvillager.event;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RotateHeadVillagerEventHandler {
    @SubscribeEvent
    public void onRenderLivingPre(RenderLivingEvent.Pre event) {
        RenderLivingBase render = event.getRenderer();
        ModelBase model = render.getMainModel();
        if(model instanceof ModelVillager) {
            EntityLivingBase entity = event.getEntity();
            long now = System.currentTimeMillis() + entity.getUniqueID().hashCode();

            if(Math.abs(entity.renderYawOffset - entity.prevRotationYawHead) > 60) {
                entity.renderYawOffset = entity.prevRenderYawOffset;
            }
            entity.rotationYawHead += now / 40 % 360;
        }
    }
}
