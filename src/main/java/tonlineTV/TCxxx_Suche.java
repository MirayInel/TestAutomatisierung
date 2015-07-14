package tonlineTV;

import org.openqa.selenium.WebElement;

public class TCxxx_Suche extends TOnlineTV {

	@Override
	public void runTest() {
		WebElement sucheFeld = driver.findElement(TVElements.l_sucheFeld);

	}
}
