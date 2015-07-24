package tonlineTV;

import java.util.ArrayList;

import org.openqa.selenium.By;

public interface TVElements {

	// XPATHs

	// Globalen Header
	By gh_globhead = By.xpath("/html/body/div[2]/div");
	By gh_telekom = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/a");
	By gh_tonline = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/a");
	By gh_favoriten = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/a");
	By gh_email = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[4]/a");
	By gh_mediencenter = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[5]/a");
	By gh_kundencenter = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[6]/a");
	By gh_mehr = By.xpath("/html/body/div[2]/div/div/div[3]/a/span[2]");
	By gh_adressbuch = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[7]/a");
	By gh_kalender = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[8]/a");
	By gh_pm = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[9]/a");
	By gh_spotify = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[10]/a");
	By gh_freizeichentoene = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[11]/a");
	By gh_hunds = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[12]/a");

	// t-online Header
	By th_tonlinehead = By.xpath("/html/body/div[4]");
	By th_tonlineLogo = By.xpath("/html/body/div[4]/div/a");
	By th_googlesucheFeld = By.xpath("/html/body/div[4]/div/form/div[1]");
	By th_googlesucheButton = By.xpath("/html/body/div[4]/div/form/div[2]");
	By th_feedbackLink = By.xpath("/html/body/div[4]/div/p");

	// tv Header
	By l_tvh_tvhead = By.xpath("/html/body/div[5]");

	// Landscape-Ansicht Suche Feld
	By l_sucheFeld = By.xpath("");

	// Landscape-Ansicht Navi-Elemente
	By l_home = By.xpath("/html/body/div[5]/div/div[1]/ul/li[1]/a");
	By l_news = By.xpath("/html/body/div[5]/div/div[1]/ul/li[3]/a");
	By l_tvhighlights = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/a");
	By l_stars = By.xpath("/html/body/div[5]/div/div[1]/ul/li[5]/a");
	By l_sport = By.xpath("/html/body/div[5]/div/div[1]/ul/li[6]/a");
	By l_webclips = By.xpath("/html/body/div[5]/div/div[1]/ul/li[7]/a");
	By l_lifehacks = By.xpath("/html/body/div[5]/div/div[1]/ul/li[8]/a");
	By l_mehr = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/a");

	// TV Highlights Subkategorien
	By l_rtl = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[1]/a");
	By l_rtl2 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[2]/a");
	By l_pro7sat1 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[3]/a");
	By l_myspass = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[4]/a");
	By l_tatort = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[5]/a");
	By l_zdf = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[6]/a");
	By l_knallerfrauen = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[7]/a");
	By l_spiegeltv = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[1]/ul/li[8]/a");

	// Stars Subkategorien
	By l_vipspotlight = By.xpath("/html/body/div[5]/div/div[1]/ul/li[5]/div/div/div[1]/ul/li[1]/a");
	By l_playboy = By.xpath("/html/body/div[5]/div/div[1]/ul/li[5]/div/div/div[1]/ul/li[2]/a");
	By l_stars_unterhaltung = By.xpath("/html/body/div[5]/div/div[1]/ul/li[5]/div/div/div[1]/ul/li[3]/a");

	// Sport Subkategorien
	By l_fussball = By.xpath("/html/body/div[5]/div/div[1]/ul/li[6]/div/div/div[1]/ul/li[1]/a");
	By l_primeradivision = By.xpath("/html/body/div[5]/div/div[1]/ul/li[6]/div/div/div[1]/ul/li[2]/a");

	// Webclips Subkategorien
	By l_spektakulaerevideos = By.xpath("/html/body/div[5]/div/div[1]/ul/li[7]/div/div/div[1]/ul/li[1]/a");
	By l_lustigevideos = By.xpath("/html/body/div[5]/div/div[1]/ul/li[7]/div/div/div[1]/ul/li[2]/a");

