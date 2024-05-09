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


public class OnboardPage extends BasePage {

    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Onboard Ekranı Testi", "Onboard Ekranı Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public OnboardPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By scanWithEaseWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Scan with Ease Effortlessly capture high-quality scans of documents, receipts, and more with Scanr.\"])[1]/XCUIElementTypeOther[1]");
    By scanWithEaseText1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Scan with Ease\"]");
    By scanWithEaseText2 = By.xpath("//XCUIElementTypeStaticText[@name=\"Effortlessly capture high-quality scans of documents, receipts, and more with Scanr.\"]");
    By button = By.xpath("(//XCUIElementTypeOther[@name=\"Scan with Ease Effortlessly capture high-quality scans of documents, receipts, and more with Scanr. Edit on the Go Use Scanr's editing tools to enhance your scans by cropping, rotating, and adjusting brightness and contrast for professional-looking files. Export and Share Instantly Easily share your scans as PDF or JPEG files via email or cloud storage services with Scanr. By continuing, you agree to the  Terms of Use.\"])[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    By editOnTheGoWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Edit on the Go Use Scanr's editing tools to enhance your scans by cropping, rotating, and adjusting brightness and contrast for professional-looking files.\"])[1]/XCUIElementTypeOther[1]");
    By editOnTheGoText1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Edit on the Go\"]");
    By editOnTheGoText2 = By.xpath("//XCUIElementTypeStaticText[@name=\"Use Scanr's editing tools to enhance your scans by cropping, rotating, and adjusting brightness and contrast for professional-looking files.\"]");
    By exportAndShareInstantly = By.xpath("(//XCUIElementTypeOther[@name=\"Export and Share Instantly Easily share your scans as PDF or JPEG files via email or cloud storage services with Scanr.\"])[1]/XCUIElementTypeOther[1]");
    By exportAndShareInstantlyText1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Export and Share Instantly\"]");
    By exportAndShareInstantlyText2 = By.xpath("//XCUIElementTypeStaticText[@name=\"Easily share your scans as PDF or JPEG files via email or cloud storage services with Scanr.\"]");

    public OnboardPage scanWithEaseWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scanWithEaseIcon = driver.findElement(scanWithEaseWidget);
        Assert.assertTrue(scanWithEaseIcon.isDisplayed());
        passLog("1-) Kullanıcı onboard ekranında 'Scan with Ease' ıconu olduğunu görüntüler.");
        System.out.println("1-) Kullanıcı onboard ekranında 'Scan with Ease' ıconu olduğunu görüntüler.");
        return this;
    }

    public OnboardPage scanWithEaseText1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scanWithEaseText1Visible = driver.findElement(scanWithEaseText1);
        Assert.assertTrue(scanWithEaseText1Visible.isDisplayed());
        passLog("2-) Kullanıcı onboard ekranında bulunan ıconun altında 'Scan with Ease' text'i olduğunu görüntüler.");
        System.out.println("2-) Kullanıcı onboard ekranında bulunan ıconun altında 'Scan with Ease' text'i olduğunu görüntüler.");
        return this;
    }

    public OnboardPage scanWithEaseText2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scanWithEaseText2Visible = driver.findElement(scanWithEaseText2);
        Assert.assertTrue(scanWithEaseText2Visible.isDisplayed());
        passLog("3-) Kullanıcı onboard ekranında bulunan ıconun altında 'Scan with Ease' text'inin altında açıklama text'i olduğunu görüntüler.");
        System.out.println("3-) Kullanıcı onboard ekranında bulunan ıconun altında 'Scan with Ease' text'inin altında açıklama text'i olduğunu görüntüler.");
        return this;
    }

    public OnboardPage buttonClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement buttonClick = driver.findElement(button);
        buttonClick.click();
        passLog("4-) Kullanıcı diğer onboard ekranını görüntülemek için butona tıklar.");
        System.out.println("4-) Kullanıcı diğer onboard ekranını görüntülemek için butona tıklar.");
        return this;

    }

    public OnboardPage editOnTheGoWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement editOnTheGoIcon = driver.findElement(editOnTheGoWidget);
        Assert.assertTrue(editOnTheGoIcon.isDisplayed());
        passLog("5-) Kullanıcı onboard ekranında 'Edit on the Go' ıconu olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı onboard ekranında 'Edit on the Go' ıconu olduğunu görüntüler.");
        return this;
    }

    public OnboardPage editOnTheGoText1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement editOnTheGoText1Visible = driver.findElement(editOnTheGoText1);
        Assert.assertTrue(editOnTheGoText1Visible.isDisplayed());
        passLog("6-) Kullanıcı onboard ekranında bulunan ıconun altında 'Edit on the Go' text'i olduğunu görüntüler.");
        System.out.println("6-) Kullanıcı onboard ekranında bulunan ıconun altında 'Edit on the Go' text'i olduğunu görüntüler.");
        return this;
    }

    public OnboardPage editOnTheGoText2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement editOnTheGoText2Visible = driver.findElement(editOnTheGoText2);
        Assert.assertTrue(editOnTheGoText2Visible.isDisplayed());
        passLog("7-) Kullanıcı onboard ekranında bulunan ıconun altında 'Edit on the Go' text'inin altında açıklama text'i olduğunu görüntüler.");
        System.out.println("7-) Kullanıcı onboard ekranında bulunan ıconun altında 'Edit on the Go' text'inin altında açıklama text'i olduğunu görüntüler.");
        return this;
    }

    public OnboardPage buttonClick2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement buttonClick = driver.findElement(button);
        buttonClick.click();
        passLog("8-) Kullanıcı diğer onboard ekranını görüntülemek için butona tıklar.");
        System.out.println("8-) Kullanıcı diğer onboard ekranını görüntülemek için butona tıklar.");
        return this;

    }

    public OnboardPage exportAndShareInstantlyVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement exportAndShareInstantlyIcon = driver.findElement(exportAndShareInstantly);
        Assert.assertTrue(exportAndShareInstantlyIcon.isDisplayed());
        passLog("9-) Kullanıcı onboard ekranında 'Export and Share Instantly' ıconu olduğunu görüntüler.");
        System.out.println("9-) Kullanıcı onboard ekranında 'Export and Share Instantly' ıconu olduğunu görüntüler.");
        return this;
    }

    public OnboardPage exportAndShareInstantlyText1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement exportAndShareInstantlyText1Visible = driver.findElement(exportAndShareInstantlyText1);
        Assert.assertTrue(exportAndShareInstantlyText1Visible.isDisplayed());
        passLog("10-) Kullanıcı onboard ekranında bulunan ıconun altında 'Export and Share Instantly' text'i olduğunu görüntüler.");
        System.out.println("10-) Kullanıcı onboard ekranında bulunan ıconun altında 'Export and Share Instantly' text'i olduğunu görüntüler.");
        return this;
    }

    public OnboardPage exportAndShareInstantlyText2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement exportAndShareInstantlyText2Visible = driver.findElement(exportAndShareInstantlyText2);
        Assert.assertTrue(exportAndShareInstantlyText2Visible.isDisplayed());
        passLog("11-) Kullanıcı onboard ekranında bulunan ıconun altında 'Export and Share Instantly' text'inin altında açıklama text'i olduğunu görüntüler.");
        System.out.println("11-) Kullanıcı onboard ekranında bulunan ıconun altında 'Export and Share Instantly' text'inin altında açıklama text'i olduğunu görüntüler.");
        return this;
    }

    public OnboardPage buttonClick3() throws InterruptedException {
        Thread.sleep(1000);
        WebElement buttonClick = driver.findElement(button);
        buttonClick.click();
        passLog("12-) Kullanıcı diğer notification ekranını görüntülemek için butona tıklar ve notification ekranına gider.");
        System.out.println("12-) Kullanıcı diğer notification ekranını görüntülemek için butona tıklar ve notification ekranına gider.");
        return this;
    }

    public OnboardPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("13-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("13-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
