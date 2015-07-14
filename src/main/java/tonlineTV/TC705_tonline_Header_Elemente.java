package tonlineTV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TC705_tonline_Header_Elemente extends TOnlineTV {
	final static Logger logger = LoggerFactory.getLogger(TC705_tonline_Header_Elemente.class);

	@Override
	public void runTest() {

		WebElement tonlineHeader = driver.findElement(th_tonlinehead);

		if (tonlineHeader.isDisplayed()) {

			for (By elem : l_TOnlineHeadElem) {
				int i = 0;
				WebElement tonlineheadElem = driver.findElement(elem);
				if (tonlineheadElem.isDisplayed()) {
					testStatus = true;
				} else {
					System.out.println("Folgende Element wird nicht angezeigt" + elem);
					testStatus = false;
				}

			}

		} else {
			testStatus = false;
			System.out.println("T-online-Header wird nicht angezeigt");
			// logger.error("Folgendes Element ist nicht vorhanden:", arg1);
		}

	}

}
