package es.virtualhit.virtualteleportapi.spawn;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class Spawn extends TeleportPoint {

    public Spawn(String server, UUID world, double x, double y, double z, float yaw, float pitch) {
        super(server, world, x, y, z, yaw, pitch);
    }
}
