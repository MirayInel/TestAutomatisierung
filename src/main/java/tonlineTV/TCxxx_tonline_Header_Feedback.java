package tonlineTV;

import org.openqa.selenium.WebElement;

public class TCxxx_tonline_Header_Feedback extends TOnlineTV {
	boolean testStepStatus;
	
	@Override
	public void runTest() {

		WebElement feedbackLink = driver.findElement(TVElements.th_feedbackLink);

		// Step 1 Klick auf den Link & prüfen ob die Zielseite in neuen Tab geöffnet wird
		feedbackLink.click();
		if (driver.getWindowHandles().size() == 2)
			//TODO ...
			if (driver.getCurrentUrl() == TVElements.url_th_feedback) {
			testStatus = true;
		} else {
			testStatus = false;
		}
		
		

	}

}