	// Mehr Subkategorien
	By l_auto = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[1]/a");
	By l_digital = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[2]/a");
	By l_eltern = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[3]/a");
	By l_lifestyle = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[4]/a");
	By l_reisen = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[5]/a");
	By l_spiele = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[6]/a");
	By l_wirtschaft = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[7]/a");
	By l_mehr_unterhaltung = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[1]/ul/li[8]/a");

	// Mega-Navi Meistgesehene Videos - Teaserbilder
	By MNT_news01 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[3]/div/div/div/div[1]");
	By MNT_news02 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[3]/div/div/div/div[2]");
	By MNT_news03 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[3]/div/div/div/div[3]");
	By MNT_news04 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[3]/div/div/div/div[4]");

	By MNT_tvhighlights01 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[2]/div[1]");
	By MNT_tvhighlights02 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[2]/div[2]");
	By MNT_tvhighlights03 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[4]/div/div/div[2]/div[3]");

	By MNT_stars01 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[5]/div/div/div[2]/div[1]");
	By MNT_stars02 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[5]/div/div/div[2]/div[2]");
	By MNT_stars03 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[5]/div/div/div[2]/div[3]");

	By MNT_sport01 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[6]/div/div/div[2]/div[1]");
	By MNT_sport02 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[6]/div/div/div[2]/div[2]");
	By MNT_sport03 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[6]/div/div/div[2]/div[3]");

	By MNT_webclips01 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[7]/div/div/div[2]/div[1]");
	By MNT_webclips02 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[7]/div/div/div[2]/div[2]");
	By MNT_webclips03 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[7]/div/div/div[2]/div[3]");

	By MNT_lifehacks01 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[8]/div/div/div/div[1]");
	By MNT_lifehacks02 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[8]/div/div/div/div[2]");
	By MNT_lifehacks03 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[8]/div/div/div/div[3]");
	By MNT_lifehacks04 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[8]/div/div/div/div[4]");

	By MNT_mehr01 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[2]/div[1]");
	By MNT_mehr02 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[2]/div[2]");
	By MNT_mehr03 = By.xpath("/html/body/div[5]/div/div[1]/ul/li[9]/div/div/div[2]/div[3]");

	// Portrait-Ansicht Navi Elemente
	By p_menueicon = By.xpath("/html/body/div[5]/div/div[3]/s/a");
	By p_home = By.xpath("/html/body/div[6]/div/div[2]/ul/li[2]/a");
	By p_news = By.xpath("/html/body/div[5]/div/div[2]/ul/li[1]/a");
	By p_tvhighlights = By.xpath("/html/body/div[5]/div/div[2]/ul/li[2]/a");
	By p_stars = By.xpath("/html/body/div[5]/div/div[2]/ul/li[3]/a");
	By p_sport = By.xpath("/html/body/div[5]/div/div[2]/ul/li[4]/a");
	By p_webclips = By.xpath("/html/body/div[5]/div/div[2]/ul/li[5]/a");
	By p_lifehacks = By.xpath("/html/body/div[5]/div/div[2]/ul/li[6]/a");
	By p_auto = By.xpath("/html/body/div[5]/div/div[2]/ul/li[7]/a");
	By p_digital = By.xpath("/html/body/div[5]/div/div[2]/ul/li[8]/a");
	By p_eltern = By.xpath("/html/body/div[5]/div/div[2]/ul/li[9]/a");
	By p_lifestyle = By.xpath("/html/body/div[5]/div/div[2]/ul/li[10]/a");
	By p_reisen = By.xpath("/html/body/div[5]/div/div[2]/ul/li[11]/a");
	By p_spiele = By.xpath("/html/body/div[5]/div/div[2]/ul/li[12]/a");
	By p_wirtschaft = By.xpath("/html/body/div[5]/div/div[2]/ul/li[13]/a");
	By p_unterhaltung = By.xpath("/html/body/div[5]/div/div[2]/ul/li[14]/a");

