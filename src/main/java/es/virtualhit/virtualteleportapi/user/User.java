package es.virtualhit.virtualteleportapi.user;

import com.google.gson.annotations.SerializedName;
import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.HashMap;
import java.util.UUID;

public class User {

    @SerializedName("_id")
    private final UUID uuid;
    private TeleportPoint lastPosition;
    private HashMap<String, Home> homes;
    private UUID lastTPARequest;

    public User(UUID uuid) {
        this.uuid = uuid;
        this.homes = new HashMap<>();
    }

    public UUID getUuid() {
        return uuid;
    }

    public TeleportPoint getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(TeleportPoint lastPosition) {
        this.lastPosition = lastPosition;
    }

    public HashMap<String, Home> getHomes() {
        return homes;
    }

    public void setHomes(HashMap<String, Home> homes) {
        this.homes = homes;
    }

    public UUID getLastTPARequest() {
        return lastTPARequest;
    }

    public void setLastTPARequest(UUID lastTPARequest) {
        this.lastTPARequest = lastTPARequest;
    }
}
