package test.Android;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.Android.SharePage;
import page.Android.UpgradeToUnlimitedScanPage;
import reports.ExtentTestReports;

public class ShareTest11 extends BaseTest {
    SharePage sharePage;
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
        sharePage = new SharePage(getAppiumDriver());
    }

    @Test
    public void SettingsTest() throws Exception {

        System.out.println("l. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
                " ve ıcona tıklayarak Settings'e ekranında " +
                "'Share' butonu olduğunu ve butona tıklayarak " +
                "uygulamanın linklerine paylaşabileceğini görüntüler.");
        Thread.sleep(2000);

        sharePage
                .myDriveText()
                .searchBarVisible()
                .settingsWidgetVisible()
                .settingsWidgetClick()
                .settingsHeaderVisible()
                .shareButtonText()
                .shareButtonClick()
                .shareHeaderTextVisible()
                .scanrTextVisible()
                .sharelist()
                .shareClosed()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
