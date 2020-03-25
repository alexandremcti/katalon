package bizagi

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByTagName

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
import com.kms.katalon.core.webui.keyword.builtin.getCSSValueKeyword

import org.openqa.selenium.By as By

import internal.GlobalVariable

public class BizagiTable {


	@Keyword
	def static TestObject getCollection(String xpath){
		return getTestObject(generatePathToCollecion(xpath))
	}

	@Keyword
	def static void selectRow(String xpath, String headerCriteria, String valueCriteria){
		TestObject to = getTestObject(generatePathToTable(xpath))
		def indice = searchIndexHeaderFor(to, headerCriteria)
		WebElement element = searchRowFor(to, indice, valueCriteria)
		element.click()
	}

	@Keyword
	def static void editRowInSubForm(String xpath){
		TestObject to = getTestObject(generatePathToTableFooter(xpath))
		WebElement table = getElement(to)
		WebElement tbody = table.findElement(By.tagName('tbody'))
		WebElement tr = tbody.findElement(By.tagName('tr'))
		WebElement divEdit = tr.findElement(By.xpath('th/child::div/child::div/child::ul/child::li[@data-action="edit"]/child::div'))
		divEdit.click()
	}

	@Keyword
	def static void addRowInSubForm(String xpath){
		TestObject to = getTestObject(generatePathToTableFooter(xpath))
		WebElement table = getElement(to)
		WebElement tbody = table.findElement(By.tagName('tbody'))
		WebElement tr = tbody.findElement(By.tagName('tr'))
		WebElement divEdit = tr.findElement(By.xpath('th/child::div/child::div/child::ul/child::li[@data-action="add"]/child::div'))
		divEdit.click()
	}


	def static TestObject getTestObject(String xpath){
		return buildTestObject(xpath)
	}

	private static TestObject buildTestObject(String xpath){
		TestObject to = generatePropertyToTestObject("xpath", xpath)
		return to
	}

	private static TestObject generatePropertyToTestObject(String property, String value){
		TestObject to = new TestObject();
		to.addProperty(property, ConditionType.EQUALS, value)
		return to;
	}

	private static String generatePathToCollecion(String xpath){
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath)
		return path
	}


	private static String generatePathToTable(String xpath){
		String absolutePath = '/descendant::table[@class="ui-bizagi-grid-table "]'
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath) + absolutePath
		return path
	}

	private static String generatePathToTableFooter(String xpath){
		String absolutePath = '/descendant::div[@class="bz-rn-grid-container-foother"]/child::table'
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath) + absolutePath
		return path
	}


	private static int searchIndexHeaderFor(TestObject to, String headerCriteriaFetched){
		WebElement table = getElement(to)
		WebElement thead = table.findElement(By.tagName('thead'))
		WebElement tr = thead.findElement(By.tagName('tr'))
		List<WebElement> thList = tr.findElements(By.tagName('th'))
		int thCount = thList.size()

		try{
			for(int i = 0; i < thCount; i++){
				String label = thList.get(i).findElement(By.xpath('div[@class="ui-bizagi-grid-column"]/child::label')).getText()
				if(label == headerCriteriaFetched){
					return i
				}
			}
		}
		catch(e){
			throw new Exception('índice não encontrado')
		}
	}

	private static WebElement searchRowFor(TestObject to, int index, String valueCriteria){
		try{
			WebElement table = getElement(to)
			WebElement tbody = table.findElement(By.tagName('tbody'))
			List<WebElement> trList	= tbody.findElements(By.tagName('tr'))
			for(tr in trList){
				List<WebElement> tdList = tr.findElements(By.tagName('td'))
				WebElement label = tdList.get(index).findElement(By.xpath('div/child::div/child::div/child::label'))
				if(valueCriteria == label.getText()){
					return label
				}
			}
		}
		catch(e){
			throw new Exception('Elemento não encontrado')
		}
	}

	private static WebElement getElement(TestObject to){
		WebDriver driver = DriverFactory.getWebDriver()
		String xpathFetched = to.getProperties().get(0).getValue()
		println xpathFetched
		WebElement element = driver.findElement(By.xpath(xpathFetched))
		return element
	}


	def static void selectRow(TestObject to, String valueCriteria){
	}
}
