package es.virtualhit.virtualteleportapi.teleport;

import org.bukkit.Location;

import java.util.Optional;
import java.util.UUID;

public interface TeleportService {

    /**
     * Teleport a player to a TeleportPoint.
     * @param uuid
     * @param teleportPoint
     * @param countdown
     * @param updateLastPosition
     */
    void teleport(UUID uuid, TeleportPoint teleportPoint, int countdown, boolean updateLastPosition);

    /**
     * Teleport a player to a TeleportPoint with default countdown.
     * @param uuid
     * @param teleportPoint
     * @param updateLastPosition
     */
    void teleport(UUID uuid, TeleportPoint teleportPoint, boolean updateLastPosition);

    TeleportPoint getTeleportPointFromLocation(Location location);

    Optional<Location> getLocationFromTeleportPoint(TeleportPoint teleportPoint);
}
