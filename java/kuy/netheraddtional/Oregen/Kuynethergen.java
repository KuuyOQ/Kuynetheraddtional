package kuy.netheraddtional.Oregen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import kuy.netheraddtional.Kuynethermain;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Kuynethergen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0 :

			generateSurface(world, random, chunkX*16, chunkZ*16);
			
		case -1 :

			generateNether(world, random, chunkX*16, chunkZ*16);
			
		case 1 :

			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(Nealecraft.oreWhatever, world, random, i=blockXPos, j= blockZPos, maxX, maxZ, maxVeinSize, chancetospawn, minY, maxY); 
		this.addOreSpawn(Kuynethermain.magumaore, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addOreSpawn(Kuynethermain.radium, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addOreSpawn(Kuynethermain.greenquatz, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addOreSpawn(Kuynethermain.cummingtonite, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addOreSpawn(Kuynethermain.soul, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
	}
	
	private void generateNether(World world, Random random, int x, int z) {

		this.addNetherOreSpawn(Kuynethermain.magumaore, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addNetherOreSpawn(Kuynethermain.radium, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addNetherOreSpawn(Kuynethermain.greenquatz, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addNetherOreSpawn(Kuynethermain.cummingtonite, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
		this.addNetherOreSpawn(Kuynethermain.soul, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
	}
	
	private void generateEnd(World world, Random random, int x, int z) {

		//this.addOreSpawn(Kuynethermain.Endenium, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 5, 200);
	}

	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	
	private void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new Kuynethermin(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}