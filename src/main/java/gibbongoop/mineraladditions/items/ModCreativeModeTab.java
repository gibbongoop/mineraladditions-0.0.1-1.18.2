package gibbongoop.mineraladditions.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MINERAL_TAB = new CreativeModeTab("mineraltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_TOPAZ.get());
        }
    };
}

