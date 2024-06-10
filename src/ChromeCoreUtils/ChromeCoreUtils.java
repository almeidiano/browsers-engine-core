package ChromeCoreUtils;

import chromeFunctions.DisplayGUI;
import chromeFunctions.EnableGamesEngines;
import chromeFunctions.InjectSourceCode;

public class ChromeCoreUtils implements InjectSourceCode, EnableGamesEngines, DisplayGUI {
    @Override
    public void display() {
        System.out.println("Displaying GUI from Chrome Core");
    }

    @Override
    public void enableEngines() {
        System.out.println("Enabling games engines Chrome Core");
    }

    @Override
    public void inject() {
        System.out.println("Injecting source-code from Chrome Core");
    }
}
