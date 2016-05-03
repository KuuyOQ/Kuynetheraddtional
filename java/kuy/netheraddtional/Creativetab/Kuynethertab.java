package kuy.netheraddtional.Creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Kuynethertab extends CreativeTabs {

	public Kuynethertab(String label) {
		super(label);
	}

	@Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem(){
        ItemStack iStack = new ItemStack(Kuynethermain.cummingtonite);
        return iStack.getItem();
    }

}