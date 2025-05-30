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
}
