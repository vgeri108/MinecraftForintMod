package net.naquadah_fusion.forintmod;

import net.naquadah_fusion.forintmod.block.ModBlocks;
import net.naquadah_fusion.forintmod.item.ModCreativeModTabs;
import net.naquadah_fusion.forintmod.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ForintMod.MOD_ID)
public class ForintMod {
    public static final String MOD_ID = "forintmod";

    public ForintMod(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
    }
}
