package org.vqiz.testplugin;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.vqiz.space.Space;

import java.util.List;
import java.util.UUID;

public final class Testplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("enabled 111111111111");
        System.out.println("a   asd     yxc       assolf");
        System.out.println("tst");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
