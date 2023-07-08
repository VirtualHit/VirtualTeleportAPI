package es.virtualhit.virtualteleportapi.current;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class CurrentTeleportPoint extends TeleportPoint {

    private final UUID owner;

    public CurrentTeleportPoint(UUID owner, TeleportPoint teleportPoint) {
        super(
                teleportPoint.getServer(),
                teleportPoint.getWorld(),
                teleportPoint.getX(),
                teleportPoint.getY(),
                teleportPoint.getZ(),
                teleportPoint.getYaw(),
                teleportPoint.getPitch()
        );

        this.owner = owner;
    }

    public UUID getOwner() {
        return owner;
    }
}
