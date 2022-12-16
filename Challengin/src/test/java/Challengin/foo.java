package Challengin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;


public class foo {
    /**
     * @throws InterruptedException
     */
    @Test
    public void acessandoPagina() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\elisama.lima\\Documents\\Lisa\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/challenging_dom");


        // To Delay execution for 10 sec
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class=\"large-2 columns\"]/a[@class=\"button success\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[2]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[2]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[3]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[3]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[4]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[4]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[5]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[5]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[6]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[6]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[7]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[7]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[8]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[8]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[9]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[9]/td[7]/a[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[10]/td[7]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[10]/td[7]/a[2]")).click();
        Thread.sleep(5000);


        driver.quit();

    }
}
