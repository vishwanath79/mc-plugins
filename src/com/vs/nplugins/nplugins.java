package com.vs.nplugins;

import com.vs.nplugins.commands.tutCommands;
import com.vs.nplugins.events.eventtuts;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class nplugins extends JavaPlugin {

    @Override
    public void onEnable() {

        tutCommands commands = new tutCommands();
        getServer().getPluginManager().registerEvents(new eventtuts(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + " nplugins activated");

        //register commands
        getCommand("heal").setExecutor(commands);
        getCommand("feed").setExecutor(commands);
        getCommand("farmtime").setExecutor(commands);

    }


    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "nplugins deactivated");
    }

}
