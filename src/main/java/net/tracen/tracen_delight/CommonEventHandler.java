package net.tracen.tracen_delight;

import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.tracen.tracen_delight.umaskills.UmaSkillRegistry;
import net.tracen.umapyoi.api.UmapyoiAPI;
import net.tracen.umapyoi.utils.UmaSoulUtils;
import net.tracen.umapyoi.utils.UmaStatusUtils;
import vectorwing.farmersdelight.common.registry.ModEffects;

@EventBusSubscriber(modid = TracenDelight.MODID)
public class CommonEventHandler {
	@SubscribeEvent
	public static void handleComfortLoverEffects(LivingEntityUseItemEvent.Finish event) {
		ItemStack umaSoul = UmapyoiAPI.getUmaSoul(event.getEntity());
		if(umaSoul.isEmpty()) 
			return;
		if(!UmaSoulUtils.hasSkill(umaSoul, UmaSkillRegistry.COMFORT_LOVER.getId())) 
			return;
		if(!event.getEntity().hasEffect(ModEffects.COMFORT)) 
			return;
		
		UmaStatusUtils.addMotivation(umaSoul);
	}
}
