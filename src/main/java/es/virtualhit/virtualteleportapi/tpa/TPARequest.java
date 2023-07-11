package es.virtualhit.virtualteleportapi.tpa;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class TPARequest {

    private final UUID uuid;
    private TeleportPoint teleportPoint;

    public TPARequest(UUID uuid) {
        this.uuid = uuid;
    }

    public TPARequest(UUID uuid, TeleportPoint teleportPoint) {
        this.uuid = uuid;
        this.teleportPoint = teleportPoint;
    }

    public UUID getUuid() {
        return uuid;
    }

    public TeleportPoint getTeleportPoint() {
        return teleportPoint;
    }

    public void setTeleportPoint(TeleportPoint teleportPoint) {
        this.teleportPoint = teleportPoint;
    }
}
