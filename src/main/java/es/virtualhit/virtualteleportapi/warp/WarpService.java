package es.virtualhit.virtualteleportapi.warp;

public interface WarpService {

    Warp getWarp(String name);
    void setWarp(Warp warp);
    void removeWarp(String name);
    boolean existsWarp(String name);
    Warp[] getWarps();
}
