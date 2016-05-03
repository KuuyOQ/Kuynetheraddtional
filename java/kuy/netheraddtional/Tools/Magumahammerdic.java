package kuy.netheraddtional.Tools;



import java.util.List;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class Magumahammerdic extends Item
{
    private boolean repair = false;
    public Magumahammerdic()
    {
        super();
        this.setMaxStackSize(1);
        this.setMaxDamage(155);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return false;
    }

    @Override
    public boolean hasContainerItem()
    {
        return !repair;
    }

	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{

		repair = Kuynethermain.Magumadic == event.crafting.getItem();
	}

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if (itemStack != null && itemStack.getItem() == this)
        {
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        }
        return itemStack;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean advanced) {
    	list.add(StatCollector.translateToLocal("tile.Magumatooldictip.name"));

    }

    
}
