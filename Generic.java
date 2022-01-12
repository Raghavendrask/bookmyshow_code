import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class Generic {
    static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void open_application() {


        try {
            DesiredCapabilities caps=new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
            //caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 5 Pro");
            //	caps.setCapability(MobileCapabilityType.UDID,"1be59027");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100");
            //caps.setCapability(MobileCapabilityType.APP,"ANDROID");
            //caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
            caps.setCapability("appPackage","com.bt.bms");
            caps.setCapability("appActivity","com.movie.bms.splashscreen.SplashScreenActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url,caps);
        }
        catch(Exception exp) {

            System.out.println("Cause is :"+exp.getCause());
            System.out.println("Message is :"+exp.getMessage());
            exp.printStackTrace();
        }
    }



    //@AfterTest
    //public void close_application() {


    //	driver.close();
    //}
}

