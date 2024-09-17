package net.tracen.tracen_delight;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.tracen.tracen_delight.item.ItemRegistry;
import net.tracen.umapyoi.UmapyoiCreativeGroup;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = TracenDelight.MODID)
public class SetupEvents {
	
	@SubscribeEvent
	public static void creativeTabRegistry(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == UmapyoiCreativeGroup.UMAPYOI_ITEMS.getKey()) {
			ItemRegistry.ITEMS.getEntries().forEach(holder->event.accept(holder.get()));
		}
	}
}
