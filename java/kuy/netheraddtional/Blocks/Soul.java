package kuy.netheraddtional.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.util.IIcon;

public class Soul extends BlockSoulSand
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public Soul() {
        setCreativeTab(Kuynethermain.tabkuynether);
        setBlockName("soul");
        setBlockTextureName("Kuynetheraddtional:soul");
        setHardness(3.5F);
        setResistance(5.0F);
        setStepSound(Block.soundTypeSand);
        setLightLevel(0.5F);
    }

}