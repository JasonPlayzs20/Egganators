package com.jasonplayzs20.egganators;

import org.bukkit.plugin.java.JavaPlugin;

public final class Egganators extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("slimemode").setExecutor(new EggCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
