import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing QA con selenium WebDriver");
        System.out.println("Iniciando WebDriver...");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");
        String title = driver.getTitle();
        System.out.println("Titulo es: " + title);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(" ");
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(" ");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
        driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
        driver.findElement(By.partialLinkText("Blue Jeans")).click();
        driver.findElement(By.id("addtocart_36_EnteredQuantity")).click();
        driver.findElement(By.id("addtocart_36_EnteredQuantity")).clear();
        driver.findElement(By.id("addtocart_36_EnteredQuantity")).sendKeys("4");
        driver.findElement(By.id("add-to-cart-button-36")).click();
        driver.findElement(By.linkText("Shopping cart")).click();
        Thread.sleep(30000);
        driver.close();
        System.out.println("fin del aplicativo.");

    }
}
