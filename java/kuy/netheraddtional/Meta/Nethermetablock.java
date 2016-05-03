package kuy.netheraddtional.Meta;
 
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
 
public class Nethermetablock extends ItemBlockWithMetadata {
 
	public Nethermetablock(Block block) {
		super(block, block);
	}
 
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return this.getUnlocalizedName() + "." + itemStack.getItemDamage();
	}
 
}