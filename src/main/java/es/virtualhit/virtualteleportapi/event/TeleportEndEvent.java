package es.virtualhit.virtualteleportapi.event;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import es.virtualhit.virtualteleportapi.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player has been teleported. After the teleport.
 */
public class TeleportEndEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final TeleportPoint teleportPoint;
    private final boolean silent;

    public TeleportEndEvent(Player player, boolean async, TeleportPoint teleportPoint, boolean silent) {
        super(player, async);
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
