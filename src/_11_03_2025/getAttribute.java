package _11_03_2025;

import Utilities.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        MyFunc.Bekle(3);

        WebElement usernameField = driver.findElement(By.id("first_8"));

        System.out.println("usernameField.getAttribute(\"type\") = " + usernameField.getAttribute("type"));
        System.out.println("usernameField.getAttribute(\"type\") = " + usernameField.getAttribute("id"));
        System.out.println("usernameField.getAttribute(\"type\") = " + usernameField.getAttribute("name"));
        System.out.println("usernameField.getAttribute(\"type\") = " + usernameField.getAttribute("class"));
        System.out.println("usernameField.getAttribute(\"type\") = " + usernameField.getAttribute("value"));
        usernameField.sendKeys("Merhaba");
        System.out.println("usernameField.getAttribute(\"type\") = " + usernameField.getAttribute("value"));

    }
}
