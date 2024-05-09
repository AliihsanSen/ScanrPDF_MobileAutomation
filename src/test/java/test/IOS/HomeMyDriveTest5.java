package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.HomeMyDrivePage;
import reports.ExtentTestReports;

public class HomeMyDriveTest5 extends BaseTestIos {
    HomeMyDrivePage homeMyDrivePage;
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
        homeMyDrivePage = new HomeMyDrivePage(getAppiumDriver());
    }

    @Test
    public void HomeMyDriveTest() throws Exception {

        System.out.println("e. Kullanıcı 'HOME' ekranında 'My Drive' text ve ıconların görünür olduğunu doğrular.");
        Thread.sleep(2000);
        homeMyDrivePage
                .searchBarVisible()
                .settingsWidgetVisible()
                .myDriveText()
                .foldersText()
                .allFilesText()
                .getCloudText()
                .filesAreNotSyncedText()
                .storage()
                .modifiedDateText()
                .modifiedDateWidget()
                .onboardWidgetVisible()
                .onboardText()
                .addComponentiWidgetVisible()
                .addComponentiClick()
                .scanFromCameraTextVisible()
                .importFromGaleryTextVisible()
                .createFolderTextVisible()
                .addAddComponentiClosed()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}
