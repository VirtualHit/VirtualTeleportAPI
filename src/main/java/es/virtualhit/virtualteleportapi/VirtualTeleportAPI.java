package es.virtualhit.virtualteleportapi;

import es.virtualhit.virtualteleportapi.spawn.SpawnService;
import es.virtualhit.virtualteleportapi.teleport.TeleportService;
import es.virtualhit.virtualteleportapi.warp.WarpService;

public interface VirtualTeleportAPI {

    TeleportService getTeleportService();
    SpawnService getSpawnService();
    WarpService getWarpService();
}