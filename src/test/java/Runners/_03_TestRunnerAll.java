package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//bütün testi çalıştırır

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/"}, //buraya feturelerin yolu verilecek.
        glue = {"StepDefinitions"}// step definitions in klosörü yazılacak.


)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {

}
