package tonlineTV;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.qos.logback.classic.Logger;

public class TC388_Startseite_Seitenaufbau_pruefen_Landscape_Ansicht extends TOnlineTV {

	@Override
	public void runTest() {
		logger.info("TC388_Startseite_Seitenaufbau_prüfen_Landscape_Ansicht wird gestartet. Link: https://redmine.t-online.de/projects/kontinuierliche-entwicklung/impasse/test_case#test_case-388");
		ArrayList<By> hauptElemente = new ArrayList<>();

		hauptElemente.add(TVElements.gh_globhead);
		hauptElemente.add(TVElements.th_tonlinehead);
		hauptElemente.add(TVElements.l_tvh_tvhead);
		hauptElemente.add(TVElements.l_breadcrumb);
		hauptElemente.add(TVElements.aufmacherVideoTeaserBild);
		hauptElemente.add(TVElements.aufmacherVideoTeaserText);
		hauptElemente.add(TVElements.kleineVideoTeaserBild);
		hauptElemente.add(TVElements.kleineVideoTeaserText);
		hauptElemente.add(TVElements.cb_vidupload);
		hauptElemente.add(TVElements.cb_facebook);
		hauptElemente.add(TVElements.fl);

		for (By elem : hauptElemente) {
			WebElement aufbauElement = driver.findElement(elem);

			if (aufbauElement.isDisplayed()) {
				testStatus = true;

			} else {
				testStatus = false;
				logger.error(elem + "ist nicht vorhanden!");
			}
		}
	}
}
