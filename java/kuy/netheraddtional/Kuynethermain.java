/*
 * Kuynetheraddtional mod 1.0
 */
package kuy.netheraddtional;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import kuy.netheraddtional.Blocks.Cummingtonite;
import kuy.netheraddtional.Blocks.Greenquatz;
import kuy.netheraddtional.Blocks.Magmaore;
import kuy.netheraddtional.Blocks.Radiumore;
import kuy.netheraddtional.Blocks.Soul;
import kuy.netheraddtional.Creativetab.Kuynethertab;
import kuy.netheraddtional.Meta.BlueFire;
import kuy.netheraddtional.Meta.Kuynether;
import kuy.netheraddtional.Meta.Nethermetablock;
import kuy.netheraddtional.Meta.Tile1;
import kuy.netheraddtional.Meta.TileLightto;
import kuy.netheraddtional.Meta.Tilelight;
import kuy.netheraddtional.Oregen.Kuynethergen;
import kuy.netheraddtional.Tools.Magumahammer;
import kuy.netheraddtional.Tools.Magumahammerdic;
import kuy.netheraddtional.Tools.Netherhammer;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

@Mod(modid = Kuynethermain.MOD_ID, name = "Kuynetheraddtional", version = "1.0")
public class Kuynethermain {
	public static final String MOD_ID = "Kuynetheraddtional";
	public static Magumahammer MHM;
	public static Netherhammer NHM;
	public static Magumahammerdic Magumadic;
	public static Item kuynether;
	public static Block magumaore;
	public static Block radium;
	public static Block greenquatz;
	public static Block cummingtonite;
	public static Block soul;
	/* public static Block Endenium; */
	public static Block tile1;
	public static Block tile2;
	public static Block tile3;
	public static Block tile4;
	public static Block tile5;
	public static Block tiletorch;
	public static Block tiletorch2;
	public static Block tilefires;
	public static Block Railcamo;
	public static CreativeTabs tabkuynether = new Kuynethertab("tabkuynether");
	Kuynethergen eventWorldGen = new Kuynethergen();

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		// tools
		MHM = (Magumahammer) (new Magumahammer()).setUnlocalizedName("MHM")
				.setTextureName("Kuynetheraddtional:tools/magumahammer").setCreativeTab(Kuynethermain.tabkuynether)
				.setFull3D();
		GameRegistry.registerItem(MHM, "MHM");

		NHM = (Netherhammer) (new Netherhammer()).setUnlocalizedName("NHM")
				.setTextureName("Kuynetheraddtional:tools/netherhammer").setCreativeTab(Kuynethermain.tabkuynether)
				.setFull3D();
		GameRegistry.registerItem(NHM, "NHM");

		Magumadic = (Magumahammerdic) (new Magumahammerdic()).setUnlocalizedName("Magumadic")
				.setTextureName("Kuynetheraddtional:tools/magumahammer").setCreativeTab(Kuynethermain.tabkuynether)
				.setFull3D();
		GameRegistry.registerItem(Magumadic, "Magumadic");

		// blocks
		tile1 = new Tile1().setBlockName("tile1").setBlockTextureName("Kuynetheraddtional:tile1");
		GameRegistry.registerBlock(tile1, Nethermetablock.class, "tile1");
		tile3 = new Tile1().setBlockName("tile3").setBlockTextureName("Kuynetheraddtional:tile3");
		GameRegistry.registerBlock(tile3, Nethermetablock.class, "tile3");
		tile5 = new Tilelight().setBlockName("tile5").setBlockTextureName("Kuynetheraddtional:tile3");
		GameRegistry.registerBlock(tile5, Nethermetablock.class, "tile5");
		tile4 = new Tile1().setBlockName("tile4").setBlockTextureName("Kuynetheraddtional:tile4");
		GameRegistry.registerBlock(tile4, Nethermetablock.class, "tile4");
		tile2 = new Tile1().setBlockName("tile2").setBlockTextureName("Kuynetheraddtional:tile2");
		GameRegistry.registerBlock(tile2, Nethermetablock.class, "tile2");
		kuynether = new Kuynether().setUnlocalizedName("kuynether").setTextureName("Kuynetheraddtional:core/kuy");
		GameRegistry.registerItem(kuynether, "kuynether");
		tiletorch = new TileLightto().setBlockName("tileto").setBlockTextureName("Kuynetheraddtional:tileto");
		GameRegistry.registerBlock(tiletorch, Nethermetablock.class, "tileto");
		tilefires = new BlueFire().setBlockName("tilefires1").setBlockTextureName("Kuynetheraddtional:tilefires1");
		GameRegistry.registerBlock(tilefires, Nethermetablock.class, "tilefires1");
		tiletorch2 = new TileLightto().setBlockName("tileto2").setBlockTextureName("Kuynetheraddtional:tileto2");
		GameRegistry.registerBlock(tiletorch2, Nethermetablock.class, "tileto2");
		Railcamo = new kuy.netheraddtional.Blocks.Railcamo().setBlockName("tileto2");
		GameRegistry.registerBlock(Railcamo, "Railcamo");
		// ores
		magumaore = new Magmaore();
		GameRegistry.registerBlock(magumaore, "magumaore");
		soul = new Soul();
		GameRegistry.registerBlock(soul, "soul");
		radium = new Radiumore();
		GameRegistry.registerBlock(radium, "radium");
		greenquatz = new Greenquatz();
		GameRegistry.registerBlock(greenquatz, "greenquatz");
		cummingtonite = new Cummingtonite();
		GameRegistry.registerBlock(cummingtonite, "cummingtonite");

