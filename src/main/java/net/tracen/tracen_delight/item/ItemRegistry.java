package net.tracen.tracen_delight.item;

import java.util.function.Supplier;

import cn.mcmod_mmf.mmlib.item.info.FoodInfo;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tracen.tracen_delight.TracenDelight;
import net.tracen.umapyoi.item.food.UmaFoodItem;
import net.tracen.umapyoi.utils.UmaStatusUtils;

public class ItemRegistry {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TracenDelight.MODID);
	
    public static final DeferredItem<Item> PARFAIT = register("parfait",
            () -> new UmaFoodItem(UmaStatusUtils::addMotivation,
                    FoodInfo.builder().name("parfait").amountAndCalories(5, 0.6F).water(0F)
                            .nutrients(2F, 2F, 0F, 0F, 0F).decayModifier(1.5F).heatCapacity(1F).cookingTemp(480F)
                            .build()));
    
    public static final DeferredItem<Item> CARROT_BURGERMEAT = register("carrot_burgermeat",
            () -> new UmaFoodItem(UmaStatusUtils::addMotivation,
                    FoodInfo.builder().name("carrot_burgermeat").amountAndCalories(5, 0.6F).water(0F)
                            .nutrients(2F, 2F, 0F, 0F, 0F).decayModifier(1.5F).heatCapacity(1F).cookingTemp(480F)
                            .build()));
    
    public static final DeferredItem<Item> CARROT_FRIED_NOODLES = register("carrot_fried_noodles",
            () -> new UmaFoodItem(UmaStatusUtils::addMotivation,
                    FoodInfo.builder().name("carrot_fried_noodles").amountAndCalories(5, 0.6F).water(0F)
                            .nutrients(2F, 2F, 0F, 0F, 0F).decayModifier(1.5F).heatCapacity(1F).cookingTemp(480F)
                            .build()));
    
    public static final DeferredItem<Item> CARROT_SKEWERS = register("carrot_skewers",
            () -> new UmaFoodItem(UmaStatusUtils::addMotivation,
                    FoodInfo.builder().name("carrot_skewers").amountAndCalories(5, 0.6F).water(0F)
                            .nutrients(2F, 2F, 0F, 0F, 0F).decayModifier(1.5F).heatCapacity(1F).cookingTemp(480F)
                            .build()));
    
    public static final DeferredItem<Item> TOUGHNESS_BAR = register("toughness_bar",
            () -> new UmaFoodItem(UmaStatusUtils::addMotivation,
                    FoodInfo.builder().name("toughness_bar").amountAndCalories(5, 0.6F).water(0F)
                            .nutrients(2F, 2F, 0F, 0F, 0F).decayModifier(1.5F).heatCapacity(1F).cookingTemp(480F)
                            .build()));
    
    public static final DeferredItem<Item> CARROT_SMOOTHIES = register("carrot_smoothies",
            () -> new UmaFoodItem(UmaStatusUtils::addMotivation,
                    FoodInfo.builder().name("carrot_smoothies").amountAndCalories(5, 0.6F).water(0F)
                            .nutrients(2F, 2F, 0F, 0F, 0F).decayModifier(1.5F).heatCapacity(1F).cookingTemp(480F)
                            .build()));
    
    public static final DeferredItem<Item> CARROT_STRAWBERRY_ICE_CREAM = register("carrot_strawberry_ice_cream",
            () -> new UmaFoodItem(UmaStatusUtils::addMotivation,
                    FoodInfo.builder().name("carrot_strawberry_ice_cream").amountAndCalories(5, 0.6F).water(0F)
                            .nutrients(2F, 2F, 0F, 0F, 0F).decayModifier(1.5F).heatCapacity(1F).cookingTemp(480F)
                            .build()));
    
    private static <V extends Item> DeferredItem<V> register(String name, Supplier<V> item) {
        return ITEMS.register(name, item);
    }
}
