package com.foufys;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerLoginEvent;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.util.logging.Level;

public final class board extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "has been enabled.");
        getServer().getPluginManager().registerEvents(new PlayerListener(getLogger()), this);
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "has been disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("basic")) {
            return true;
        }
        return false;
    }

}