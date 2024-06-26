package io.github.lmagikk.heartofminecraft.init;

import io.github.lmagikk.heartofminecraft.HeartofMinecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;
import java.util.function.Supplier;

public class TierInit {
    public static final Tier WARRUM = TierSortingRegistry.registerTier(
            new ForgeTier(
            5,
            10000,
            2,
            4,
            30,
            TagInit.Blocks.NEEDS_WARRUM_TOOL,
            () -> Ingredient.of(ItemInit.WARRUM_INGOT.get())),
            new ResourceLocation(HeartofMinecraft.MODID, "warrum_ingot"), List.of(Tiers.NETHERITE), List.of()



    );

    public static final Tier NETHUM = TierSortingRegistry.registerTier(
            new ForgeTier(
                    6,
                    15000,
                    3,
                    5,
                    35,
                    TagInit.Blocks.NEEDS_NETHUM_TOOL,
                    () -> Ingredient.of(ItemInit.NETHUM_INGOT.get())),
            new ResourceLocation(HeartofMinecraft.MODID, "nethum_ingot"), List.of(Tiers.NETHERITE), List.of()
    );

    public static final Tier ENNUM = TierSortingRegistry.registerTier(
            new ForgeTier(
                    7,
                    -1,
                    4,
                    6,
                    40,
                    TagInit.Blocks.NEEDS_ENNUM_TOOL,
                    () -> Ingredient.of(ItemInit.ENNUM_INGOT.get())),
            new ResourceLocation(HeartofMinecraft.MODID, "ennum_ingot"), List.of(Tiers.NETHERITE), List.of()
    );

}

