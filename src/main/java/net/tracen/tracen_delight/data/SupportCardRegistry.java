package net.tracen.tracen_delight.data;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.tracen_delight.umaskills.UmaSkillRegistry;
import net.tracen.umapyoi.registry.TrainingSupportRegistry;
import net.tracen.umapyoi.registry.training.SupportType;
import net.tracen.umapyoi.registry.training.card.SupportCard;
import net.tracen.umapyoi.registry.training.card.SupportEntry;
import net.tracen.umapyoi.utils.GachaRanking;
import net.tracen.umapyoi.utils.UmaSkillUtils;

public class SupportCardRegistry {
	public static final ResourceKey<SupportCard> SR_STILL_IN_LOVE_WISDOM = register("sr_still_in_love_wisdom");
	public static void registerAll(BootstrapContext<SupportCard> bootstrap) {
        bootstrap.register(SR_STILL_IN_LOVE_WISDOM,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SR)
                .supportType(SupportType.WISDOM)
                .maxDamage(8)
                .addSupporter(UmaDataRegistry.STILL_IN_LOVE.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.COMFORT_LOVER.getId()))
                .build());
		
	}
    private static ResourceKey<SupportCard> register(String id) {
        ResourceKey<SupportCard> loc = ResourceKey.create(SupportCard.REGISTRY_KEY, 
        		ResourceLocation.fromNamespaceAndPath(TracenDelight.MODID, id));
        return loc;
    }
}
