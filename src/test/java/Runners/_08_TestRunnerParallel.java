package Runners;


import Utilities.GenelWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
)
public class _08_TestRunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true) // bazı java versiyon hataları için, BROWSER bulamadım hatası verdiğinde msg: Optional olarak ekle
    @Parameters("browser")
    public void beforeClass(String browser)
    {
        GenelWD.threadBrowserName.set(browser);
        //burada browser set edilecek
        // bu threade browsername set edildi.
    }

//    @AfterClass(alwaysRun = true) // bazı java versiyon hatalırı için, alternatif browser kapatma
//    public void afterClass() {
//        GWD.quitDriver();
//    }
}