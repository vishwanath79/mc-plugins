package com.vs.nplugins.commands;

import com.vs.nplugins.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class enchcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command");
            return true;
        }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("givewand")) {

            player.getInventory().addItem(ItemManager.wand);
        }
        return true;
    }
}
