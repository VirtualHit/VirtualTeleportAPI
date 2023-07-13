package es.virtualhit.virtualteleportapi.warp;

import java.util.Optional;

public interface WarpService {

    Optional<Warp> getWarp(String name);
    void setWarp(Warp warp);
    void removeWarp(String name);
    boolean existsWarp(String name);
    Warp[] getWarps();
    void loadWarpsToRedis();
}
