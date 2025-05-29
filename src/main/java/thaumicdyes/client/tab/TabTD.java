package thaumicdyes.client.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import thaumicdyes.common.items.ItemHandler;

public final class TabTD extends CreativeTabs {

    public TabTD(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ItemHandler.itemCultistRobeChestDyed;
    }
}
