package net.tracen.tracen_delight.data;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.umapyoi.registry.training.card.SupportCard;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class Datagen {
	 @SubscribeEvent
	    public static void dataGen(GatherDataEvent event) {
	        DataGenerator dataGenerator = event.getGenerator();
	        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
	        CompletableFuture<Provider> lookupProvider = event.getLookupProvider();

	        PackOutput packOutput = dataGenerator.getPackOutput();
	        dataGenerator.addProvider(event.includeClient(), new TracenDelightItemModelProvider(packOutput, existingFileHelper));
	        dataGenerator.addProvider(event.includeClient(), new TracenDelightLangProvider(packOutput));
	        final RegistrySetBuilder supportCardBuilder = new RegistrySetBuilder().add(SupportCard.REGISTRY_KEY,
	                SupportCardRegistry::registerAll);
	        
	        dataGenerator.addProvider(event.includeServer(), 
	                new DatapackBuiltinEntriesProvider(packOutput, lookupProvider, supportCardBuilder, Set.of(TracenDelight.MODID)) {

	                    @Override
	                    public String getName() {
	                        return "SupportCard Registry";
	                    }
	                });
        }
}
