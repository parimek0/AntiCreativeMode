package ru.strictmc.anticreativemode.anticreativemode;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCreativeMode extends JavaPlugin {

    private static AntiCreativeMode instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        }
    public static AntiCreativeMode getInstance() { return instance; }

}
