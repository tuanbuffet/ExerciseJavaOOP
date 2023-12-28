package JavaOOP_3.Common;

public class Constants {
    private static String browers;
    private static boolean report = false;
    private static boolean headless ;
    public Constants(String browers, boolean report , boolean headless){
        Constants.browers = browers;
        Constants.report = report;
        Constants.headless = headless;
    }

    public static void setBrowers(String browers) {
        Constants.browers = browers;
    }
    public static boolean getReport(){
        return report;
    }
    public static boolean getHeadless(){
        return headless;
    }

    public static String getBrowers() {
        return browers;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }
}
