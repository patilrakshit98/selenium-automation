package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	//elements on HomePage
	private By logo = By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']");
	private By searchBar = By.xpath("//input[@class='desktop-searchBar']");
	private By menLink = By.xpath("//a[@data-group='men']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public boolean isLogoDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).isDisplayed();
	}
	
	public void enterSearchText(String text) {
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(searchBar));
		search.sendKeys(text,Keys.ENTER);
		
	}
	
	public void clickMen() {
		WebElement men = wait.until(ExpectedConditions.elementToBeClickable(menLink));
		men.click();
	}

}
