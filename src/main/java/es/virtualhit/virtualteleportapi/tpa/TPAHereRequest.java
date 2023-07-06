package es.virtualhit.virtualteleportapi.tpa;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class TPAHereRequest extends TPARequest {

    private TeleportPoint teleportPoint;

    public TPAHereRequest(UUID uuid, TeleportPoint teleportPoint) {
        super(uuid);
        this.teleportPoint = teleportPoint;
    }

    public TeleportPoint getTeleportPoint() {
        return teleportPoint;
    }

    public void setTeleportPoint(TeleportPoint teleportPoint) {
        this.teleportPoint = teleportPoint;
    }
}
