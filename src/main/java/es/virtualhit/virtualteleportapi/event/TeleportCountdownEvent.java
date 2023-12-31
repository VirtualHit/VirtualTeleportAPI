package es.virtualhit.virtualteleportapi.event;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import es.virtualhit.virtualteleportapi.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class TeleportCountdownEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final TeleportPoint teleportPoint;
    private final int remainingSeconds;
    private final int totalSeconds;
    private final boolean silent;

    public TeleportCountdownEvent(Player player, boolean async, TeleportPoint teleportPoint, int remainingSeconds, int totalSeconds, boolean silent) {
        super(player, async);
        this.teleportPoint = teleportPoint;
        this.remainingSeconds = remainingSeconds;
        this.totalSeconds = totalSeconds;
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

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }

    public boolean isSilent() {
        return silent;
    }
}
