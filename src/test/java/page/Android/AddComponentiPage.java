package page.Android;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AddComponentiPage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;
    public ExtentTest startTest = extent.createTest("Scanr Add Componenti Testi", "Add Componenti");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public AddComponentiPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By addComponentiWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.Button/android.widget.TextView");
    By scanFromCameraText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    By importFromGaleryText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
    By createFolderText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");

    public AddComponentiPage addComponentiWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement addComponentiIcon = driver.findElement(addComponentiWidget);
        Assert.assertTrue(addComponentiIcon.isDisplayed());
        passLog("1-) Kullanıcı home ekranındaki add componenti ıconu olduğunu görüntüler.");
        System.out.println("1-) Kullanıcı home ekranındaki add componenti ıconu olduğunu görüntüler.");
        return this;
    }

    public AddComponentiPage addComponentiClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement addComponentiClick = driver.findElement(addComponentiWidget);
        addComponentiClick.click();
        passLog("2-) Kullanıcı home ekranındaki add componenti tıklanabilir olduğunu görüntüler ve tıklar.");
        System.out.println("2-) Kullanıcı home ekranındaki add componenti tıklanabilir olduğunu görüntüler ve tıklar.");
        return this;
    }

    public AddComponentiPage scanFromCameraTextVisible () throws InterruptedException {
        Thread.sleep(2000);
        WebElement scanFromCameraTextVisible = driver.findElement(scanFromCameraText);
        Assert.assertTrue(scanFromCameraTextVisible.isDisplayed());
        passLog("3-) Kullanıcı home ekranındaki add componenti tıklar ve 'Scan From Camera' text'inin olduğunu görüntüler. ");
        System.out.println("3-) Kullanıcı home ekranındaki add componenti tıklar ve 'Scan From Camera' text'inin olduğunu görüntüler.");
        return this;
    }

    public AddComponentiPage importFromGaleryTextVisible () throws InterruptedException {
        Thread.sleep(2000);
        WebElement importFromGaleryTextVisible = driver.findElement(importFromGaleryText);
        Assert.assertTrue(importFromGaleryTextVisible.isDisplayed());
        passLog("4-) Kullanıcı home ekranındaki add componenti tıklar ve 'İmport From Galery' text'inin olduğunu görüntüler. ");
        System.out.println("4-) Kullanıcı home ekranındaki add componenti tıklar ve 'İmport From Galery' text'inin olduğunu görüntüler.");
        return this;
    }

    public AddComponentiPage createFolderTextVisible () throws InterruptedException {
        Thread.sleep(2000);
        WebElement createFolderTextVisible = driver.findElement(createFolderText);
        Assert.assertTrue(createFolderTextVisible.isDisplayed());
        passLog("5-) Kullanıcı home ekranındaki add componenti tıklar ve 'Create Folder' text'inin olduğunu görüntüler. ");
        System.out.println("5-) Kullanıcı home ekranındaki add componenti tıklar ve 'Create Folder' text'inin olduğunu görüntüler.");
        return this;
    }

    public AddComponentiPage addAddComponentiClosed () throws InterruptedException {
        Thread.sleep(1000);
        touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(553, 882)).release().perform();
        passLog("6-) Kullanıcı 'Add Componentinin' bulunduğu ekranı kapattı.");
        System.out.println("6-) Kullanıcı 'Add Componentinin' bulunduğu ekranı kapattı.");
        return this;
    }
    public AddComponentiPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("7-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("7-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
