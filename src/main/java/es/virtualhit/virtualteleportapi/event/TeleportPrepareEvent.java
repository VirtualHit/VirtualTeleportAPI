package es.virtualhit.virtualteleportapi.event;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player is going to be teleported. Before the countdown and before updating the last position.
 */
public class TeleportPrepareEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final TeleportPoint teleportPoint;
    private final int countdown;

    public TeleportPrepareEvent(Player player, TeleportPoint teleportPoint, int countdown) {
        super(player);
        this.teleportPoint = teleportPoint;
        this.countdown = countdown;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public TeleportPoint getTeleportPoint() {
        return teleportPoint;
    }

    public int getCountdown() {
        return countdown;
    }
}
