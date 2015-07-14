package tonlineTV;


import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC407_MegaNavi_Playbuttons extends TOnlineTV {

	// FACELIFT - t-online.de/TV-Seite - MegaNavi - PlayButtons

	// Vorbedingungen: Die http://www.t-online.de/tv/ ist geöffnet.

	@Override
	public void runTest() {
		
//		for (By iterable_element : iterable) {
//			
//		}

		// MO auf einen Kategorie tvhighlights
		WebElement highlights = driver.findElement(TVElements.l_tvhighlights);
		Actions action = new Actions(driver);
		action.moveToElement(highlights).perform();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// MO auf den ersten Teaser im MegaNavi
		WebElement highlightsTb = driver.findElement(TVElements.MNT_tvhighlights01);
		action.moveToElement(highlightsTb).perform();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// prüfen ob das Play-Icon erscheint und anschließend Icon anklicken
		By playIcon = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[2]/div[1]/div[2]/a/div");
		WebElement playButton = driver.findElement(playIcon);
		if (playButton.isDisplayed()) {
			System.out.println("Playicon sichtbar");
		} else {
			System.out.println("playicon nicht sichtbar");
		}

	}

}
