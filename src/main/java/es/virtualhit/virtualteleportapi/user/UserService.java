package es.virtualhit.virtualteleportapi.user;

import es.virtualhit.virtualteleportapi.service.UpdateType;

import java.util.Optional;
import java.util.UUID;

public interface UserService {

    void create(User user);

    /**
     * Get user by UUID, preferred over username.
     *
     * @param uuid
     * @return
     */
    Optional<User> getByUUID(UUID uuid);

    /**
     * Get user by username, not preferred over UUID.
     *
     * @param username
     * @return
     */
    Optional<User> getByUsername(String username);
    Optional<UUID> getUUIDByUsername(String username);
    void update(User user, UpdateType type);
    boolean redisContains(UUID uuid);
    void addToRedis(User user);
    boolean setTimeToLive(UUID uuid, int seconds);
    boolean removeTimeToLive(UUID uuid);
    void removeFromRedis(UUID uuid);
}
