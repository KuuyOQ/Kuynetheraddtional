package kuy.netheraddtional.Meta;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.block.BlockTorch;
import net.minecraft.util.IIcon;

public class TileLightto extends BlockTorch
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public TileLightto() {
        setCreativeTab(Kuynethermain.tabkuynether);
        setBlockName("kuytouch");
        setLightLevel(1.0F);
    }

}