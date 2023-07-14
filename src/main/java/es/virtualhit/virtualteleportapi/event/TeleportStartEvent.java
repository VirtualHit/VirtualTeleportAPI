package es.virtualhit.virtualteleportapi.event;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player is going to be teleported. After the countdown and after updating the last position.
 * Before the teleport.
 */
public class TeleportStartEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final TeleportPoint teleportPoint;
    private final boolean silent;

    public TeleportStartEvent(Player player, TeleportPoint teleportPoint, boolean silent) {
        super(player);
        this.teleportPoint = teleportPoint;
        this.silent = silent;
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

    public boolean isSilent() {
        return silent;
    }
}
