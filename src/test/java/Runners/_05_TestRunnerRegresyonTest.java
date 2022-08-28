package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@SmokeTest olan bütün testi çalıştırır

@CucumberOptions(// or olduğunda herhangi birtanesi varsa çalıştırır.
// And olduğunda her ikisinide tag olarak olan senaryoları çalıştırır.
        tags = "@Regression or @SmokeTest", // hangi seneryolarda bu etiket varsa onlar çalıştıralacak
        features = {"src/test/java/FeatureFiles/"}, //buraya feturelerin yolu verilecek.
        glue = {"StepDefinitions"}// step definitions in klosörü yazılacak.

)

public class _05_TestRunnerRegresyonTest extends AbstractTestNGCucumberTests{
    //browser tipi vermek için , rapora ek parametre eklemek için sonra kullacağız.

}


