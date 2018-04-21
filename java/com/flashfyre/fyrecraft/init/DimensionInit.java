package com.flashfyre.fyrecraft.init;

import com.flashfyre.fyrecraft.world.dimension.caverns.DimensionCaverns;
import com.flashfyre.fyrecraft.world.dimension.waterfalls.DimensionWaterfalls;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
	
	public static final DimensionType CAVERNS = DimensionType.register("Caverns", "_caverns", 2, DimensionCaverns.class, false);
	public static final DimensionType WATERFALLS = DimensionType.register("Waterfalls", "_waterfalls", 3, DimensionWaterfalls.class, false);
	
	public static void registerDimensions() {
		
		DimensionManager.registerDimension(2, CAVERNS);
		DimensionManager.registerDimension(3, WATERFALLS);
	}

}
