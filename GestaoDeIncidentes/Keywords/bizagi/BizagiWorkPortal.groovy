package bizagi

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.CacheLookup


import internal.GlobalVariable

public class BizagiWorkPortal {

	@CacheLookup
	@FindBy(xpath="//div[@class='ui-bizagi-wp-app-inbox-grid-cases-container heightToAdjust scrollCasesGrid ui-bizagi-wp-app-inbox-grid-cases-container-tableHeadFixed]/descedant::table[@class='floatThead-table']")
	private static WebElement table

	@Keyword
	def static void openBizagiPortal(String url){
		WebUI.openBrowser(url)
	}


	@Keyword
	def static void CreateNewCase(String process){
		WebDriver driver = DriverFactory.getWebDriver();
		String path = '//div[@id="categories"]/ul/li[@class="process"]/span[.="%s"]'
		//path.replace('%s', process)
		WebUI.click(findTestObject('bizagi/Page_Bizagi BPM/span_Caixa_De_Entrada'))
		WebUI.click(findTestObject('Object Repository/bizagi/Page_Bizagi BPM/i_Processos recentes_processIco bz-icon bz-icon-16 bz-icon-sentence-form-outline'))
		WebElement item = driver.findElement(By.xpath(path.replace('%s', process)))
		item.click()
	}

	@Keyword
	def static void selectCase(int caso){
		clickCaixaDeEntrada()
		initPageElements()
		WebElement table = getTable()
	}


	private static void clickCaixaDeEntrada(){
		TestObject menuEntrada = new TestObject()
		menuEntrada.addProperty("xpath", ConditionType.EQUALS, "//span[@class='text' and text()='Caixa de entrada']")
		WebUI.click(menuEntrada)
	}

	private static WebElement getTable(){
		return table
	}

	private static WebDriver getDriver(){
		return  DriverFactory.getWebDriver()
	}

	private static void initPageElements(){
		WebDriver driver = getDriver()
		PageFactory.initElements(driver, this)
	}
}
