package net.tracen.tracen_delight;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.tracen.tracen_delight.item.ItemRegistry;
import net.tracen.tracen_delight.umaskills.UmaSkillRegistry;

@Mod(TracenDelight.MODID)
public class TracenDelight {
	public static final String MODID = "tracen_delight";
	private static final Logger LOGGER = LogUtils.getLogger();

	public TracenDelight(IEventBus modEventBus, ModContainer modContainer) {
		ItemRegistry.ITEMS.register(modEventBus);
		UmaSkillRegistry.SKILLS.register(modEventBus);
	}
	
	public static Logger getLogger() {
		return LOGGER;
	}

}
