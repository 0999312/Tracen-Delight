package net.tracen.tracen_delight.data;

import cn.mcmod_mmf.mmlib.data.AbstractItemModelProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.tracen_delight.item.ItemRegistry;

public class TracenDelightItemModelProvider extends AbstractItemModelProvider {

	public TracenDelightItemModelProvider(PackOutput generator,ExistingFileHelper existingFileHelper) {
		super(generator, TracenDelight.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		ItemRegistry.ITEMS.getEntries().forEach(holder->{
			this.basicItem(holder.get());
		});
	}

}
