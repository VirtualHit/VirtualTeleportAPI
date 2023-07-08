package es.virtualhit.virtualteleportapi.request;

import java.util.Optional;
import java.util.UUID;

public interface CurrentTeleportPointService {

    Optional<CurrentTeleportPoint> getCurrentTeleportPoint(UUID uuid);
    void create(CurrentTeleportPoint currentTeleportPoint);
    void delete(UUID uuid);
}
