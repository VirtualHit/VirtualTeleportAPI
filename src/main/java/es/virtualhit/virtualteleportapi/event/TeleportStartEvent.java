package es.virtualhit.virtualteleportapi.event;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import es.virtualhit.virtualteleportapi.user.User;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class TeleportStartEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final User user;
    private final TeleportPoint teleportPoint;

    public TeleportStartEvent(User user, TeleportPoint teleportPoint) {
        this.user = user;
        this.teleportPoint = teleportPoint;
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
}
