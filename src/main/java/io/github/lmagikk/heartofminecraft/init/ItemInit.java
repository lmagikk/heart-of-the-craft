package io.github.lmagikk.heartofminecraft.init;

import io.github.lmagikk.heartofminecraft.HeartofMinecraft;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HeartofMinecraft.MODID);
    public static final RegistryObject<Item> HEART_OF_THE_WARDEN = ITEMS.register("heart_of_the_warden",
        () -> new Item(new Item.Properties()
                .stacksTo(16)
                .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> HEART_OF_THE_WITHER = ITEMS.register("heart_of_the_wither",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> HEART_OF_THE_DRAGON = ITEMS.register("heart_of_the_dragon",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> HEART_OF_THE_OCEAN = ITEMS.register("heart_of_the_ocean",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> HEART_OF_THE_OVERWORLD = ITEMS.register("heart_of_the_overworld",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> OVUM_INGOT = ITEMS.register("ovum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));
    public static final RegistryObject<Item> NETHUM_INGOT = ITEMS.register("nethum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));
    public static final RegistryObject<Item> OCCUM_INGOT = ITEMS.register("occum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ENNUM_INGOT = ITEMS.register("ennum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));
    public static final RegistryObject<Item> WARRUM_INGOT = ITEMS.register("warrum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));




    public static final RegistryObject<BlockItem> OVUM_ORE = ITEMS.register("ovum_ore",
            () -> new BlockItem(BlockInit.OVUM_ORE.get(), new Item.Properties()
                    ));
    public static final RegistryObject<BlockItem> NETHUM_ORE = ITEMS.register("nethum_ore",
            () -> new BlockItem(BlockInit.NETHUM_ORE.get(), new Item.Properties()
            ));
    public static final RegistryObject<BlockItem> OCCUM_ORE = ITEMS.register("occum_ore",
            () -> new BlockItem(BlockInit.OCCUM_ORE.get(), new Item.Properties()
            ));
    public static final RegistryObject<BlockItem> ENNUM_ORE = ITEMS.register("ennum_ore",
            () -> new BlockItem(BlockInit.ENNUM_ORE.get(), new Item.Properties()
            ));
    public static final RegistryObject<BlockItem> WARRUM_ORE = ITEMS.register("warrum_ore",
            () -> new BlockItem(BlockInit.WARRUM_ORE.get(), new Item.Properties()
            ));


    public static final RegistryObject<SwordItem> WARRUM_SWORD = ITEMS.register("warrum_sword",
            () -> new SwordItem(TierInit.WARRUM, 7, -0.5f, new Item.Properties()
                    .rarity(Rarity.EPIC)))
            ;
    public static final RegistryObject<SwordItem> NETHUM_SWORD = ITEMS.register("nethum_sword",
            () -> new SwordItem(TierInit.NETHUM, 9, 0f, new Item.Properties()
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<SwordItem> ENNUM_SWORD = ITEMS.register("ennum_sword",
            () -> new SwordItem(TierInit.ENNUM, 12, 0.5f, new Item.Properties()
                    .rarity(Rarity.EPIC)){
                @Override
                public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
                    p_41423_.add(Component.translatable("unbreakable").withStyle(ChatFormatting.GOLD));
                    super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
                }

            });

    public static final RegistryObject<PickaxeItem> WARRUM_PICKAXE = ITEMS.register("warrum_pickaxe",
            () -> new PickaxeItem(TierInit.WARRUM, 3, -2f, new Item.Properties()
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<PickaxeItem> NETHUM_PICKAXE = ITEMS.register("nethum_pickaxe",
            () -> new PickaxeItem(TierInit.NETHUM, 4, -1.5f, new Item.Properties()
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<PickaxeItem> ENNUM_PICKAXE = ITEMS.register("ennum_pickaxe",
            () -> new PickaxeItem(TierInit.ENNUM, 5, -1f, new Item.Properties()
                    .rarity(Rarity.EPIC)){
                @Override
                public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
                    p_41423_.add(Component.translatable("unbreakable").withStyle(ChatFormatting.GOLD));
                    super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
                }
            });

    public static final RegistryObject<AxeItem> WARRUM_AXE = ITEMS.register("warrum_axe",
            () -> new AxeItem(TierInit.WARRUM, 12, -2.5f, new Item.Properties()
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<AxeItem> NETHUM_AXE = ITEMS.register("nethum_axe",
            () -> new AxeItem(TierInit.NETHUM, 14, -2f, new Item.Properties()
                    .rarity(Rarity.EPIC)));
    public static final RegistryObject<AxeItem> ENNUM_AXE = ITEMS.register("ennum_axe",
            () -> new AxeItem(TierInit.ENNUM, 17, -1.5f, new Item.Properties()
                    .rarity(Rarity.EPIC)){
                @Override
                public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
                    p_41423_.add(Component.translatable("unbreakable").withStyle(ChatFormatting.GOLD));
                    super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);

                }
            });


    public static final RegistryObject<ArmorItem> WARRUM_HELMET = ITEMS.register("warrum_helmet",
            () -> new ArmorItem(
                    ArmorMaterialInit.WARRUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.EPIC)
            ));
    public static final RegistryObject<ArmorItem> WARRUM_CHESTPLATE = ITEMS.register("warrum_chestplate",
            () -> new ArmorItem(
                    ArmorMaterialInit.WARRUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.EPIC)
            ));
    public static final RegistryObject<ArmorItem> WARRUM_LEGGINGS = ITEMS.register("warrum_leggings",
            () -> new ArmorItem(
                    ArmorMaterialInit.WARRUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.EPIC)
            ));
    public static final RegistryObject<ArmorItem> WARRUM_BOOTS = ITEMS.register("warrum_boots",
            () -> new ArmorItem(
                    ArmorMaterialInit.WARRUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.EPIC)
            ));


    public static final RegistryObject<ArmorItem> NETHUM_HELMET = ITEMS.register("nethum_helmet",
            () -> new ArmorItem(
                    ArmorMaterialInit.NETHUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.EPIC)

            ));
    public static final RegistryObject<ArmorItem> NETHUM_CHESTPLATE = ITEMS.register("nethum_chestplate",
            () -> new ArmorItem(
                    ArmorMaterialInit.NETHUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.EPIC)

            ));
    public static final RegistryObject<ArmorItem> NETHUM_LEGGINGS = ITEMS.register("nethum_leggings",
            () -> new ArmorItem(
                    ArmorMaterialInit.NETHUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.EPIC)

            ));
    public static final RegistryObject<ArmorItem> NETHUM_BOOTS = ITEMS.register("nethum_boots",
            () -> new ArmorItem(
                    ArmorMaterialInit.NETHUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.EPIC)

            ));


    public static final RegistryObject<ArmorItem> ENNUM_HELMET = ITEMS.register("ennum_helmet",
            () -> new ArmorItem(
                    ArmorMaterialInit.ENNUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.EPIC)

            ){
                @Override
                public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
                    p_41423_.add(Component.translatable("unbreakable").withStyle(ChatFormatting.GOLD));
                    super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);

                }
            });
    public static final RegistryObject<ArmorItem> ENNUM_CHESTPLATE = ITEMS.register("ennum_chestplate",
            () -> new ArmorItem(
                    ArmorMaterialInit.ENNUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.EPIC)

            ){
                @Override
                public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
                    p_41423_.add(Component.translatable("unbreakable").withStyle(ChatFormatting.GOLD));
                    super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);

                }
            });
    public static final RegistryObject<ArmorItem> ENNUM_LEGGINGS = ITEMS.register("ennum_leggings",
            () -> new ArmorItem(
                    ArmorMaterialInit.ENNUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.EPIC)

            ){
                @Override
                public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
                    p_41423_.add(Component.translatable("unbreakable").withStyle(ChatFormatting.GOLD));
                    super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);

                }
            });
    public static final RegistryObject<ArmorItem> ENNUM_BOOTS = ITEMS.register("ennum_boots",
            () -> new ArmorItem(
                    ArmorMaterialInit.ENNUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.EPIC)

            ){
                @Override
                public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
                    p_41423_.add(Component.translatable("unbreakable").withStyle(ChatFormatting.GOLD));
                    super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);

                }
            });
}
