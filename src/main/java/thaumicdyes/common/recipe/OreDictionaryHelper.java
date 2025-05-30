package thaumicdyes.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHelper {

    public static boolean isOre(ItemStack stack, String ore) {
        boolean isOreD = false;
        for (int id : OreDictionary.getOreIDs(stack)) {
            if (id == OreDictionary.getOreID(ore)) {
                isOreD = true;
            }
        }
        if (stack == null) {
            isOreD = false;
        }
        return isOreD;
    }

    public static boolean isDye(ItemStack stack) {
        int itemd = ItemDamageCompat.getCorrectColor(stack);
        boolean isOreD1 = false;
        switch (itemd) {
            case 0:
                isOreD1 = isOre(stack, "dyeBlack");
                break;
            case 1:
                isOreD1 = isOre(stack, "dyeRed");
                break;
            case 2:
                isOreD1 = isOre(stack, "dyeGreen");
                break;
            case 3:
                isOreD1 = isOre(stack, "dyeBrown");
                break;
            case 4:
                isOreD1 = isOre(stack, "dyeBlue");
                break;
            case 5:
                isOreD1 = isOre(stack, "dyePurple");
                break;
            case 6:
                isOreD1 = isOre(stack, "dyeCyan");
                break;
            case 7:
                isOreD1 = isOre(stack, "dyeLightGray");
                break;
            case 8:
                isOreD1 = isOre(stack, "dyeGray");
                break;
            case 9:
                isOreD1 = isOre(stack, "dyePink");
                break;
            case 10:
                isOreD1 = isOre(stack, "dyeLime");
                break;
            case 11:
                isOreD1 = isOre(stack, "dyeYellow");
                break;
            case 12:
                isOreD1 = isOre(stack, "dyeLightBlue");
                break;
            case 13:
                isOreD1 = isOre(stack, "dyeMagenta");
                break;
            case 14:
                isOreD1 = isOre(stack, "dyeOrange");
                break;
            case 15:
                isOreD1 = isOre(stack, "dyeWhite");
                break;
        }
        return isOreD1;
    }
}
