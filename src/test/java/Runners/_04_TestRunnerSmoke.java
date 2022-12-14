package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//bütün testi çalıştırır

@CucumberOptions(
        tags = "@SmokeTest", // hangi seneryolarda bu etiket varsa onlar çalıştıralacak
        features = {"src/test/java/FeatureFiles/"}, //buraya feturelerin yolu verilecek.
        glue = {"StepDefinitions"},// step definitions in klosörü yazılacak.
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"} // jenkins için eklendi
//,plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}  // master report için sonradan ekleniyor

)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests{

}
