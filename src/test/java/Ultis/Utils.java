package Ultis;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	public static void Click(WebDriver driver, By by) {
		 int timeout = 3;
	        while (!(timeout <= 0)) {
	            try {
	                WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
	                Actions actions = new Actions(driver);
	                WebElement mainMenu = element;
	                actions.moveToElement(mainMenu).build().perform();
	                element.click();
	                return;
	            } catch (Exception e) {
	                System.err.println("Erro na acao de click");
	                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	            }

	 

	            timeout--;
	        }
	        Assert.fail("Erro na acao de click do framework");
		    
	}
	
	public static void selectElementVisibleText(WebDriver driver, By by, String Name) {
        WebElement element = driver.findElement(by);
        Select selectitem = new Select(element);
        selectitem.selectByVisibleText(Name);
    }
	
	public static void selectElementByValueMethod(WebDriver driver, By by, String value) {
        WebElement element = driver.findElement(by);
        Select selectitem = new Select(element);
        selectitem.selectByValue(value);
    }
	
	public static void Input(WebDriver driver, By by, String valor) {
		driver.findElement(by).sendKeys(valor);
		
	}
	
	
}
