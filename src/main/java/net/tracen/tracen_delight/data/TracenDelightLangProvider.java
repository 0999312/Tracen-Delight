package net.tracen.tracen_delight.data;

import cn.mcmod_mmf.mmlib.data.AbstractLangProvider;
import net.minecraft.data.PackOutput;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.tracen_delight.item.ItemRegistry;

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
	}

}
