package es.virtualhit.virtualteleportapi.event;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import es.virtualhit.virtualteleportapi.user.User;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class TeleportCountdownEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final User user;
    private final TeleportPoint teleportPoint;
    private final int remainingSeconds;
    private final int totalSeconds;

    public TeleportCountdownEvent(User user, TeleportPoint teleportPoint, int remainingSeconds, int totalSeconds) {
        this.user = user;
        this.teleportPoint = teleportPoint;
        this.remainingSeconds = remainingSeconds;
        this.totalSeconds = totalSeconds;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public User getUser() {
        return user;
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
}
