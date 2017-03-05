package eyeq.rotateheadvillager;

import eyeq.rotateheadvillager.event.RotateHeadVillagerEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.rotateheadvillager.RotateHeadVillager.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class RotateHeadVillager {
    public static final String MOD_ID = "eyeq_rotateheadvillager";

    @Mod.Instance(MOD_ID)
    public static RotateHeadVillager instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new RotateHeadVillagerEventHandler());
    }
}
