package es.virtualhit.virtualteleportapi.spawn;

import com.google.gson.annotations.SerializedName;
import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

public class Spawn extends TeleportPoint {

    @SerializedName("_id")
    private final String id;

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

        this.id = "spawn";
    }

    public String getId() {
        return id;
    }
}
