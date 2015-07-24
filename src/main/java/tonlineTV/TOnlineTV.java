package tonlineTV;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class TOnlineTV implements TVElements {
	final static Logger logger = LoggerFactory.getLogger(TOnlineTV.class);
	
	
	
	//Erstellen von Listen
	ArrayList<By> l_GlobHeadElem = new ArrayList<>();
	ArrayList<By> l_TOnlineHeadElem = new ArrayList<>();
	ArrayList<By> l_NaviElem = new ArrayList<>();
	ArrayList<By> l_SubNaviElem = new ArrayList<>();
	ArrayList<By> l_MegNaviTeaser = new ArrayList<>();
	ArrayList<By> p_NaviElem = new ArrayList<>();
	ArrayList<By> fl_Elem = new ArrayList<>();	
	ArrayList<String> url_GlobHeadElem = new ArrayList<>();
	ArrayList<String> url_Kateg = new ArrayList<>();
	ArrayList<String> url_SubKateg = new ArrayList<>();
	ArrayList<String> url_fl_Elem = new ArrayList<>();
	
		
	WebDriver driver;
	
	boolean testStatus;
	
	public void createLists(){
		
	l_GlobHeadElem.add(TVElements.gh_telekom);
	l_GlobHeadElem.add(TVElements.gh_tonline);
	l_GlobHeadElem.add(TVElements.gh_favoriten);
	l_GlobHeadElem.add(TVElements.gh_email);
	l_GlobHeadElem.add(TVElements.gh_mediencenter);
	l_GlobHeadElem.add(TVElements.gh_kundencenter);
	l_GlobHeadElem.add(TVElements.gh_mehr);
	l_GlobHeadElem.add(TVElements.gh_adressbuch);
	l_GlobHeadElem.add(TVElements.gh_kalender);
	l_GlobHeadElem.add(TVElements.gh_pm);
	l_GlobHeadElem.add(TVElements.gh_spotify);
	l_GlobHeadElem.add(TVElements.gh_freizeichentoene);
	l_GlobHeadElem.add(TVElements.gh_hunds);
	
	l_TOnlineHeadElem.add(TVElements.th_tonlineLogo);
	l_TOnlineHeadElem.add(TVElements.th_googlesucheFeld);
	l_TOnlineHeadElem.add(TVElements.th_googlesucheButton);
	l_TOnlineHeadElem.add(TVElements.th_feedbackLink);
	
	l_NaviElem.add(TVElements.l_home);
	l_NaviElem.add(TVElements.l_news);
	l_NaviElem.add(TVElements.l_tvhighlights);
	l_NaviElem.add(TVElements.l_stars);
	l_NaviElem.add(TVElements.l_sport);
	l_NaviElem.add(TVElements.l_webclips);
	l_NaviElem.add(TVElements.l_lifehacks);
	l_NaviElem.add(TVElements.l_mehr);
	
	l_SubNaviElem.add(TVElements.l_rtl);
	l_SubNaviElem.add(TVElements.l_rtl2);
	l_SubNaviElem.add(TVElements.l_pro7sat1);
	l_SubNaviElem.add(TVElements.l_myspass);
	l_SubNaviElem.add(TVElements.l_tatort);
	l_SubNaviElem.add(TVElements.l_zdf);
	l_SubNaviElem.add(TVElements.l_knallerfrauen);
	l_SubNaviElem.add(TVElements.l_spiegeltv);

	l_SubNaviElem.add(TVElements.l_vipspotlight);
	l_SubNaviElem.add(TVElements.l_playboy);
	l_SubNaviElem.add(TVElements.l_stars_unterhaltung);

	l_SubNaviElem.add(TVElements.l_fussball);
	l_SubNaviElem.add(TVElements.l_primeradivision);

	l_SubNaviElem.add(TVElements.l_spektakulaerevideos);
	l_SubNaviElem.add(TVElements.l_lustigevideos);

	l_SubNaviElem.add(TVElements.l_auto);
	l_SubNaviElem.add(TVElements.l_digital);
	l_SubNaviElem.add(TVElements.l_eltern);
	l_SubNaviElem.add(TVElements.l_lifestyle);
	l_SubNaviElem.add(TVElements.l_reisen);
	l_SubNaviElem.add(TVElements.l_spiele);
	l_SubNaviElem.add(TVElements.l_wirtschaft);
	l_SubNaviElem.add(TVElements.l_mehr_unterhaltung);
	
	l_MegNaviTeaser.add(TVElements.MNT_news01);
	l_MegNaviTeaser.add(TVElements.MNT_news02);
	l_MegNaviTeaser.add(TVElements.MNT_news03);
	l_MegNaviTeaser.add(TVElements.MNT_news04);

	l_MegNaviTeaser.add(TVElements.MNT_tvhighlights01);
	l_MegNaviTeaser.add(TVElements.MNT_tvhighlights02);
	l_MegNaviTeaser.add(TVElements.MNT_tvhighlights03);

	l_MegNaviTeaser.add(TVElements.MNT_stars01);
	l_MegNaviTeaser.add(TVElements.MNT_stars02);
	l_MegNaviTeaser.add(TVElements.MNT_stars03);

	l_MegNaviTeaser.add(TVElements.MNT_sport01);
	l_MegNaviTeaser.add(TVElements.MNT_sport02);
	l_MegNaviTeaser.add(TVElements.MNT_sport03);

	l_MegNaviTeaser.add(TVElements.MNT_webclips01);
	l_MegNaviTeaser.add(TVElements.MNT_webclips02);
	l_MegNaviTeaser.add(TVElements.MNT_webclips03);

	l_MegNaviTeaser.add(TVElements.MNT_lifehacks01);
	l_MegNaviTeaser.add(TVElements.MNT_lifehacks02);
	l_MegNaviTeaser.add(TVElements.MNT_lifehacks03);
	l_MegNaviTeaser.add(TVElements.MNT_lifehacks04);

	l_MegNaviTeaser.add(TVElements.MNT_mehr01);
	l_MegNaviTeaser.add(TVElements.MNT_mehr02);
	l_MegNaviTeaser.add(TVElements.MNT_mehr03);
	
	p_NaviElem.add(TVElements.p_menueicon);
	p_NaviElem.add(TVElements.p_home);
	p_NaviElem.add(TVElements.p_news);
	p_NaviElem.add(TVElements.p_tvhighlights);
	p_NaviElem.add(TVElements.p_stars);
	p_NaviElem.add(TVElements.p_sport);
	p_NaviElem.add(TVElements.p_webclips);
	p_NaviElem.add(TVElements.p_lifehacks);
	p_NaviElem.add(TVElements.p_auto);
	p_NaviElem.add(TVElements.p_digital);
	p_NaviElem.add(TVElements.p_eltern);
	p_NaviElem.add(TVElements.p_lifestyle);
	p_NaviElem.add(TVElements.p_reisen);
	p_NaviElem.add(TVElements.p_spiele);
	p_NaviElem.add(TVElements.p_wirtschaft);
	p_NaviElem.add(TVElements.p_unterhaltung);

	fl_Elem.add(TVElements.fl_impressum);
	fl_Elem.add(TVElements.fl_datenschutz);
	fl_Elem.add(TVElements.fl_nbow);
	fl_Elem.add(TVElements.fl_nbowicon);
	fl_Elem.add(TVElements.fl_jugendschutz);
	fl_Elem.add(TVElements.fl_kontakt);
	fl_Elem.add(TVElements.fl_werben);
	fl_Elem.add(TVElements.fl_copyright);
	
	url_GlobHeadElem.add(TVElements.url_gh_telekom);
	url_GlobHeadElem.add(TVElements.url_gh_tonline);
	url_GlobHeadElem.add(TVElements.url_gh_favoriten);
	url_GlobHeadElem.add(TVElements.url_gh_email);
	url_GlobHeadElem.add(TVElements.url_gh_mediencenter);
	url_GlobHeadElem.add(TVElements.url_gh_kundencenter);
	url_GlobHeadElem.add(TVElements.url_gh_adressbuch);
	url_GlobHeadElem.add(TVElements.url_gh_kalender);
	url_GlobHeadElem.add(TVElements.url_gh_pm);
	url_GlobHeadElem.add(TVElements.url_gh_spotify);
	url_GlobHeadElem.add(TVElements.url_gh_freizeichentoene);
	url_GlobHeadElem.add(TVElements.url_gh_hunds);
	
	url_Kateg.add(TVElements.url_home);
	url_Kateg.add(TVElements.url_news);
	url_Kateg.add(TVElements.url_tvhighlights);
	url_Kateg.add(TVElements.url_stars);
	url_Kateg.add(TVElements.url_sport);
	url_Kateg.add(TVElements.url_webclips);
	url_Kateg.add(TVElements.url_lifehacks);
	url_Kateg.add(TVElements.url_mehr);
	
	url_SubKateg.add(TVElements.url_rtl);
	url_SubKateg.add(TVElements.url_rtl2);
	url_SubKateg.add(TVElements.url_pro7sat1);
	url_SubKateg.add(TVElements.url_myspass);
	url_SubKateg.add(TVElements.url_tatort);
	url_SubKateg.add(TVElements.url_zdf);
	url_SubKateg.add(TVElements.url_knallerfrauen);
	url_SubKateg.add(TVElements.url_spiegeltv);

	url_SubKateg.add(TVElements.url_vipspotlight);
	url_SubKateg.add(TVElements.url_playboy);

	url_SubKateg.add(TVElements.url_fussball);
	url_SubKateg.add(TVElements.url_primeradivision);

	url_SubKateg.add(TVElements.url_spektakulaerevideos);
	url_SubKateg.add(TVElements.url_lustigevideos);

	url_SubKateg.add(TVElements.url_auto);
	url_SubKateg.add(TVElements.url_digital);
	url_SubKateg.add(TVElements.url_eltern);
	url_SubKateg.add(TVElements.url_lifestyle);
	url_SubKateg.add(TVElements.url_reisen);
	url_SubKateg.add(TVElements.url_spiele);
	url_SubKateg.add(TVElements.url_wirtschaft);
	url_SubKateg.add(TVElements.url_unterhaltung);
	
	url_fl_Elem.add(TVElements.url_fl_impressum);
	url_fl_Elem.add(TVElements.url_fl_datenschutz);
	url_fl_Elem.add(TVElements.url_fl_nbow);
	url_fl_Elem.add(TVElements.url_fl_jugendschtz);
	url_fl_Elem.add(TVElements.url_fl_kontakt);
	url_fl_Elem.add(TVElements.url_fl_werben);	
		
	}

	public void beforeTest(WebDriver concreteDriver) {
		driver = concreteDriver;

		driver.get(TVElements.url_tvStartseite);

		driver.manage().window().maximize();

		testStatus = false;
	}

	public void runTest() {
		
	}

	public void afterTest() {

		driver.quit();

	}

	public static void main(String[] args) {
		
		
		
		ArrayList<TOnlineTV> testset = new ArrayList<>();
//		testset.add(new TC404_nachoben_verhalten());
//		testset.add(new TC407_MegaNavi_Playbuttons());
//		testset.add(new TC702_Globalen_Header_mehr_verhalten());
//		testset.add(new TC703_Globalen_Header_aufgeklappt_Darstellung());
		testset.add(new TC704_Globalen_Header_Linkziel());
		
		
		for (TOnlineTV elem : testset) {
			elem.createLists();
			elem.beforeTest(new FirefoxDriver());
			elem.runTest();
			
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			elem.afterTest();
		}
		
		
		
		

//		TC404_nachoben_verhalten TC_404 = new TC404_nachoben_verhalten();		
//		TC_404.beforeTest(new FirefoxDriver());
//		TC_404.runTest();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TC_404.afterTest();
	}
}