		/*
		 * Endenium = new Endeniumore(); GameRegistry.registerBlock(Endenium,
		 * "Endenium");
		 */

		// Worldgeneration
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		// Oredictionary
		OreDictionary.registerOre("hammer", new ItemStack(Kuynethermain.MHM, 1, 32767));
		OreDictionary.registerOre("craftingToolForgeHammer", new ItemStack(Kuynethermain.Magumadic, 1, 32767));
		OreDictionary.registerOre("hammer", new ItemStack(Kuynethermain.NHM, 1, 32767));
		OreDictionary.registerOre("oreRadium", new ItemStack(Kuynethermain.radium));
		OreDictionary.registerOre("oreMaguma", new ItemStack(Kuynethermain.magumaore));
		OreDictionary.registerOre("oreCummingtonite", new ItemStack(Kuynethermain.cummingtonite));

		// recipes
		// toolRecipes
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.MHM), "FFF", "FFF", " X ", 'F',
				new ItemStack(Kuynethermain.kuynether, 1, 5), 'X', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.NHM), "FFF", "FFF", "AXA", 'F',
				new ItemStack(Kuynethermain.kuynether, 1, 8), 'X', Items.stick, 'A',
				new ItemStack(Kuynethermain.kuynether, 1, 6));
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.MHM), "FFF", "FFF", "AXA", 'F',
				new ItemStack(Kuynethermain.kuynether, 1, 5), 'X', Items.stick, 'A',
				new ItemStack(Kuynethermain.kuynether, 1, 7));

		// Item&BlockRecipes
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Kuynethermain.kuynether, 3, 0),
				new Object[] { new ItemStack(Kuynethermain.cummingtonite), "hammer" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Kuynethermain.kuynether, 3, 4),
				new Object[] { new ItemStack(Kuynethermain.magumaore), "hammer" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Kuynethermain.kuynether, 3, 1),
				new Object[] { new ItemStack(Kuynethermain.radium), "hammer" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Kuynethermain.kuynether, 3, 6),
				new Object[] { new ItemStack(Kuynethermain.greenquatz), "hammer" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Kuynethermain.kuynether, 3, 7),
				new Object[] { new ItemStack(Kuynethermain.soul), "hammer" }));
		GameRegistry.addShapelessRecipe(new ItemStack(Kuynethermain.kuynether, 1, 3),
				new ItemStack(Kuynethermain.kuynether, 8, 0), new ItemStack(Kuynethermain.kuynether, 1, 7));
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.tilefires), "F F", "F F", "F F", 'F',
				new ItemStack(Items.iron_ingot));
		GameRegistry.addShapelessRecipe(new ItemStack(Kuynethermain.Railcamo, 1, 0), new ItemStack(Blocks.rail),
				new ItemStack(Blocks.soul_sand));
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.tiletorch, 4, 0), "F", "A", " ", 'F',
				new ItemStack(Kuynethermain.kuynether, 1, 1), 'A', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.tiletorch2, 4, 0), "F", "A", " ", 'F',
				new ItemStack(Kuynethermain.kuynether, 1, 4), 'A', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.tile2, 1, 14), "FFF", "FFF", "FFF", 'F',
				new ItemStack(Kuynethermain.kuynether, 1, 5));
		GameRegistry.addRecipe(new ItemStack(Kuynethermain.tile2, 1, 15), "FFF", "FFF", "FFF", 'F',
				new ItemStack(Kuynethermain.kuynether, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(Kuynethermain.kuynether, 9, 5),
				new ItemStack(Kuynethermain.tile2, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Kuynethermain.kuynether, 9, 8),
				new ItemStack(Kuynethermain.tile2, 1, 15));
		// tile1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 0),
				new Object[] { "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 1),
				new Object[] { "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 2),
				new Object[] { "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 3),
				new Object[] { " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 4),
				new Object[] { "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 5),
				new Object[] { "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 6),
				new Object[] { "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 7),
				new Object[] { "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 8),
				new Object[] { "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 9),
				new Object[] { "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 10),
				new Object[] { "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 11),
				new Object[] { "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 12),
				new Object[] { "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 13),
				new Object[] { "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 14),
				new Object[] { "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile1, 1, 15),
				new Object[] { "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stone) }));
		// tile2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 0),
				new Object[] { "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 1),
				new Object[] { "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 2),
				new Object[] { "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 3),
				new Object[] { " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 4),
				new Object[] { "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 5),
				new Object[] { "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 6),
				new Object[] { "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 7),
				new Object[] { "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 8),
				new Object[] { "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 9),
				new Object[] { "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 10),
				new Object[] { "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 11),
				new Object[] { "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 12),
				new Object[] { "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile2, 1, 13),
				new Object[] { "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 7), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		// tile3
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 0),
				new Object[] { "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 1),
				new Object[] { "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 2),
				new Object[] { "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 3),
				new Object[] { " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 4),
				new Object[] { "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 5),
				new Object[] { "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 6),
				new Object[] { "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 7),
				new Object[] { "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 8),
				new Object[] { "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 9),
				new Object[] { "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 10),
				new Object[] { "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 11),
				new Object[] { "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 12),
				new Object[] { "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 13),
				new Object[] { "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 14),
				new Object[] { "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile3, 1, 15),
				new Object[] { "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.stonebrick) }));
		// tile4
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 0),
				new Object[] { "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 1),
				new Object[] { "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 2),
				new Object[] { "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 3),
				new Object[] { " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 4),
				new Object[] { "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 5),
				new Object[] { "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 6),
				new Object[] { "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 7),
				new Object[] { "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 8),
				new Object[] { "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 9),
				new Object[] { "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 10),
				new Object[] { "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 11),
				new Object[] { "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 12),
				new Object[] { "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 13),
				new Object[] { "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 14),
				new Object[] { "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile4, 1, 15),
				new Object[] { "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 6), Character.valueOf('B'),
						new ItemStack(Blocks.quartz_block) }));
		// tile5
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 0),
				new Object[] { "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 1),
				new Object[] { "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 2),
				new Object[] { "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 3),
				new Object[] { " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 4),
				new Object[] { "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 5),
				new Object[] { "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 6),
				new Object[] { "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 7),
				new Object[] { "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 8),
				new Object[] { "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 9),
				new Object[] { "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 10),
				new Object[] { "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 11),
				new Object[] { "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 12),
				new Object[] { "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 13),
				new Object[] { "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 14),
				new Object[] { "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Kuynethermain.tile5, 1, 15),
				new Object[] { "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'),
						new ItemStack(Kuynethermain.kuynether, 1, 0), Character.valueOf('B'),
						new ItemStack(Blocks.glowstone) }));
		// furnaceRecipes
		GameRegistry.addSmelting(Kuynethermain.greenquatz, new ItemStack(Items.quartz), 0.35f);
		GameRegistry.addSmelting(Kuynethermain.cummingtonite, new ItemStack(Kuynethermain.kuynether, 2, 0), 0.35f);
		GameRegistry.addSmelting(Kuynethermain.magumaore, new ItemStack(Kuynethermain.kuynether, 2, 4), 0.35f);
		GameRegistry.addSmelting(new ItemStack(Kuynethermain.kuynether, 1, 4),
				new ItemStack(Kuynethermain.kuynether, 1, 5), 0.35f);
		GameRegistry.addSmelting(new ItemStack(Kuynethermain.kuynether, 1, 3),
				new ItemStack(Kuynethermain.kuynether, 1, 8), 0.35f);

		// testcode

	}

}
