package dev.jodatrash.automatization.menu;

import dev.jodatrash.automatization.utils.EnvUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuSelection {
  WebDriver driver;

  /*
  TODO: Modificar la manera de que no
    se inicie chrome al cargar la clase.
  */

  public void webCharge() {
    if (driver == null) {
      System.out.println("En espera de que se inicie el driver");
      driver = new ChromeDriver();
      driver.get("https://demowebshop.tricentis.com/");
      driver.manage().window().maximize();
    }
    String title = driver.getTitle();
    System.out.println("El titulo es: " + title);
  }

  public void webLogin() {
    webCharge();
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(EnvUtils.EMAIL);
    driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(EnvUtils.PASSWORD);
  }

  public void webClose() {
    if (driver != null) {
      driver.quit();
      driver = null;
      System.out.println("Fin del aplicativo.");
    }
  }

}
