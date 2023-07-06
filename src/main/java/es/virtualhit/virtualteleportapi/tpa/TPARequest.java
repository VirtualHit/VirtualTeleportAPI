package es.virtualhit.virtualteleportapi.tpa;

import java.util.UUID;

public class TPARequest {

    private final UUID uuid;

    public TPARequest(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
