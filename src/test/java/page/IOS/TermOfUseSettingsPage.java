package page.IOS;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class TermOfUseSettingsPage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Term Of Use Settings Testi", "Term Of Use Settings Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public TermOfUseSettingsPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[5]/XCUIElementTypeTextField");
    By settingsWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
    By myDriveText = By.xpath("(//XCUIElementTypeOther[@name=\"My Drive\"])[2]");
    By settingsHeaderText = By.xpath("//XCUIElementTypeStaticText[@name=\"Settings\"]");
    By termsOfUseButtonText = By.xpath("//XCUIElementTypeOther[@name=\"Terms of Use\"]");
    By settingsBackWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Settings\"])[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    public TermOfUseSettingsPage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }
    public TermOfUseSettingsPage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isDisplayed());
        passLog("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public TermOfUseSettingsPage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isDisplayed());
        passLog("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public TermOfUseSettingsPage settingsWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsClick = driver.findElement(settingsWidget);
        settingsClick.click();
        Thread.sleep(2000);
        passLog("4-) Kullanıcı home ekranında 'Settings' butonuna tıklar.");
        System.out.println("4-) Kullanıcı home ekranında 'Settings' butonuna tıklar.");
        return this;
    }

    public TermOfUseSettingsPage settingsHeaderVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement settingsHeaderTextVisible = driver.findElement(settingsHeaderText);
        Assert.assertTrue(settingsHeaderTextVisible.isDisplayed());
        passLog("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        return this;
    }
    public TermOfUseSettingsPage termOfUseButtonText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement termsOfUseButtonTextVisible = driver.findElement(termsOfUseButtonText);
        Assert.assertTrue(termsOfUseButtonTextVisible.isDisplayed());
        passLog("6-) Kullanıcı settings ekranında 'Term Of Use' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
         System.out.println("6-) Kullanıcı settings ekranında 'Term Of Use' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public TermOfUseSettingsPage termOfUseButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement termsOfUseButtonTextClick = driver.findElement(termsOfUseButtonText);
        termsOfUseButtonTextClick.click();
        passLog("7-) Kullanıcı settings ekranında 'Term Of Use' text'ine tıklar.");
        System.out.println("7-) Kullanıcı settings ekranında 'Term Of Use' text'ine tıklar.");
        return this;
    }
    public TermOfUseSettingsPage termOfUseClosed() throws InterruptedException {
        Thread.sleep(1000);
        touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(184, 50))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
                moveTo(PointOption.point(173, 552)).release().perform();
        Thread.sleep(2000);
        passLog("8-) Kullanıcı 'Term Of Use' sözleşmesinin bulunduğu ekranı kapattı.");
        System.out.println("8-) Kullanıcı 'Term Of Use' sözleşmesinin bulunduğu ekranı kapattı.");
        return this;
    }

    public TermOfUseSettingsPage backWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement backWidgetClick = driver.findElement(settingsBackWidget);
        backWidgetClick.click();
        passLog("8-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        System.out.println("8-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        return this;
    }

    public TermOfUseSettingsPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("9-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("9-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
