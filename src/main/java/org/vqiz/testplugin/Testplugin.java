package org.vqiz.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Testplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("enabled 111111111111111");
        System.out.println("adolf");
        System.out.println("test");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
