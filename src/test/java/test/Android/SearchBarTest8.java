package test.Android;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.Android.SearchBarPage;
import reports.ExtentTestReports;

public class SearchBarTest8 extends BaseTest {
    SearchBarPage searchBarPage ;
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
        searchBarPage = new SearchBarPage(getAppiumDriver());
    }

    @Test
    public void SearchBarTest() throws Exception {

        System.out.println("h. Kullanıcı 'HOME' ekranında 'Search Bar' olduğunu" +
                " ve arama yapabileceğini doğrular.");
        Thread.sleep(2000);

        searchBarPage
                .settingsWidgetVisible()
                .myDriveText()
                .searchBarVisible()
                .searchBarClick()
                .searchBarWidgetVisible()
                .searchBarText()
                .backWidgetVisible()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
