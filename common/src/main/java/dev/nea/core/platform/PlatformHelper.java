package dev.nea.core.platform;

/**
 * Provides platform-specific information to the shared NEA core.
 */
public interface PlatformHelper {
    /**
     * Returns the name of the current mod loader.
     */
    String getPlatformName();

    /**
     * Returns whether the current environment is a development environment.
     */
    boolean isDevelopmentEnvironment();
}
