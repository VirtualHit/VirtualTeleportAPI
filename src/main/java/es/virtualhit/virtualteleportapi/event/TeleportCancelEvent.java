package es.virtualhit.virtualteleportapi.event;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a teleport is cancelled.
 */
public class TeleportCancelEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final TeleportPoint teleportPoint;

    public TeleportCancelEvent(Player player, TeleportPoint teleportPoint) {
        super(player);
        this.teleportPoint = teleportPoint;
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
}
