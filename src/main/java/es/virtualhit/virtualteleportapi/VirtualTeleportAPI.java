package es.virtualhit.virtualteleportapi;

import es.virtualhit.virtualteleportapi.current.CurrentTeleportPointService;
import es.virtualhit.virtualteleportapi.pending.PendingTeleportService;
import es.virtualhit.virtualteleportapi.spawn.SpawnService;
import es.virtualhit.virtualteleportapi.teleport.TeleportService;
import es.virtualhit.virtualteleportapi.tpa.TPAService;
import es.virtualhit.virtualteleportapi.user.UserService;
import es.virtualhit.virtualteleportapi.warp.WarpService;

public interface VirtualTeleportAPI {

    TeleportService getTeleportService();
    SpawnService getSpawnService();
    WarpService getWarpService();
    PendingTeleportService getPendingTeleportService();
    CurrentTeleportPointService getCurrentTeleportPointService();
    TPAService getTPAService();
    UserService getUserService();
}