package me.hello.me.jozo.Me.joinleave;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    @EventHandler
    void onPayerJoin(final PlayerJoinEvent e) {
        final Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.GREEN + "[+]" + player.getDisplayName());
    }
}
