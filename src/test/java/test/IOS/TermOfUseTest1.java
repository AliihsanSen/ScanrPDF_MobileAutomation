package test.IOS;

import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;

import page.IOS.TermOfUsePage;
import reports.ExtentTestReports;

public class TermOfUseTest1 extends BaseTestIos {

    TermOfUsePage termOfUsePage;
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
    public void before() {termOfUsePage = new TermOfUsePage(getAppiumDriver());}

    @Test
    public void TermOfUseTest() throws Exception {

        System.out.println("a. Kullanıcı onboard ekranındaki 'TERMS OF USE' linkimizin görüntüler " +
                "ve tıklanabilir olup olmadığını test eder.");
        Thread.sleep(2000);
        termOfUsePage
                .TermOfUseVisible()
                .TermOfUseisSelected()
                .TermOfServiceClick()
                .TermOfServiceClosed()
                .finishTest();


    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
