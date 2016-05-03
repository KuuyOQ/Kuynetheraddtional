package kuy.netheraddtional.Blocks;
 
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
 
public class Magmaore extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;
 
    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;
 
    public Magmaore() {
        super(Material.iron);
        setCreativeTab(Kuynethermain.tabkuynether);
        setBlockName("maguma");
        setBlockTextureName("Kuynetheraddtional:maguma");
        setHardness(1.5F);
        setResistance(1.0F);
        setStepSound(Block.soundTypeStone);
    }
    
}