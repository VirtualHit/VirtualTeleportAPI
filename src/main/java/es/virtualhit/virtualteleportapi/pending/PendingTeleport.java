package es.virtualhit.virtualteleportapi.pending;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class PendingTeleport extends TeleportPoint {

    private final UUID uuid;

    public PendingTeleport(String server, UUID world, double x, double y, double z, float yaw, float pitch, UUID uuid) {
        super(server, world, x, y, z, yaw, pitch);
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
