package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                          "src/test/java/FeatureFiles/_02_Country.feature"
        }, //buraya feturelerin yolu verilecek.
        glue = {"StepDefinitions"}, // step definitions in klosörü yazılacak.
        dryRun = true //  true olursa testi çalıştırmaz sadece featura ait steplerin varlığını kontrol eder.
        //false olduğunda ise testi çalıştırır.

)
public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {

}
