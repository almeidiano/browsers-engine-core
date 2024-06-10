package utils;

import chromeFunctions.EnableGamesEngines;

public class OpenGL implements EnableGamesEngines {
    @Override
    public void enableEngines() {
        System.out.println("Enabling OpenGL engine from OpenGL Util");
    }
}
