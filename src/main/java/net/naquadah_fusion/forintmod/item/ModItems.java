package net.naquadah_fusion.forintmod.item;

import net.naquadah_fusion.forintmod.ForintMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ForintMod.MOD_ID);

    public static final DeferredItem<Item> Forint1 = ITEMS.registerSimpleItem("forint1");
    public static final DeferredItem<Item> Forint2 = ITEMS.registerSimpleItem("forint2");
    public static final DeferredItem<Item> Forint5 = ITEMS.registerSimpleItem("forint5");
    public static final DeferredItem<Item> Forint5F = ITEMS.registerSimpleItem("forint5f");
    public static final DeferredItem<Item> Forint5O = ITEMS.registerSimpleItem("forint5o");
    public static final DeferredItem<Item> Forint5R = ITEMS.registerSimpleItem("forint5r");
    public static final DeferredItem<Item> Forint5I = ITEMS.registerSimpleItem("forint5i");
    public static final DeferredItem<Item> Forint5N = ITEMS.registerSimpleItem("forint5n");
    public static final DeferredItem<Item> Forint5T = ITEMS.registerSimpleItem("forint5t");
    public static final DeferredItem<Item> Forint10 = ITEMS.registerSimpleItem("forint10");
    public static final DeferredItem<Item> Forint20 = ITEMS.registerSimpleItem("forint20");
    public static final DeferredItem<Item> Forint50 = ITEMS.registerSimpleItem("forint50");
    public static final DeferredItem<Item> Forint100 = ITEMS.registerSimpleItem("forint100");
    public static final DeferredItem<Item> Forint200 = ITEMS.registerSimpleItem("forint200");
    public static final DeferredItem<Item> Forint200Old = ITEMS.registerSimpleItem("forint200old");
    public static final DeferredItem<Item> Forint500 = ITEMS.registerSimpleItem("forint500");
    public static final DeferredItem<Item> Forint1000 = ITEMS.registerSimpleItem("forint1000");
    public static final DeferredItem<Item> Forint2000 = ITEMS.registerSimpleItem("forint2000");
    public static final DeferredItem<Item> Forint5000 = ITEMS.registerSimpleItem("forint5000");
    public static final DeferredItem<Item> Forint10000 = ITEMS.registerSimpleItem("forint10000");
    public static final DeferredItem<Item> Forint20000 = ITEMS.registerSimpleItem("forint20000");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
