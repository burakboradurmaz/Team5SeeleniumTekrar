package _11_03_2025;

import Utilities.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
       // sublabel_8_first

       // Myfunc.Bekle(3);

        //form-sub-label
        //form-sub-label



       // WebElement element = driver.findElement(By.className("form-sub-label"));
       // System.out.println(element.getText());


        WebElement element1 = driver.findElement(By.id("first_8"));
        WebElement element2 = driver.findElement(By.id("last_8"));
        List<WebElement> elements = driver.findElements(By.className("form-sub-label"));
        int sayi = (int)(Math.random() * 2);
        if(elements.get(sayi).getText().equalsIgnoreCase("First Name")){
            System.out.println(elements.get(sayi).getText());
           // WebElement element1 = driver.findElement(By.id("first_8"));
            element1.sendKeys("Burak");
        }else {
           // WebElement element2 = driver.findElement(By.id("last_8"));
         element2.sendKeys("Durmaz");
        }
        Myfunc.Bekle(3);
        driver.quit();
    }
}
