package es.virtualhit.virtualteleportapi.exception;

public class InvalidTeleportPointException extends Exception {

    public InvalidTeleportPointException() {
        super("Invalid teleport point exception (probably the world has been deleted)");
    }
}
