package org.stevenw.mc.clearchat;

import org.bukkit.plugin.java.JavaPlugin;
import org.stevenw.mc.clearchat.commands.ClearChat;

public class sClearChat extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("clearchat").setExecutor(new ClearChat(this));
    }
}
