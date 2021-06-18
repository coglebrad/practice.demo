package tests;

import base.BaseClass;
import base.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTests extends BaseClass{


    @Test
    public void FirstTest(){
        invokeBrowser("https://the-internet.herokuapp.com/");
        link("Checkboxes");
        System.out.println("boo");

    }

    @Test
    public void SecondTest(){
        invokeBrowser("https://the-internet.herokuapp.com/");
        link("Dropdown");
        System.out.println("boo");
    }

    @Test
    public void ThirdTest(){
        invokeBrowser("https://the-internet.herokuapp.com/");
        link("Frames");
        System.out.println("boo");
    }

    @Test
    public void FourthTest(){
        invokeBrowser("https://the-internet.herokuapp.com/");
        link("Inputs");
        System.out.println("boo");
    }
}
