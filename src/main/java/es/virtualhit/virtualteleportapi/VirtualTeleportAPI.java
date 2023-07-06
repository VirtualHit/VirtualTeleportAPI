package es.virtualhit.virtualteleportapi;

import es.virtualhit.virtualteleportapi.spawn.SpawnService;
import es.virtualhit.virtualteleportapi.teleport.TeleportService;

public interface VirtualTeleportAPI {

    TeleportService getTeleportService();
    SpawnService getSpawnService();
}