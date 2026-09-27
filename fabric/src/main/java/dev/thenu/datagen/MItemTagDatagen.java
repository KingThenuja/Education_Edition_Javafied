package dev.thenu.datagen;

import dev.thenu.educationjavafied.blockanditems.modTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static dev.thenu.educationjavafied.blockanditems.blockFile.FoodItems.ALL_FOOD_ITEMS;

public class MItemTagDatagen extends FabricTagsProvider.ItemTagsProvider {
    public MItemTagDatagen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        var saltedFood = tag(modTags.Items.SALTED_FOOD);


        for (Item item : ALL_FOOD_ITEMS) {
            saltedFood.add(item.builtInRegistryHolder().key());
        }
    }
}
