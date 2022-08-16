package StepDefinitions;

import Utilities.GenelWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before(){
        System.out.println("Senaryo başladı");
    }
@After
    public void after(){
    //ekran görüntüsü al Senaryo hatalı ise
    System.out.println("Senaryo bitti.");
    GenelWD.quitDriver();
    }
}
