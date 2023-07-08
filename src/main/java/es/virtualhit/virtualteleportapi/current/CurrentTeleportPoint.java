package es.virtualhit.virtualteleportapi.current;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class CurrentTeleportPoint {

    private final UUID owner;
    private final TeleportPoint teleportPoint;

    public CurrentTeleportPoint(UUID owner, TeleportPoint teleportPoint) {
        this.owner = owner;
        this.teleportPoint = teleportPoint;
    }

    public UUID getOwner() {
        return owner;
    }

    public TeleportPoint getTeleportPoint() {
        return teleportPoint;
    }
}
