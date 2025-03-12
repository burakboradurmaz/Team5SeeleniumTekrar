package _12_03_2025_;

import Utilities.BaseDriver;
import org.junit.Test;

public class _Soru1_ extends BaseDriver {
    // Senaryo:
    // 1-  https://qa-practice.netlify.app/auth_ecommerce  sayfasınız açınız
    // 2-  Email kutucuğuna "admin@admin.com" i yaziniz
    // 3-  Password kutucuğuna "admin123" yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  Açılan yeni sayfada "SHOPPING CART" yazısının göründüğünü Assert ile doğrulayınız

    @Test
    public void test01(){
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");





        BekleKapat();
    }




}
