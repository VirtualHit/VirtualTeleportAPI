package es.virtualhit.virtualteleportapi.user;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

public class Home extends TeleportPoint {

    private String name;

    public Home(TeleportPoint teleportPoint, String name) {
        super(
                teleportPoint.getServer(),
                teleportPoint.getWorld(),
                teleportPoint.getX(),
                teleportPoint.getY(),
                teleportPoint.getZ(),
                teleportPoint.getYaw(),
                teleportPoint.getPitch()
        );
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
