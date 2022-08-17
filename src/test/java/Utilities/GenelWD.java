package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWD {
    private static WebDriver driver;

    public static WebDriver getDriver() {

// GEREKSİZ YAZILARI SİLİYOR BAŞLADI
        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");  // terminalden boni garcia kaldırma için kullandık
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        //     BİTTİ

        
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            //firefox
//            WebDriverManager.firefoxdriver().setup();
//            driver=new FirefoxDriver();
        }
        return driver;
    }
    public static void quitDriver()
    {
     /*   try {//beklemeyi azalmak için kapattık
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        if (driver != null) { // driver varsa
            driver.quit();
            driver=null;
        }
    }


}
