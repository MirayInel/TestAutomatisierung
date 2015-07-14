package tonlineTV;

import org.openqa.selenium.WebElement;

public class TC706_tonline_Header_Logo extends TOnlineTV {

	@Override
	public void runTest() {
		WebElement tLogo = driver.findElement(TVElements.th_tonlineLogo);
		tLogo.click();

		if (driver.getCurrentUrl() == TVElements.url_th_tLogo) {

			testStatus = true;

		} else {

			testStatus = false;
		}
	}
}
