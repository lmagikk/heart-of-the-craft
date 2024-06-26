package io.github.lmagikk.heartofminecraft;


import io.github.lmagikk.heartofminecraft.init.BlockInit;
import io.github.lmagikk.heartofminecraft.init.CreativeTabInit;
import io.github.lmagikk.heartofminecraft.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HeartofMinecraft.MODID)
public class HeartofMinecraft {
    public static final String MODID = "heartofminecraft";

    public HeartofMinecraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }
}
