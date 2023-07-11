package es.virtualhit.virtualteleportapi.tpa;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class TPARequest {

    private final UUID uuid;
    private final UUID sender;
    private TeleportPoint teleportPoint;

    public TPARequest(UUID sender) {
        this.uuid = UUID.randomUUID();
        this.sender = sender;
    }

    public TPARequest(UUID sender, TeleportPoint teleportPoint) {
        this.uuid = UUID.randomUUID();
        this.sender = sender;
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

    public UUID getSender() {
        return sender;
    }
}
