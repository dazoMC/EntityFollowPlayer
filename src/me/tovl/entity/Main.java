package me.tovl.entity;

import me.tovl.entity.entityevent.Entity;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new Entity(), this);
    }
}
