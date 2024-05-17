package net.risakevich.mptmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {

    public static final CreativeModeTab MPT_TAB = new CreativeModeTab("Mpt tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMBER.get());
        }
    };
}
