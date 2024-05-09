package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.HomeFoldersPage;
import reports.ExtentTestReports;

public class HomeFoldersTest6 extends BaseTestIos {
    HomeFoldersPage homeFoldersPage;
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
        homeFoldersPage = new HomeFoldersPage(getAppiumDriver());
    }

    @Test
    public void HomeFoldersTest() throws Exception {

        System.out.println("f. Kullanıcı 'HOME' ekranında 'Folders' text ve ıconların görünür olduğunu doğrular.");
        Thread.sleep(2000);

        homeFoldersPage
                .searchBarVisible()
                .settingsWidgetVisible()
                .myDriveText()
                .foldersText()
                .foldersClick()
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
                .createFolderTextVisible()
                .addAddComponentiClosed()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}