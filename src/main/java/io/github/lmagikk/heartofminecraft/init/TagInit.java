package io.github.lmagikk.heartofminecraft.init;

import io.github.lmagikk.heartofminecraft.HeartofMinecraft;
import jdk.jfr.Description;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import static net.minecraft.tags.TagEntry.tag;

public class TagInit {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_WARRUM_TOOL = tag("needs_warrum_tool");
        public static final TagKey<Block> NEEDS_NETHUM_TOOL = tag("needs_nethum_tool");
        public static final TagKey<Block> NEEDS_ENNUM_TOOL = tag("needs_ennum_tool");

        private static TagKey<Block> tag(String name) { return BlockTags.create(new ResourceLocation(HeartofMinecraft.MODID, name));


        }
    }
}
