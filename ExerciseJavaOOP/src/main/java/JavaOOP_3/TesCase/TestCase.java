package JavaOOP_3.TesCase;

import JavaOOP_3.Common.BaseTest;

public class TestCase extends BaseTest {
    public TestCase(String browers, boolean report, boolean headless) {
        super(browers, report, headless);
    }

    public static void Login(){
        //khai báo browser
        TestCase Constants = new TestCase("chrome", true, true);
        createDriver();
        System.out.println("Qúa trình test Login...");
        //Đóng browser
        closeDriver();
    }
    public static void AddCategory(){
        TestCase Constants = new TestCase("Fifox", false, true);
        createDriver();
        System.out.println("Qúa trình test AddCategory...");
        //Đóng browser
        closeDriver();
    }

    public static void main(String[] args) {
        Login();
        AddCategory();
    }
}
