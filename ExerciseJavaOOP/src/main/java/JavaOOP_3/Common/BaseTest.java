package JavaOOP_3.Common;

public class BaseTest extends Constants{
    public BaseTest(String browers, boolean report, boolean headless) {
        super(browers, report, headless);
    }

    public static void createDriver(){
        System.out.println(getBrowers());
        System.out.println(getReport());
        System.out.println(getHeadless());
    }
    public static void closeDriver(){
        System.out.println("Close Browser: " + getBrowers());
    }

}
