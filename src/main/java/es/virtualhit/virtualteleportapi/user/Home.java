package es.virtualhit.virtualteleportapi.user;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class Home extends TeleportPoint {

    private String name;

    public Home(String server, UUID world, double x, double y, double z, float yaw, float pitch, String name) {
        super(server, world, x, y, z, yaw, pitch);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
