package ru.strictmc.anticreativemode.anticreativemode;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class EventListener implements Listener {

    @EventHandler
    public void on(PlayerGameModeChangeEvent e) {
        if(!e.getPlayer().hasPermission("strict.creative") && e.getNewGameMode() == GameMode.CREATIVE) {
            e.getPlayer().sendMessage(AntiCreativeMode.getInstance().getConfig().getString("message.creative"));
            e.setCancelled(true);
            e.getPlayer().setGameMode(GameMode.SURVIVAL);
            if(e.getPlayer().getGameMode() == GameMode.CREATIVE) {
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
            }
        } else if(e.getPlayer().hasPermission("strict.creative") && e.getNewGameMode() == GameMode.CREATIVE) {
            e.getPlayer().sendMessage(AntiCreativeMode.getInstance().getConfig().getString("allow.creative"));
        }
    }

    @EventHandler
    public void SpectatorBlocker(PlayerGameModeChangeEvent e) {
        if(!e.getPlayer().hasPermission("strict.spectator") && e.getNewGameMode() == GameMode.SPECTATOR) {
            e.getPlayer().sendMessage(AntiCreativeMode.getInstance().getConfig().getString("message.spectator"));
            e.setCancelled(true);
            e.getPlayer().setGameMode(GameMode.SURVIVAL);
            if(e.getPlayer().getGameMode() == GameMode.SPECTATOR) {
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
            }
        } else if(e.getPlayer().hasPermission("strict.spectator") && e.getNewGameMode() == GameMode.SPECTATOR) {
            e.getPlayer().sendMessage(AntiCreativeMode.getInstance().getConfig().getString("allow.spectator"));
        }
    }

    @EventHandler
    public void AdventureBlocker(PlayerGameModeChangeEvent e) {
        if(!e.getPlayer().hasPermission("strict.adventure") && e.getNewGameMode() == GameMode.ADVENTURE) {
            e.getPlayer().sendMessage(AntiCreativeMode.getInstance().getConfig().getString("message.adventure"));
            e.setCancelled(true);
            e.getPlayer().setGameMode(GameMode.SURVIVAL);
            if(e.getPlayer().getGameMode() == GameMode.ADVENTURE) {
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
            }
        } else if(e.getPlayer().hasPermission("strict.adventure") && e.getNewGameMode() == GameMode.ADVENTURE) {
            e.getPlayer().sendMessage(AntiCreativeMode.getInstance().getConfig().getString("allow.adventure"));
        }
    }

}
