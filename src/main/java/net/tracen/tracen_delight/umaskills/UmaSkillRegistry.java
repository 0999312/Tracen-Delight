package net.tracen.tracen_delight.umaskills;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.umapyoi.registry.skills.UmaSkill;
import net.tracen.umapyoi.registry.skills.passive.PassiveSkill;

public class UmaSkillRegistry {
    public static final DeferredRegister<UmaSkill> SKILLS = DeferredRegister.create(UmaSkill.REGISTRY_KEY,
            TracenDelight.MODID);
    
    public static final DeferredHolder<UmaSkill, UmaSkill> COMFORT_LOVER = SKILLS.register("comfort_lover",
            () -> new PassiveSkill(new UmaSkill.Builder().level(1).requiredWisdom(3)));
}
