package es.virtualhit.virtualteleportapi.warp;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public class Warp extends TeleportPoint {

    private String name;

    public Warp(String name, String server, UUID world, double x, double y, double z, float yaw, float pitch) {
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
