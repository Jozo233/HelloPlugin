package me.hello.me.jozo.Me.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Info implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("info")) {
            sender.sendMessage(ChatColor.GREEN + "HelloPlugin");
            sender.sendMessage(ChatColor.BLUE + "By Jozo_85");
        }
        return false;
    }
}
