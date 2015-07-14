package tonlineTV;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC703_Globalen_Header_aufgeklappt_Darstellung extends TOnlineTV {

	@Override
	public void runTest() {
		for (By elem : l_GlobHeadElem) {
			int i = 0;
			WebElement globHeadElem = driver.findElement(elem);

		}
	}

}
