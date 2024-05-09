package test.Android;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.Android.RestorePurchasePage;
import page.Android.SupportPage;
import reports.ExtentTestReports;

public class SupportTest12  extends BaseTest {
    SupportPage supportPage;
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
        supportPage = new SupportPage(getAppiumDriver());
    }

    @Test
    public void SupportTest() throws Exception {

        System.out.println("m. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
                " ve ıcona tıklayarak Settings'e ekranında " +
                "'Support' butonu olduğunu ve butona tıklayarak " +
                "support'u görüntüleyebileceğini doğrular.");
        Thread.sleep(2000);

        supportPage
                .myDriveText()
                .searchBarVisible()
                .settingsWidgetVisible()
                .settingsWidgetClick()
                .settingsHeaderVisible()
                .supportButtonText()
                .supportClick()
                .supportHeaderTextVisible()
                .whatCanTextVisible()
                .supportSearchBarVisible()
                .frequentlyTextVisible()
                .supportText()
                .contactText()
                .contactClick()
                .contactHeaderTextVisible()
                .sendButtonVisible()
                .contactBackVisible()
                .contactBackClick()
                .supportBackVisible()
                .supportBackClick()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
