package io.github.lmagikk.heartofminecraft.init;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial WARRUM = new ModArmorMaterial(
            new int[] { 6, 10, 8, 6 },
            new int[] {10000, 12000, 11000, 10000},
            30,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemInit.WARRUM_INGOT::get),
            "warrum",
            0.3f,
            0.1f
    );

    public static final ModArmorMaterial NETHUM = new ModArmorMaterial(
            new int[] { 8, 12, 10, 8 },
            new int[] {15000, 17000, 16000, 15000},
            35,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemInit.NETHUM_INGOT::get),
            "nethum",
            0.4f,
            0.2f

    );

    public static final ModArmorMaterial ENNUM = new ModArmorMaterial(
            new int[] { 10, 14, 12, 10},
            new int[] {-1, -1, -1, -1},
            40,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemInit.ENNUM_INGOT::get),
            "ennum",
            0.5f,
            0.3f

    );
}
