package es.virtualhit.virtualteleportapi.spawn;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

public class Spawn extends TeleportPoint {

    public Spawn(TeleportPoint teleportPoint) {
        super(
                teleportPoint.getServer(),
                teleportPoint.getWorld(),
                teleportPoint.getX(),
                teleportPoint.getY(),
                teleportPoint.getZ(),
                teleportPoint.getYaw(),
                teleportPoint.getPitch()
        );
    }
}
