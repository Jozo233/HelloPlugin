package me.hello.me.jozo.Me;

import me.hello.me.jozo.Me.commands.Info;
import me.hello.me.jozo.Me.joinleave.Join;
import me.hello.me.jozo.Me.joinleave.Leave;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class jozo extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("info").setExecutor((CommandExecutor)new Info());
        this.getServer().getPluginManager().registerEvents((Listener)new  Join(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new Leave(), (Plugin)this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
