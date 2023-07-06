package es.virtualhit.virtualteleportapi.pending;

import java.util.Optional;
import java.util.UUID;

public interface PendingTeleportService {

    Optional<PendingTeleport> getPendingTeleport(UUID uuid);
    void create(PendingTeleport pendingTeleport);
}
