package com.vs.nplugins.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tutCommands implements CommandExecutor {

@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (!(sender instanceof Player)) {

        sender.sendMessage(" Invoke with players ");

        return true;}
        Player player = (Player) sender;
//heal - heal the player no matter what health they are at
    if (cmd.getName().equalsIgnoreCase("heal")) {

        double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
        player.setHealth(maxHealth);
        player.sendMessage(" Health maxed out ");
    }
if (cmd.getName().equalsIgnoreCase("feed")) {
    player.setFoodLevel(20);
    player.sendMessage(" Food level maxed out ");
}

    return true;
}
}
