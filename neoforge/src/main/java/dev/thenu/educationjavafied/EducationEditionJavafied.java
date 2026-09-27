package dev.thenu.educationjavafied;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class EducationEditionJavafied {

    public EducationEditionJavafied(IEventBus eventBus) {

        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();

    }
}