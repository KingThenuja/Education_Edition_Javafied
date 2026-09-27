package dev.thenu.educationjavafied.compat.modmenu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfigManager {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File CONFIG_FILE = new File(FabricLoader.getInstance().getConfigDir().toFile(), "educationeditionjavafied.json");

    public static ModConfig CONFIG = new ModConfig();

    public static void loadConfig() {
        if (CONFIG_FILE.exists()) {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                CONFIG = GSON.fromJson(reader, ModConfig.class);
                if (CONFIG == null) {
                    CONFIG = new ModConfig();
                }
            } catch (IOException e) {
                System.err.println("Failed to load Education Edition: Javafied config: " + e.getMessage());
            }
        } else {
            saveConfig();
        }
    }

    // Save current settings to disk
    public static void saveConfig() {
        CONFIG_FILE.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            GSON.toJson(CONFIG, writer);
        } catch (IOException e) {
            System.err.println("Failed to save Education Edition: Javafied config: " + e.getMessage());
        }
    }
}