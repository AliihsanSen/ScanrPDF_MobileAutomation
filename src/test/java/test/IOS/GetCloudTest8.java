package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.GetCloudPage;
import reports.ExtentTestReports;

public class GetCloudTest8 extends BaseTestIos {
    GetCloudPage getCloudPage ;
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
        getCloudPage = new GetCloudPage(getAppiumDriver());
    }

    @Test
    public void GetCloudTest() throws Exception {

        System.out.println("h. Kullanıcı 'HOME' ekranında 'Get Cloud' text'i olduğunu " +
                "ve tıklayarak subscription ekranına gidebileceğini doğrular.");
        Thread.sleep(2000);

        getCloudPage
                .getCloudText()
                .getCloudClick()
                .xCloseButton()
                .restoreText()
                .unlimitedtext()
                .proScanText()
                .subcriptionWidgetVisible()
                .subcriptionText()
                .subcriptionPurchase()
                .continueButtonVisible()
                .scaleWidgetVisible()
                .scaleWidgetClick()
                .policyTextVisible()
                .xCloseClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
