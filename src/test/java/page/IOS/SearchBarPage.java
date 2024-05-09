package page.IOS;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SearchBarPage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Home Ekranı Search Bar Testi", "Home Ekranı Search Bar Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public SearchBarPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[5]/XCUIElementTypeTextField");
    By settingsWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
    By myDriveText = By.xpath("(//XCUIElementTypeOther[@name=\"My Drive\"])[2]");
    By backWidget = By.xpath("(//XCUIElementTypeOther[@name=\"\uE61C\"])[2]");
    By onboardWidget = By.xpath("(//XCUIElementTypeOther[@name=\"You do not have a file yet.\n" +
            " Create now!\"])[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[27]");
    By onboardText = By.xpath("//XCUIElementTypeStaticText[@name=\"You do not have a file yet.\n" +
            " Create now!\"]");

    public SearchBarPage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isEnabled());
        passLog("1-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SearchBarPage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("2-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SearchBarPage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isEnabled());
        passLog("3-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SearchBarPage searchBarClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarClick = driver.findElement(searchBar);
        searchBarClick.click();
        passLog("4-) Kullanıcı home ekranında 'Search Bar' butonuna tıklar.");
        System.out.println("4-) Kullanıcı home ekranında 'Search Bar' butonuna tıklar.");
        return this;
    }
    public SearchBarPage searchBarWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement onboardWidgetIcon = driver.findElement(onboardWidget);
        Assert.assertTrue(onboardWidgetIcon.isDisplayed());
        passLog("5-) Kullanıcı search bar ekranında 'Search Bar' ıconu olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı search bar ekranında 'Search Bar' ıconu olduğunu görüntüler.");
        return this;
    }
    public SearchBarPage searchBarText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement onboardTextVisible = driver.findElement(onboardText);
        Assert.assertTrue(onboardTextVisible.isDisplayed());
        passLog("6-) Kullanıcı search bar ekranında 'You do not have a file yet." +
                " Create now!' texti olduğunu görüntüler.");
        System.out.println("6-) Kullanıcı search bar ekranında 'You do not have a file yet." +
                " Create now!' texti olduğunu görüntüler.");
        return this;
    }

    public SearchBarPage backWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement backWidgetIcon = driver.findElement(backWidget);
        Assert.assertTrue(backWidgetIcon.isEnabled());
        passLog("7-) Kullanıcı search bar ekranında 'Back' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("7-) Kullanıcı search bar ekranında 'Back' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }
    public SearchBarPage backWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement backWidgetClick = driver.findElement(backWidget);
        backWidgetClick.click();
        passLog("8-) Kullanıcı search bar ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        System.out.println("8-) Kullanıcı search bar ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        return this;
    }
    public SearchBarPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("9-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("9-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
