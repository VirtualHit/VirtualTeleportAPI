package es.virtualhit.virtualteleportapi.tpa;

import java.util.Optional;
import java.util.UUID;

public interface TPAService {

    Optional<TPARequest> getTPARequest(UUID uuid);
    void create(TPARequest tpaRequest);
    void delete(UUID uuid);
}
