package me.hello.me.jozo.Me.joinleave;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Leave implements Listener {

    @EventHandler
    void onPlayerJoinLeave(final PlayerQuitEvent e){
        final Player player = e.getPlayer();
        final String RED = "\\u001b[0;31m";
        e.setQuitMessage(ChatColor.RED + "[-]" + player.getDisplayName());
        System.out.println("\u001b[0;31m[-] " + player.getDisplayName());
    }
}
