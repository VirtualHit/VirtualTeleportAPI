package es.virtualhit.virtualteleportapi.warp;

import com.google.gson.annotations.SerializedName;
import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

public class Warp extends TeleportPoint {

    @SerializedName("_id")
    private String name;

    public Warp(String name, TeleportPoint teleportPoint) {
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
