package bta_tests;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.codeborne.selenide.Configuration;

public class Test1 {

	@BeforeClass
    public static void setup() {
        Configuration.browserSize = "1366x768";
    }
	
	@Test
	public void openBtaWebsite() {
//		1. Atvērt BTA portālu (www.bta.lv)		
		open("https://www.bta.lv");											//Navigate to designated website
		$(byText("Piekrītu")).click();										//Accept cookies
		
//		2. Pārvietoties uz ceļojuma polišu iegādes formu
		$(byText("Ceļojumi")).click();
		
//		3. Nomainīt ceļojumā mērķi uz Indija izmantojot “Izvēlies valstis”
		$("#regionalSelectorRegion-open").click();
		$(byText("Izvēlies valstis")).click();
		$(byText("Pievienot valsti")).click();
		$("#regionalSelectorCountry-typedValue").setValue("Indija");
		$(byText("Indija")).click();
		
//		4. Pārbaudīt vai ceļojuma mērķis ir nomainīts
		$("#regionalSelectorCountry-removeCountry-0 .text")
			.shouldHave(text("Indija"));
		System.out.println("Indija ir izvēlēta");
		$(byText("Pielietot")).click();
		
//		5. Nomainīt aktivitāti uz “Sports”
		$("#travelActivities-open").click();
		$(byText("Sports")).click();
		
//		6. Pārbaudīt vai aktivitāte nomainīta
		$("#travelActivities-open").shouldHave(text("Sports"));
		System.out.println("Sports ir izvēlēts");
		
//		7. Pārvietoties uz otro soli
		$(byText("Saņemt piedāvājumu")).click();
		
//		8. Izvēlēties Optimal+
//		9. Atvērt ”Apskati, kas ir apdrošināts” izvēlētajai programmai
		$$("button[data-param='{\"id\":\"OPP\"}']")
			.filterBy(text("Apskati, kas ir apdrošināts"))
			.first().click();
		
//		10. Pārbaudīt vai uzlecošā forma ir atvērusies
		$("aside.single-popup.covered-travel").shouldBe(visible);
		System.out.println("Uzlecošā forma ir atvērusies");
		
//		11. Aizvērt un pārvietoties uz nākamo soli
		$("button.popup-close.close").click();
		$$("button[data-param='{\"id\":\"OPP\"}']")
		.filterBy(text("Turpināt"))
		.first().click();
		
//		12. Pārbaudīt vai ceļotāja lauki ir redzami un tie ir tukši
		$("#travelerFirstName0-text").shouldHave(empty);
		System.out.println("Vārds teksta lauks ir tukšs");
		
		$("#travelerLastName0-text").shouldHave(empty);
		System.out.println("Uzvārda teksta lauks ir tukšs");
		
		$("#travelerIdentityNumber0-text").shouldHave(empty);
		System.out.println("Personas koda teksta lauks ir tukšs");
		
		System.out.println("Tests beidzās veiksmīgi!");
	}
}
