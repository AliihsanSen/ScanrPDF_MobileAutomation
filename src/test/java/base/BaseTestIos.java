package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;  // iOS için bu sürücüyü ekliyoruz.
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import reports.ExtentTestReports;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTestIos extends ExtentTestReports {

    static AppiumDriver appiumDriver = null;

    public static WebDriverWait wait;

    @BeforeClass
    public void setup() {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "iOS");
            cap.setCapability("deviceName", "iPhone SE (3rd generation)");
            cap.setCapability("platformVersion", "17.0");
            cap.setCapability("appium:UDID", "BB488412-4165-4E26-A04B-7F8AC85EDBF4");
            cap.setCapability("automationName", "XCUITest");
            cap.setCapability("appium:skipUnlock", "true"); // Satıcı önekini ekledik
            cap.setCapability("noReset", "true");

            // Uygulama yolunuza göre düzenleyin. iOS için genellikle .app uzantılı bir dosya beklenir.
            cap.setCapability("app", "/Users/tribe/Desktop/Projects/ScanrTestNG/src/test/resources/scanner.app");
            /**
             *             => App uzantılı dosyayı çalıştırabilmeniz için geliştiriciden davet almanız
             *             ve uygulamanın kaynak kodlarına ihtiyacınız bulunmaktadır.
              */

            appiumDriver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723"), cap);
            wait = new WebDriverWait(appiumDriver, 30);

        } catch (MalformedURLException mx) {
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");
        }
    }

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void setAppiumDriver(AppiumDriver appiumDriver) {
        BaseTestIos.appiumDriver = appiumDriver;
    }

    @AfterClass
    public void tearDown() {
        if (getAppiumDriver() != null) {
            getAppiumDriver().quit();
        }  }

}
