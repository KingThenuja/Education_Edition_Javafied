package dev.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EducationEditionJavafiedDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MRecipesDatagen::new);
        pack.addProvider(MModelDatagen::new);
        pack.addProvider(MLangEn_UsDatagen::new);
        pack.addProvider(MBlockTagDatagen::new);
        pack.addProvider(MItemTagDatagen::new);
    }
}
