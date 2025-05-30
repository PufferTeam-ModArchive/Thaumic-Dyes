package thaumicdyes.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ColorHelper {

    public static String[] dyes = { "dyeBlack", "dyeRed", "dyeGreen", "dyeBrown", "dyeBlue", "dyePurple", "dyeCyan",
        "dyeLightGray", "dyeGray", "dyePink", "dyeLime", "dyeYellow", "dyeLightBlue", "dyeMagenta", "dyeOrange",
        "dyeWhite" };

    public static int getColor(ItemStack stack) {
        int num = -1;
        for (int id1 : OreDictionary.getOreIDs(stack)) {
            for (int i = 0; i < dyes.length; i++) {
                if (id1 == OreDictionary.getOreID(dyes[i])) {
                    num = i;
                }
            }
        }
        return num;
    }

    public static boolean isDye(ItemStack stack0) {
        boolean isOre1 = false;
        if (getColor(stack0) != -1) {
            isOre1 = true;
        }
        return isOre1;
    }

}
