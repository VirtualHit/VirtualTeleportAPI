package es.virtualhit.virtualteleportapi.teleport;

import java.util.UUID;

public class TeleportPoint {
    private String server;
    private UUID world;
    private double x;
    private double y;
    private double z;
    private float yaw;
    private float pitch;

    public TeleportPoint(String server, UUID world, double x, double y, double z, float yaw, float pitch) {
        this.server = server;
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public UUID getWorld() {
        return world;
    }

    public void setWorld(UUID world) {
        this.world = world;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    @Override
    public int hashCode() {
        return server.hashCode() + world.hashCode() + (int) x + (int) y + (int) z + (int) yaw + (int) pitch;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TeleportPoint teleportPoint)) return false;

        return teleportPoint.getServer().equals(server)
                && teleportPoint.getWorld().equals(world)
                && teleportPoint.getX() == x
                && teleportPoint.getY() == y
                && teleportPoint.getZ() == z
                && teleportPoint.getYaw() == yaw
                && teleportPoint.getPitch() == pitch;
    }
}
