package kuy.netheraddtional.Blocks;
 
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
 
public class Cummingtonite extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;
 
    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;
 
    public Cummingtonite() {
        super(Material.iron);
        setCreativeTab(Kuynethermain.tabkuynether);
        setBlockName("Cummingtonite");
        setBlockTextureName("Kuynetheraddtional:cummingtonite");
        setHardness(2.5F);
        setResistance(2.0F);
        setStepSound(Block.soundTypeMetal);
    }
    
}