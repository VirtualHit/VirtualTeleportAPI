package es.virtualhit.virtualteleportapi.pending;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class PendingTeleport extends TeleportPoint {

    private final UUID uuid;
    private final boolean silent;

    public PendingTeleport(UUID uuid, TeleportPoint teleportPoint, boolean silent) {
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
        this.silent = silent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public boolean isSilent() {
        return silent;
    }
}
