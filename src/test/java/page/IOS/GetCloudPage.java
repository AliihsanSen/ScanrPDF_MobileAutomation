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

public class GetCloudPage extends BasePage {

    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Home Ekranı Get Cloud Testi", "Home Ekranı Get Cloud Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public GetCloudPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By getCloudText = By.xpath("(//XCUIElementTypeOther[@name=\"Get Cloud Files are not synced 0.00 B/50.00 MB\"])[2]");
    By xCloseButton = By.xpath("(//XCUIElementTypeOther[@name=\"Restore\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    By restoreText = By.xpath("(//XCUIElementTypeOther[@name=\"Restore\"])[3]");
    By proScanText = By.xpath("//XCUIElementTypeButton[@name=\"PRO SCAN\"]");
    By unlimitedtext = By.xpath("//XCUIElementTypeButton[@name=\"UNLIMITED\"]");
    By subcriptionWidget = By.xpath("(//XCUIElementTypeOther[@name=\"\uDB83\uDE1E Basic document allowance \uDB83\uDE1E Ad-free experience \uDB83\uDE1E Includes watermark \uDB83\uDE1E Standart resolution \uDB83\uDE1E 1GB storage space \uDB83\uDE1E Folder creation\"])[1]");
    By continueButton = By.xpath("(//XCUIElementTypeOther[@name=\"Continue\"])[2]");
    By scaleWidget = By.xpath("//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"]");
    By policyText = By.xpath("//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"]");

    public GetCloudPage getCloudText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement getCloudTextVisible = driver.findElement(getCloudText);
        Assert.assertTrue(getCloudTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'Get Cloud' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'Get Cloud' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage getCloudClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement getCloudClick = driver.findElement(getCloudText);
        getCloudClick.click();
        passLog("2-) Kullanıcı home ekranında 'Get Cloud' texti'ne tıklar ve subscription ekranının açıldığını görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Get Cloud' texti'ne tıklar ve subscription ekranının açıldığını görüntüler.");
        return this;
    }

    public GetCloudPage xCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseButtonIcon = driver.findElement(xCloseButton);
        Assert.assertTrue(xCloseButtonIcon.isDisplayed());
        passLog("3-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage restoreText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement restoreTextVisible = driver.findElement(restoreText);
        Assert.assertTrue(restoreTextVisible.isDisplayed());
        passLog("4-) Kullanıcı subscription ekranının sağ üst tarafında 'restore' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("4-) Kullanıcı subscription ekranının sağ üst tarafında 'restore' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage unlimitedtext() throws InterruptedException {
        Thread.sleep(1000);
        WebElement unlimitedtextVisible = driver.findElement(unlimitedtext);
        Assert.assertTrue(unlimitedtextVisible.isDisplayed());
        passLog("5-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("5-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage proScanText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement proScanTextVisible = driver.findElement(proScanText);
        Assert.assertTrue(proScanTextVisible.isDisplayed());
        passLog("6-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("6-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage subcriptionWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement subcriptionWidgetIcon = driver.findElement(subcriptionWidget);
        Assert.assertTrue(subcriptionWidgetIcon.isDisplayed());
        passLog("7-) Kullanıcı subscription ekranında 'subcription' ıconu olduğunu görüntüler.");
        System.out.println("7-) Kullanıcı subscription ekranında 'subcription' ıconu olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage subcriptionText() throws InterruptedException {
        Thread.sleep(1000);
        passLog("8-) Kullanıcı subscription ekranında subcription text'leri olduğunu görüntüler.");
        System.out.println("8-) Kullanıcı subscription ekranında subcription text'leri olduğunu görüntüler.");
        String subcriptionText1 = "//XCUIElementTypeStaticText[@name=\"Basic document allowance\"]";
        String subcriptionText2 = "//XCUIElementTypeStaticText[@name=\"Ad-free experience\"]";
        String subcriptionText3 = "//XCUIElementTypeStaticText[@name=\"Includes watermark\"]";
        String subcriptionText4 = "//XCUIElementTypeStaticText[@name=\"Standart resolution\"]";
        String subcriptionText5 = "//XCUIElementTypeStaticText[@name=\"1GB storage space\"]";
        String subcriptionText6 = "//XCUIElementTypeStaticText[@name=\"Folder creation\"]";
        WebElement subcriptionTexts1 = driver.findElement(By.xpath(subcriptionText1));
        WebElement subcriptionTexts2 = driver.findElement(By.xpath(subcriptionText2));
        WebElement subcriptionTexts3 = driver.findElement(By.xpath(subcriptionText3));
        WebElement subcriptionTexts4 = driver.findElement(By.xpath(subcriptionText4));
        WebElement subcriptionTexts5 = driver.findElement(By.xpath(subcriptionText5));
        WebElement subcriptionTexts6 = driver.findElement(By.xpath(subcriptionText6));
        System.out.println("* " + subcriptionTexts1.getText() + "\n" + "* "
                + subcriptionTexts2.getText() + "\n" + "* "+ subcriptionTexts3.getText() + "\n"
                + "* "+ subcriptionTexts4.getText() + "\n" + "* "+ subcriptionTexts5.getText() + "\n"
                + "* "+ subcriptionTexts6.getText());
        passLog("* " + subcriptionTexts1.getText() + "\n" + "* "
                + subcriptionTexts2.getText() + "\n" + "* "+ subcriptionTexts3.getText() + "\n"
                + "* " + subcriptionTexts4.getText() + "\n" + "* "+ subcriptionTexts5.getText() + "\n"
                + "* "+ subcriptionTexts6.getText());
        return this;
    }

    public GetCloudPage subcriptionPurchase() throws InterruptedException {
        Thread.sleep(1000);
        passLog("9-) Kullanıcı subscription ekranında subcription fiyatlandırmaların olduğunu görüntüler.");
        System.out.println("9-) Kullanıcı subscription ekranında subcription fiyatlandırmaların olduğunu görüntüler.");
        String subcriptionPurchase1 = "//XCUIElementTypeOther[@name=\"Weekly $1.99\"]";
        String subcriptionPurchase2 = "//XCUIElementTypeOther[@name=\"Monthly $3.99\"]";
        String subcriptionPurchase3 = "//XCUIElementTypeOther[@name=\"Quarterly $9.99\"]";
        String subcriptionPurchase4 = "//XCUIElementTypeOther[@name=\"Annualy $34.99\"]";
        WebElement subcriptionPurchases1 = driver.findElement(By.xpath(subcriptionPurchase1));
        WebElement subcriptionPurchases2 = driver.findElement(By.xpath(subcriptionPurchase2));
        WebElement subcriptionPurchases3 = driver.findElement(By.xpath(subcriptionPurchase3));
        WebElement subcriptionPurchases4 = driver.findElement(By.xpath(subcriptionPurchase4));
        System.out.println("* " + subcriptionPurchases1.getText() + "\n" + "* " + subcriptionPurchases2.getText()
                + "\n" + "* " + subcriptionPurchases3.getText() + "\n" + "* " + subcriptionPurchases4.getText());
        passLog("* " + subcriptionPurchases1.getText() + "\n" + "* " + subcriptionPurchases2.getText()
                + "\n" + "* " + subcriptionPurchases3.getText() + "\n" + "* " + subcriptionPurchases4.getText());
        return this;
    }

    public GetCloudPage continueButtonVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement continueButtonVisible = driver.findElement(continueButton);
        Assert.assertTrue(continueButtonVisible.isDisplayed());
        passLog("10-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        System.out.println("10-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage scaleWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scaleWidgetVisible = driver.findElement(scaleWidget);
        Assert.assertTrue(scaleWidgetVisible.isDisplayed());
        passLog("11-) Kullanıcı subscription ekranının altında 'Scale' butonu olduğunu görüntüler.");
        System.out.println("11-) Kullanıcı subscription ekranının altında 'Scale' butonu olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage scaleWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scaleClick = driver.findElement(scaleWidget);
        scaleClick.click();
        passLog("12-) Kullanıcı subscription ekranının altında 'Scale' butonuna tıklar.");
        System.out.println("12-) Kullanıcı subscription ekranının altında 'Scale' butonuna tıklar");
        return this;
    }

    public GetCloudPage policyTextVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement policyTextVisible = driver.findElement(policyText);
        Assert.assertTrue(policyTextVisible.isDisplayed());
        passLog("13-) Kullanıcı subscription ekranında scale butonuna tıkladığı" +
                " zaman 'Continuing you are confirming that you have reciewed and agree to our " +
                "Terms of Service and Privacy Policy' olduğunu görüntüler.");
        System.out.println("13-) Kullanıcı subscription ekranında scale butonuna tıkladığı" +
                " zaman 'Continuing you are confirming that you have reciewed and agree to our " +
                "Terms of Service and Privacy Policy' olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage xCloseClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseClick = driver.findElement(xCloseButton);
        xCloseClick.click();
        passLog("14-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        System.out.println("14-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        return this;
    }

    public GetCloudPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("15-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("15-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }

}
