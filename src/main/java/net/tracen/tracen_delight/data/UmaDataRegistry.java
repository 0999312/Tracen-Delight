package net.tracen.tracen_delight.data;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.umapyoi.registry.umadata.UmaData;
import net.tracen.umapyoi.utils.GachaRanking;

public class UmaDataRegistry {
	public static final ResourceKey<UmaData> STILL_IN_LOVE = register("still_in_love");
	public static void registerAll(BootstrapContext<UmaData> bootstrap) {
		bootstrap.register(STILL_IN_LOVE,

					new UmaData(ResourceLocation.fromNamespaceAndPath(TracenDelight.MODID, 
							"still_in_love"
							), GachaRanking.SR, new int[] { 1, 1, 1, 1, 1 },
                new int[] { 18, 18, 18, 18, 18 }, new int[] {20,0,0,10,0}, 
                ResourceLocation.fromNamespaceAndPath(TracenDelight.MODID, "comfort_lover")));
	}
	
    private static ResourceKey<UmaData> register(String id) {
        ResourceKey<UmaData> loc = ResourceKey.create(UmaData.REGISTRY_KEY, 
        		ResourceLocation.fromNamespaceAndPath(TracenDelight.MODID, id));
        return loc;
    }
}
