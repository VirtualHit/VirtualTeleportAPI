package es.virtualhit.virtualteleportapi.teleport;

import java.util.UUID;

public interface TeleportService {

    /**
     * Teleport a player to a TeleportPoint.
     * @param uuid
     * @param teleportPoint
     * @param countdown
     * @param updateLastPosition
     */
    void teleport(UUID uuid, TeleportPoint teleportPoint, boolean countdown, boolean updateLastPosition);

    /**
     * Teleport a player to a TeleportPoint with default countdown.
     * @param uuid
     * @param teleportPoint
     * @param updateLastPosition
     */
    void teleport(UUID uuid, TeleportPoint teleportPoint, boolean updateLastPosition);
}
