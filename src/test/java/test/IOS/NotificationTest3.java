package test.IOS;

import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.NotificationPage;
import page.IOS.TermOfUsePage;
import reports.ExtentTestReports;

public class NotificationTest3 extends BaseTestIos {

    NotificationPage notificationPage;
    AppiumDriver driver;

    @BeforeSuite
    public void setupSuite() {
        ExtentTestReports.beforeTest();
    }

    @AfterSuite
    public void afterSuite() {
        ExtentTestReports.afterTest();
    }

    @BeforeClass
    public void before() {notificationPage = new NotificationPage(getAppiumDriver());}

    @Test
    public void NotificationTest() throws Exception {

        System.out.println("c. Kullanıcı 'NOTIFICATION' ekranındaki text ve ıconların görünür olduğunu doğrular.");
        Thread.sleep(2000);
        notificationPage
                .stayInTheLoopWigdetVisible()
                .stayInTheLoopText1()
                .stayInTheLoopText2()
                .xCloseVisible()
                .buttonClick()
                .allowAlert()
                .finishTest();


    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
