package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// pom cucumber testNG konutu nu burada kullandık.
@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, //buraya feturelerin yolu verilecek.
        glue = {"StepDefinitions"} // step definitions in klosörü yazılacak.


)
public class _01_TestRunner extends AbstractTestNGCucumberTests { // xml in cucumberdeki karşılığı import io.cucumber.testng.AbstractTestNGCucumberTests;


}
