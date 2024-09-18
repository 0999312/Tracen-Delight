package net.tracen.tracen_delight.data;

import cn.mcmod_mmf.mmlib.data.AbstractLangProvider;
import net.minecraft.Util;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.tracen_delight.item.ItemRegistry;
import net.tracen.tracen_delight.umaskills.UmaSkillRegistry;
import net.tracen.umapyoi.registry.training.card.SupportCard;
import net.tracen.umapyoi.registry.umadata.UmaData;

public class TracenDelightLangProvider extends AbstractLangProvider {

	public TracenDelightLangProvider(PackOutput gen) {
		super(gen, TracenDelight.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		this.add(ItemRegistry.CARROT_BURGERMEAT.get(), "Carrot Burgermeat");
		this.add(ItemRegistry.CARROT_FRIED_NOODLES.get(), "Carrot Fried Noodles");
		this.add(ItemRegistry.CARROT_SKEWERS.get(), "Carrot Skewers");
		this.add(ItemRegistry.CARROT_SMOOTHIES.get(), "Carrot Smoothies");
		this.add(ItemRegistry.CARROT_STRAWBERRY_ICE_CREAM.get(), "Carrot Strawberry Ice Cream");
		this.add(ItemRegistry.PARFAIT.get(), "Parfait");
		this.add(ItemRegistry.TOUGHNESS_BAR.get(), "Toughness Bar");
		this.addUma(UmaDataRegistry.STILL_IN_LOVE, "Still In Love");
		this.addSupportCard(SupportCardRegistry.SR_STILL_IN_LOVE_WISDOM, "[Coffee Break] Still In Love");
		this.add(UmaSkillRegistry.COMFORT_LOVER.get().getDescriptionId(), "Comfort Lover");
	}

	private void addSupportCard(ResourceKey<SupportCard> data, String name) {
		this.addSupportCard(data.location(), name);
	}

	private void addSupportCard(ResourceLocation key, String name) {
		add(Util.makeDescriptionId("support_card", key) + ".name", name);
	}

	private void addUma(ResourceKey<UmaData> data, String name) {
		this.addUma(data.location(), name);
	}

	private void addUma(ResourceLocation key, String name) {
		add(Util.makeDescriptionId("umadata", key), name);
	}
}
