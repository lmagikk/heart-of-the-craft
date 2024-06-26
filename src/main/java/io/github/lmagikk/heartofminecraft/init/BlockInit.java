package io.github.lmagikk.heartofminecraft.init;

import io.github.lmagikk.heartofminecraft.HeartofMinecraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HeartofMinecraft.MODID);
    public static final RegistryObject<Block> OVUM_ORE = BLOCKS.register("ovum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> NETHUM_ORE = BLOCKS.register("nethum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> OCCUM_ORE = BLOCKS.register("occum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> ENNUM_ORE = BLOCKS.register("ennum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> WARRUM_ORE = BLOCKS.register("warrum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .lightLevel(state -> 5)));
}
