package me.tovl.entity.entityevent;

import net.minecraft.server.v1_7_R4.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import static org.bukkit.Bukkit.getWorld;


public class Entity implements Listener {

    @EventHandler
    public void FollowPlayer(PlayerMoveEvent event){
    Player player = event.getPlayer();
        player.getWorld().spawnEntity(player.getLocation(), EntityType.COW);



    }
}
