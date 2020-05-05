import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 
 */

/**
 * @author hchatha
 *
 */
public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
// override...same method , same signatured overwrittin method 
	@Override
	public String getPagetitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		// TODO Auto-generated method stub
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;	
		
		try {
			waitForElementpresence(locator);
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			System.out.println("some error occurred" + locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementpresence(By locator) {
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Did not wait for the expected element" + locator.toString());
			e.printStackTrace();
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
		
		try{
		wait.until(ExpectedConditions.titleContains(title));
		} catch(Exception e) {
			System.out.println("Title was not find and exception was thrown" + title.toString());
			e.printStackTrace();
			
		}
	}

}
