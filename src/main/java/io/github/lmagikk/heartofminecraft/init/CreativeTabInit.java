package io.github.lmagikk.heartofminecraft.init;

import io.github.lmagikk.heartofminecraft.HeartofMinecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;



public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeartofMinecraft.MODID);
    public static final RegistryObject<CreativeModeTab> HEART_OF_MINECRAFT = TABS.register("heartofminecraft",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.heart_of_minecraft"))
                    .icon(ItemInit.HEART_OF_THE_WARDEN.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        output.accept(ItemInit.HEART_OF_THE_WARDEN.get());
                        output.accept(ItemInit.HEART_OF_THE_WITHER.get());
                        output.accept(ItemInit.HEART_OF_THE_DRAGON.get());
                        output.accept(ItemInit.HEART_OF_THE_OCEAN.get());
                        output.accept(ItemInit.HEART_OF_THE_OVERWORLD.get());
                        output.accept(ItemInit.ENNUM_ORE.get());
                        output.accept(ItemInit.NETHUM_ORE.get());
                        output.accept(ItemInit.OCCUM_ORE.get());
                        output.accept(ItemInit.OVUM_ORE.get());
                        output.accept(ItemInit.WARRUM_ORE.get());
                        output.accept(ItemInit.ENNUM_INGOT.get());
                        output.accept(ItemInit.NETHUM_INGOT.get());
                        output.accept(ItemInit.OCCUM_INGOT.get());
                        output.accept(ItemInit.OVUM_INGOT.get());
                        output.accept(ItemInit.WARRUM_INGOT.get());
                        output.accept(ItemInit.WARRUM_SWORD.get());
                        output.accept(ItemInit.WARRUM_PICKAXE.get());
                        output.accept(ItemInit.WARRUM_AXE.get());
                        output.accept(ItemInit.NETHUM_SWORD.get());
                        output.accept(ItemInit.NETHUM_PICKAXE.get());
                        output.accept(ItemInit.NETHUM_AXE.get());
                        output.accept(ItemInit.ENNUM_SWORD.get());
                        output.accept(ItemInit.ENNUM_PICKAXE.get());
                        output.accept(ItemInit.ENNUM_AXE.get());
                        output.accept(ItemInit.WARRUM_HELMET.get());
                        output.accept(ItemInit.WARRUM_CHESTPLATE.get());
                        output.accept(ItemInit.WARRUM_LEGGINGS.get());
                        output.accept(ItemInit.WARRUM_BOOTS.get());
                        output.accept(ItemInit.NETHUM_HELMET.get());
                        output.accept(ItemInit.NETHUM_CHESTPLATE.get());
                        output.accept(ItemInit.NETHUM_LEGGINGS.get());
                        output.accept(ItemInit.NETHUM_BOOTS.get());
                        output.accept(ItemInit.ENNUM_HELMET.get());
                        output.accept(ItemInit.ENNUM_CHESTPLATE.get());
                        output.accept(ItemInit.ENNUM_LEGGINGS.get());
                        output.accept(ItemInit.ENNUM_BOOTS.get());


                       ;
                    })
               .build()
    );




}
