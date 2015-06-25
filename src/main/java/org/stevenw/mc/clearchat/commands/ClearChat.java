package org.stevenw.mc.clearchat.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ClearChat implements CommandExecutor{
    private JavaPlugin plugin;
    public ClearChat(JavaPlugin plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String tag, String[] args) {
        for (Player player : plugin.getServer().getOnlinePlayers()) {
            if(!player.hasPermission("sclearchat.bypass")) {
                for (int i = 0; i < 130; i++) {
                    player.sendMessage("");
                }
            }
            player.sendMessage(ChatColor.RED + sender.getName() + " has cleared the chat.");
        }
        return true;
    }
}
