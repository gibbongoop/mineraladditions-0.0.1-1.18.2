package gibbongoop.mineraladditions.items;

import gibbongoop.mineraladditions.mineraladditions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, mineraladditions.MOD_ID);

    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINERAL_TAB)));

    public static final RegistryObject<Item> CUT_TOPAZ = ITEMS.register("cut_topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINERAL_TAB)));

    public static final RegistryObject<Item> RAW_GARNET = ITEMS.register("raw_garnet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINERAL_TAB)));

    public static final RegistryObject<Item> CUT_GARNET = ITEMS.register("cut_garnet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINERAL_TAB)));

    public static final RegistryObject<Item> RAW_AQUAMARINE = ITEMS.register("raw_aquamarine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINERAL_TAB)));

    public static final RegistryObject<Item> CUT_AQUAMARINE = ITEMS.register("cut_aquamarine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINERAL_TAB)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);

        }
    }



