package com.vs.nplugins;

import com.vs.nplugins.events.eventtuts;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class nplugins extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new eventtuts(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + " nplugins activated");
    }


    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "nplugins deactivated");
    }

}
