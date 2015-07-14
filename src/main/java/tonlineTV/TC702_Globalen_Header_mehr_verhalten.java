package tonlineTV;


import org.openqa.selenium.WebElement;

public class TC702_Globalen_Header_mehr_verhalten extends TOnlineTV {

	@Override
	public void runTest() {
//		WebElement globHeader = driver.findElement(TVElements.gh_globhead);

		WebElement ghMehrLink = driver.findElement(TVElements.gh_mehr);
		
		WebElement ghPM = driver.findElement(TVElements.gh_pm);

//		if (globHeader.isDisplayed()) {
//
//			if (ghMehrLink.isDisplayed()) {

		//Step 1: Klick auf den Link mehr und prüfen ob der Bereich aufgeklappt wird.
				ghMehrLink.click();
				
				//TODO prüfen ob du die Größe des Bereichs über vllt. CSS ermitteln kannst
				if (ghMehrLink.getText() == "Weniger" && ghPM.isDisplayed()) {
					testStatus = true;
					
				} else {
					testStatus = false;
					System.out.println("TC702: Wording der Mehrlink nicht korrekt bzw. Bereich nicht aufgeklappt");
					return;
				}
				
		//Step 2: Klick auf den Link mehr nochmals und prüfen ob der Berich zugeklappt wird.
				ghMehrLink.click();

				//TODO prüfen ob du die Größe des Bereichs über vllt. CSS ermitteln kannst
				if (ghMehrLink.getText() == "Mehr" && !ghPM.isDisplayed()) {
				
					testStatus = true;
					
				} else {
					testStatus = false;
					System.out.println("TC702: Wording der Mehrlink nicht korrekt bzw. Bereich nicht zugeklappt");
					return;
				}
				
//			} else {
//				System.out.println("Mehr Link auf dem GH nicht verfügbar");
//			}
//
//		} else {
//			System.out.println("Globalen Header nicht sichtbar");
//		}
	}

}
