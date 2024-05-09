package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.OnboardPage;
import reports.ExtentTestReports;

public class OnboardTest2 extends BaseTestIos {
    OnboardPage onboardPage;
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
    public void before() {
        onboardPage = new OnboardPage(getAppiumDriver());
    }

    @Test
    public void OnboardTest() throws Exception {

        System.out.println("b. Kullanıcı 'ONBOARD' ekranındaki text ve ıconların görünür olduğunu doğrular.");
        Thread.sleep(2000);
        onboardPage
                .scanWithEaseWidgetVisible()
                .scanWithEaseText1()
                .scanWithEaseText2()
                .buttonClick()
                .editOnTheGoWidgetVisible()
                .editOnTheGoText1()
                .editOnTheGoText2()
                .buttonClick2()
                .exportAndShareInstantlyVisible()
                .exportAndShareInstantlyText1()
                .exportAndShareInstantlyText2()
                .buttonClick3()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}
