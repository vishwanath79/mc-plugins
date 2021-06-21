package com.vs.nplugins.events;


import com.vs.nplugins.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class eventtuts implements Listener {

@EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
Player player  = event.getPlayer();
player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome to the server :)");

}
@EventHandler
public static void onRightClick(PlayerInteractEvent event) {

    if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {

        if (event.getItem() != null) {

            if (event.getItem().getItemMeta().equals(ItemManager.wand.getItemMeta())) {
                Player player = event.getPlayer();
                player.getWorld().createExplosion(player.getLocation(),2.0f);
                player.sendMessage("You dare use the stick of truth!");
            }
        }
    }
}



@EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {

    Player player = event.getPlayer();
    int x = player.getLocation().getBlockX();
    int y = player.getLocation().getBlockY();
    int z = player.getLocation().getBlockZ();

    Material block = player.getWorld().getBlockAt(x,y-1,z).getType();
//if (block == Material.STONE) {
//
//    player.sendMessage(ChatColor.GREEN + " standing on stone!!");
//}
}

}
