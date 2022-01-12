import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests extends Generic {

    @Test(enabled=true, description="Login to Book_my_show application")
    public void test_01() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MobileElement skip =driver.findElement(By.xpath("(//android.widget.TextView)[1]"));
        skip.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement location =driver.findElement(By.xpath("(//android.widget.LinearLayout)[2]/android.widget.Button[1]"));
        location.click();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        MobileElement allow =driver.findElement(By.xpath("(//android.widget.LinearLayout)[5]/android.widget.Button[2]"));
        allow.click();

    }
    @Test(enabled=true)
    public void test_02()
    {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement movie_name =driver.findElement(By.xpath("//android.widget.TextView[@text='Pushpa: The Rise - Part 01']"));
        movie_name.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement book_tic =driver.findElement(By.xpath("//android.widget.TextView[@text='Book tickets']"));
        book_tic .click();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        //   driver.switchTo().frame("com.bt.bms:id/view_pager_showtimes");

        MobileElement info =driver.findElement(By.xpath("//android.widget.TextView[@text='INFO']"));
        info.click();

        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

        MobileElement date =driver.findElement(By.xpath("//android.widget.TextView[@text='13']"));
        date.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement time =driver.findElement(By.xpath("//android.widget.TextView[@text='02:45 PM']"));
        time.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement accept =driver.findElement(By.xpath("(//android.widget.LinearLayout)[4]/android.widget.Button[2]"));
        accept.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        TouchAction action=new TouchAction(driver);

        action.tap(PointOption.point(292,1646)).waitAction().release().perform();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement select_seat=driver.findElement(By.xpath("//android.widget.Button"));
        select_seat.click();

        action.tap(PointOption.point(106,750)).waitAction().release().perform();

        action.tap(PointOption.point(169,816)).waitAction().release().perform();

        action.tap(PointOption.point(229,755)).waitAction().release().perform();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement pay=driver.findElement(By.xpath("//android.widget.Button"));
        pay.click();
        MobileElement user=driver.findElement(By.xpath("//android.widget.EditText[@text='Email Address']"));
        user.sendKeys("raghavendrask526@gmail.com");
        user.click();

        MobileElement phone=driver.findElement(By.xpath("/android.widget.EditText[@text='Phone']"));
        phone.sendKeys("6363844256");
        phone.click();

        MobileElement update=driver.findElement(By.xpath("/android.widget.Button[@text='Update Details']"));
        update.click();

        MobileElement payment=driver.findElement(By.xpath("//android.widget.Button"));
        payment.click();


    }


}

