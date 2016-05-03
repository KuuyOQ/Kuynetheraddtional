package kuy.netheraddtional.Meta;

import kuy.netheraddtional.Kuynethermain;
import net.minecraft.block.BlockRailDetector;

public class BlueFire extends BlockRailDetector {

	public BlueFire() {
		this.setCreativeTab(Kuynethermain.tabkuynether);
	}

	/*@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean advanced) {
		list.add(StatCollector.translateToLocal("tile.railtip.name"));

	}*/

}