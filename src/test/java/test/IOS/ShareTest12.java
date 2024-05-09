package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.SharePage;
import reports.ExtentTestReports;

public class ShareTest12 extends BaseTestIos {
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

        System.out.println("m. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
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
                .shareClosed()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