	// Breadcrumb
	By l_breadcrumb = By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]");
	
	// Contentbox
	By l_contentBox = By.xpath("/html/body/div[6]/div[1]");
	
	// Video-Upload-Lasche
	By lasche = By.xpath("/html/body/a");
	
	// nach oben-Link
	By l_nachoben = By.xpath("/html/body/div[9]/div/div");
	
	// Aufmacher Video Teaser
	By aufmacherVideoTeaserBild = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]");
	By aufmacherVideoTeaserText = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[1]");
	
	// Kleine Video Teaser
	By kleineVideoTeaserBild = By.xpath("/html/body/div[6]/div[1]/div[4]/div[2]/div[2]");
	By kleineVideoTeaserText = By.xpath("/html/body/div[6]/div[1]/div[4]/div[2]/div[1]");
	
	// Video Upload Contentbreaker
	By cb_vidupload = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[1]");
	By cb_vidupload_text = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[1]/div/p");
	By cb_vidupload_button = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[1]/div/div/a");
	
	// Facebook Contentbreaker
	By cb_facebook = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[2]");
	By cb_facebook_text = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[2]/div/p");
	By cb_facebook_schalter = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[2]/div/div/ul/li[1]/span[2]");
	By cb_facebook_dsfl = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[2]/div/div/ul/li[1]/div");
	By cb_facebook_dsinfo = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[2]/div/div/ul/li[1]/span[1]");
	By cb_facebook_dslink = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[2]/div/div/ul/li[1]/span[1]/p[1]/a");
	By cb_facebook_button = By.xpath("/html/body/div[6]/div[1]/div[4]/div[1]/div[3]/div/div[2]/div/div/ul/li[1]/div/img");
	

	// Footerleiste Elemente
	By fl = By.xpath("/html/body/div[8]");
	By fl_impressum = By.xpath("/html/body/div[8]/div[1]/ul/li[1]/a");
	By fl_datenschutz = By.xpath("/html/body/div[8]/div[1]/ul/li[2]/a");
	By fl_nbow = By.xpath("/html/body/div[8]/div[1]/ul/li[3]/a");
	By fl_nbowicon = By.xpath("/html/body/div[8]/div[1]/ul/li[3]/a/img");
	By fl_jugendschutz = By.xpath("/html/body/div[10]/div[1]/ul/li[4]/a");
	By fl_kontakt = By.xpath("/html/body/div[10]/div[1]/ul/li[5]/a");
	By fl_werben = By.xpath("/html/body/div[10]/div[1]/ul/li[6]/a");
	By fl_copyright = By.xpath("/html/body/div[8]/div[1]/div");

	
	
	
	
	// URLs

	String url_tvStartseite = "http://www.t-online.de/tv/";

	// Globalen Header URLs
	String url_gh_telekom = "http://www.telekom.de";
	String url_gh_tonline = "http://www.t-online.de";
	String url_gh_favoriten = "https://favoriten.t-online.de";
	String url_gh_email = "https://email.t-online.de/?nmbr=1";
	String url_gh_mediencenter = "http://mediencenter.t-online.de";
	String url_gh_kundencenter = "http://www.telekom.de/fuer-privatkunden/hilfe-und-service/kundencenter";
	String url_gh_adressbuch = "https://email.t-online.de/ab";
	String url_gh_kalender = "https://email.t-online.de/cal";
	String url_gh_pm = "http://programm-manager.telekom.de";
	String url_gh_spotify = "http://www.telekom.de/spotify";
	String url_gh_freizeichentoene = "https://www.freizeichen.t-mobile.de";
	String url_gh_hunds = "http://www.telekom.de/fuer-privatkunden/hilfe-und-service";

	// tonline Header URLs
	String url_th_tLogo = "http://www.t-online.de/";
	String url_th_feedback = "http://s1.rogator.de/rogator/betalabs/FBE_150616_t-online_de_TV_Feedback/";

	// Kategorien
	String url_home = "http://www.t-online.de/tv/news/";
	String url_news = "http://www.t-online.de/tv/news/";
	String url_tvhighlights = "http://www.t-online.de/tv/tv-highlights/";
	String url_stars = "http://www.t-online.de/tv/stars/";
	String url_sport = "http://www.t-online.de/tv/sport/";
	String url_webclips = "http://www.t-online.de/tv/webclips/";
	String url_lifehacks = "http://www.t-online.de/tv/weitere-videos/lifehacks/";
	String url_mehr = "http://www.t-online.de/tv/weitere-videos/";

	// TV Highlights Subkategorien
	String url_rtl = "http://www.t-online.de/tv/tv-highlights/rtl/";
	String url_rtl2 = "http://www.t-online.de/tv/tv-highlights/rtl2/id_74496460/die-top-videos-von-rtl2-bei-t-online-de-tv.html";
	String url_pro7sat1 = "http://www.t-online.de/tv/tv-highlights/pro7sat1/";
	String url_myspass = "http://www.t-online.de/tv/tv-highlights/myspass/";
	String url_tatort = "http://www.t-online.de/tv/tv-highlights/tatort/";
	String url_zdf = "http://www.t-online.de/tv/tv-highlights/zdf/";
	String url_knallerfrauen = "http://www.t-online.de/tv/tv-highlights/pro7sat1/knallerfrauen/id_72114874/sehen-sie-highlights-aus-knallerfrauen-mit-martina-hill-von-sat-1-bei-t-online-de-tv.html";
	String url_spiegeltv = "http://www.t-online.de/tv/tv-highlights/spiegeltv/";

	// Stars Subkategorien
	String url_vipspotlight = "http://www.t-online.de/tv/tv-highlights/spiegeltv/";
	String url_playboy = "http://www.t-online.de/tv/stars/playboy/";

	// Sport Subkategorien
	String url_fussball = "http://www.t-online.de/tv/sport/fussball/";
	String url_primeradivision = "http://www.t-online.de/tv/laola1tv/";

	// Webclips Subkategorien
	String url_spektakulaerevideos = "http://www.t-online.de/tv/webclips/spektakulaere-videos/";
	String url_lustigevideos = "http://www.t-online.de/tv/webclips/lustige-videos/";

	// Mehr Subkategorien
	String url_auto = "http://www.t-online.de/tv/weitere-videos/auto/";
	String url_digital = "http://www.t-online.de/tv/weitere-videos/digital/";
	String url_eltern = "http://www.t-online.de/tv/weitere-videos/eltern/";
	String url_lifestyle = "http://www.t-online.de/tv/weitere-videos/lifestyle/";
	String url_reisen = "http://www.t-online.de/tv/weitere-videos/reisen/";
	String url_spiele = "http://www.t-online.de/tv/weitere-videos/spiele/";
	String url_wirtschaft = "http://www.t-online.de/tv/weitere-videos/wirtschaft/";
	String url_unterhaltung = "http://www.t-online.de/tv/weitere-videos/unterhaltung/";

	// Video Upload Lasche & Contentbreaker
	String url_upload = "http://www.t-online.de/tv/id_72422472/video-hochladen-bei-t-online-de-tv.html";

	// Footerleiste
	String url_fl_impressum = "http://www.t-online.de/tv/id_67896442/impressum-von-t-online-de-tv.html";
	String url_fl_datenschutz = "http://www.t-online.de/tv/id_67896458/datenschutz-beim-besuch-unserer-internetseiten.html";
	String url_fl_nbow = "http://www.t-online.de/tv/id_68530048/nutzungsbasierte-online-werbung-online-behavioural-advertising-oba-.html";
	String url_fl_jugendschtz = "http://www.t-online.de/jugendschutz-bei-der-deutschen-telekom-ag/id_40608376/index";
	String url_fl_kontakt = "http://www.t-online.de/tv/id_67896456/kontaktmoeglichkeiten-zu-t-online-de-tv.html";
	String url_fl_werben = "http://www.interactivemedia.net/downloads/T-Online.de__TV.pdf";

}
