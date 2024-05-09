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

public class NotificationPage extends BasePage {

    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Notification Ekranı Testi", "Onboard Ekranı Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public NotificationPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By stayInTheLoopWigdet = By.xpath("(//XCUIElementTypeOther[@name=\"Stay in the Loop Enable notifications to stay updated on the status of your scanned files and new features and updates. Allow By continuing, you agree to the  Terms of Use.\"])[4]/XCUIElementTypeOther[1]");
    By stayInTheLoopText1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Stay in the Loop\"]");
    By stayInTheLoopText2 = By.xpath("//XCUIElementTypeStaticText[@name=\"Enable notifications to stay updated on the status of your scanned files and new features and updates.\"]");
    By xCloseIcon = By.xpath("(//XCUIElementTypeOther[@name=\"\uE633\"])[6]");
    By allowButton = By.xpath("//XCUIElementTypeButton[@name=\"button\"]");
    By allowAlert = By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]");

    public NotificationPage stayInTheLoopWigdetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement stayInTheLoopIcon = driver.findElement(stayInTheLoopWigdet);
        Assert.assertTrue(stayInTheLoopIcon.isDisplayed());
        passLog("1-) Kullanıcı notification ekranında 'Stay in The Loop' ıconu olduğunu görüntüler.");
        System.out.println("1-) Kullanıcı notification ekranında 'Stay in The Loop' ıconu olduğunu görüntüler.");
        return this;
    }

    public NotificationPage stayInTheLoopText1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement stayInTheLoopText1Visible = driver.findElement(stayInTheLoopText1);
        Assert.assertTrue(stayInTheLoopText1Visible.isDisplayed());
        passLog("2-) Kullanıcı notification ekranında bulunan ıconun altında 'Stay in The Loop' text'i olduğunu görüntüler.");
        System.out.println("2-) Kullanıcı notification ekranında bulunan ıconun altında 'Stay in The Loop' text'i olduğunu görüntüler.");
        return this;
    }

    public NotificationPage stayInTheLoopText2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement stayInTheLoopText2Visible = driver.findElement(stayInTheLoopText2);
        Assert.assertTrue(stayInTheLoopText2Visible.isDisplayed());
        passLog("3-) Kullanıcı notification ekranında bulunan ıconun altında 'Stay in The Loop' text'inin altında açıklama text'i olduğunu görüntüler.");
        System.out.println("3-) Kullanıcı notification ekranında bulunan ıconun altında 'Stay in The Loop' text'inin altında açıklama text'i olduğunu görüntüler.");
        return this;
    }

    public NotificationPage xCloseVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseIconVisible = driver.findElement(xCloseIcon);
        Assert.assertTrue(xCloseIconVisible.isDisplayed());
        passLog("4-) Kullanıcı notification ekranının sağ üst köşesinde (x) ıconu olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("4-) Kullanıcı notification ekranının sağ üst köşesinde (x) ıconu olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public NotificationPage buttonClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement buttonClick = driver.findElement(allowButton);
        buttonClick.click();
        passLog("5-) Kullanıcı diğer home ekranını görüntülemek için butona tıklar.");
        System.out.println("5-) Kullanıcı diğer home ekranını görüntülemek için butona tıklar.");
        return this;

    }

    public NotificationPage allowAlert() throws InterruptedException {
        Thread.sleep(1000);
        WebElement allowAlertClick = driver.findElement(allowAlert);
        allowAlertClick.click();
        passLog("6-) Kullanıcı 'Allow' butonuna tıkladıktan sonra alert çıktığını ve bildirimlere izin vermek isteyip istemediğini sorulduğunu görüntüler.");
        System.out.println("6-) Kullanıcı 'Allow' butonuna tıkladıktan sonra alert çıktığını ve bildirimlere izin vermek isteyip istemediğini sorulduğunu görüntüler.");
        return this;

    }

    public NotificationPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("7-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("7-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}

