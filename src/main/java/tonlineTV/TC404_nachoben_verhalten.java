package tonlineTV;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TC404_nachoben_verhalten extends TOnlineTV {
	final static Logger logger = LoggerFactory.getLogger(TC404_nachoben_verhalten.class);

	// FACELIFT - t-online.de/TV-Seite "nach oben" Verhalten prüfen

	// Vorbedingungen: Die http://www.t-online.de/tv/ ist geöffnet.

	@Override
	public void runTest() {

		WebElement nachoben = driver.findElement(l_nachoben);

		// Step1: Die Seite ist ganz nach oben gescrollt. -> Rechts unten keine
		// "nach oben"-Link zu sehen

		if (!nachoben.isDisplayed()) {
			testStatus = false;
			
			logger.info("Step1: Failed: nach oben link wird angezeigt");
			
			
//			System.out.println("Step1: Failed: nach oben link wird angezeigt");
			return;
		} else {
			testStatus = true;
			System.out.println("Passed: nach oben link wird nicht angezeigt");
		}

		// Step2: Die Seite langsam nach unten scrollen & prüfen, ob der Link
		// erscheint -> Beim nach unten Scrollen ab eine gewisse Höhe erscheint
		// rechts unten neben dem Content-Bereich der Link "nach oben"

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", "");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (nachoben.isDisplayed()) {
			testStatus = true;
			System.out.println("Passed: nach oben link wird nicht angezeigt");
		} else {
			System.out.println("Failed: nach oben link wird nicht angezeigt");
		}

		// Step3: Die Seite langsam nach oben scrollen & prüfen, ob der Link
		// verschwindet -> Beim nach oben Scrollen ab eine gewisse Höhe
		// verschwindet der Link

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-800)", "");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveByOffset(500, 600);

		// Step4: Die Seite nach unten scrollen. Nach dem Link sichtbar, klick
		// auf den Link -> Die Seite wird zum Anfang gescrollt & Der Link
		// verschwindet.

		if (nachoben.isDisplayed()) {
			System.out.println("Nach oben link wird angezeigt");
			nachoben.click();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO in dem If auch prüfen ob zum Seitenanfang gescrollt wurde
			if (!nachoben.isDisplayed()) {
				System.out.println("Passed: nach oben link funktioniert korrekt");
			} else {
				System.out.println("Failed: nach oben link funktioniert nicht korrekt");
			}

			// Step5: Die Positionierung des Links während eine
			// Vollbild-Werbebanner prüfen -> In dem Fall wird der Link im
			// Vordergrund angezeigt und funktioniert wie erwartet.

			// TODO

		}

	}

}
