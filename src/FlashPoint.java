import ChromeCoreUtils.ChromeCoreUtils;
import utils.Unity;

public class FlashPoint {

    public static void main(String[] args) {
        ChromeCoreUtils chromeUtils = new ChromeCoreUtils();

        // chrome
        chromeUtils.display();
        chromeUtils.enableEngines();
        chromeUtils.inject();

        // display unity for example
        Unity unity = new Unity();
        unity.enableEngines();
    }
}
