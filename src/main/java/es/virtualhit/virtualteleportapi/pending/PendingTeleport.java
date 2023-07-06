package es.virtualhit.virtualteleportapi.pending;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class PendingTeleport extends TeleportPoint {

    private final UUID uuid;

    public PendingTeleport(UUID uuid, TeleportPoint teleportPoint) {
        super(
                teleportPoint.getServer(),
                teleportPoint.getWorld(),
                teleportPoint.getX(),
                teleportPoint.getY(),
                teleportPoint.getZ(),
                teleportPoint.getYaw(),
                teleportPoint.getPitch()
        );

        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
