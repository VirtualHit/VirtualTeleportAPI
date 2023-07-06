package es.virtualhit.virtualteleportapi.spawn;

import java.util.Optional;

public interface SpawnService {

    Optional<Spawn> getSpawn();
    void setSpawn(Spawn spawn);
    void loadSpawnToRedis();
}
