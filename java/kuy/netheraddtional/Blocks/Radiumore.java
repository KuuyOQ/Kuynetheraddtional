package kuy.netheraddtional.Blocks;
 
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
 
public class Radiumore extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;
 
    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;
 
    public Radiumore() {
        super(Material.iron);
        setCreativeTab(Kuynethermain.tabkuynether);
        setBlockName("radium");
        setBlockTextureName("Kuynetheraddtional:radium");
        setHardness(1.5F);
        setResistance(1.0F);
        setStepSound(Block.soundTypeStone);
    }
    
}