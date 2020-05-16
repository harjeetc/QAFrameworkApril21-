import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author hchatha
 *
 */
public class LoginTest extends BaseTest {

	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.err.println(title);
		Assert.assertEquals(title, "HubSpot Login");

	}

	@Test(priority = 2, enabled = false)
	public void verifyLoginPageHeader() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.err.println(header);
//Assert.assertEquals(header, "Dont have an account?");

	}

	@Test(priority = 3, enabled = false)
	public void doLoginTest() throws InterruptedException {
		
		HomePage home = page.getInstance(LoginPage.class).doLogin("harjeet.chatha81@gmail.com", "Harjeet1234");
		String headerHome = home.getHomePageHeader();
		System.err.println(headerHome);
		Assert.assertEquals(headerHome, "Sales Dashboard");

	}

}
