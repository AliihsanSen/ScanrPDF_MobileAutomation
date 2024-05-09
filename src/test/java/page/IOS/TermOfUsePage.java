package page.IOS;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class TermOfUsePage extends BasePage {

    AppiumDriver driver;
    TouchAction touchAction;
    public ExtentTest startTest = extent.createTest("Scanr Terms Of Use Testi", "Terms Of Use Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public TermOfUsePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By TermsOfUse = By.xpath("//XCUIElementTypeStaticText[@name=\"By continuing, you agree to the \"]");
    By TermsOfServices = By.xpath("//XCUIElementTypeOther[@name=\"Terms of Use.\"]");

    public TermOfUsePage TermOfUseVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement TermsOfUseTextView = driver.findElement(TermsOfUse);
        Assert.assertTrue(TermsOfUseTextView.isDisplayed());
        passLog("1-) Kullanıcı onboard ekranının altında 'Terms Of  Use' text'i olduğunu görüntüler.");
        System.out.println("1-) Kullanıcı onboard ekranının altında 'Terms Of  Use' text'i olduğunu görüntüler.");
        return this;
    }

    public TermOfUsePage TermOfUseisSelected() throws InterruptedException {
        WebElement TermsOfServicesisSelected = driver.findElement(TermsOfServices);
        Thread.sleep(3000);
        Assert.assertTrue(TermsOfServicesisSelected.isEnabled());
        passLog("2-) Kullanıcı onboard ekranının altında 'Terms Of  Use' text'inin tıklanabilir olduğunu görüntüledi.");
        System.out.println("2-) Kullanıcı onboard ekranının altında 'Terms Of  Use' text'inin tıklanabilir olduğunu görüntüledi.");
        return this;
    }

    public TermOfUsePage TermOfServiceClick() throws InterruptedException {
        WebElement TermsOfServiceClick = driver.findElement(TermsOfServices);
        Thread.sleep(3000);
        TermsOfServiceClick.click();
        passLog("3-) Kullanıcı onboard ekranının altında 'Terms Of  Use' text'ine tıklayarak sözleşme ekranı açıldı.");
        System.out.println("3-) Kullanıcı onboard ekranının altında 'Terms Of  Use' text'ine tıklayarak sözleşme ekranı açıldı.");
        return this;
    }

    public TermOfUsePage TermOfServiceClosed() throws InterruptedException {
        Thread.sleep(1000);
        touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(191, 45))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
                moveTo(PointOption.point(202, 574)).release().perform();
        Thread.sleep(2000);
        passLog("4-) Kullanıcı 'Terms Of Use' sözleşmelerinin bulunduğu ekranı kapattı.");
        System.out.println("4-) Kullanıcı 'Terms Of Use' sözleşmelerinin bulunduğu ekranı kapattı.");
        return this;
    }

    public TermOfUsePage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("5-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("5-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
