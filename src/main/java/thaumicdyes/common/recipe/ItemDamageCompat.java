package thaumicdyes.common.recipe;

import net.minecraft.item.ItemStack;

import ganymedes01.etfuturum.ModItems;

public class ItemDamageCompat {

    public static int getCorrectColor(ItemStack var13) {
        int itemd = var13.getItemDamage();
        if (var13.getItem() == (ModItems.DYE.newItemStack(1, itemd)).getItem()) {
            if (itemd == 0) {
                itemd = 15;
            } else if (itemd == 1) {
                itemd = 4;
            } else if (itemd == 2) {
                itemd = 3;
            } else if (itemd == 3) {
                itemd = 0;
            }
        }

        return itemd;
    }
}
