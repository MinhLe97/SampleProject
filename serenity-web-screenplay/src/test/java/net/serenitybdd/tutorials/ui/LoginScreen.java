package net.serenitybdd.tutorials.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {
    public static Target USERNAME = Target.the("Username text field").located(By.name("uid"));
    public static Target PASSWORD = Target.the("Password text field").located(By.name("password"));
}
