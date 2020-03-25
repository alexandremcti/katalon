import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass as CustomKeywordDelegatingMetaClass
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'bizagi.BizagiWorkPortal.openBizagiPortal'(GlobalVariable.Url)

WebUI.waitForPageLoad(GlobalVariable.MinValueWait)

not_run: CustomKeywords.'bizagi.BizagiWorkPortal.selectCase'(0)

CustomKeywords.'bizagi.BizagiWorkPortal.CreateNewCase'('Gestão de Incidentes')

WebUI.waitForPageLoad(GlobalVariable.MinValueWait)

WebUI.verifyElementPresent(CustomKeywords.'bizagi.BizagiNewCaseWindow.getTestObject'(GlobalVariable.FormStart), GlobalVariable.MinValueWait)

WebUI.sendKeys(CustomKeywords.'bizagi.BizagiExtendedText.getTestObject'(GlobalVariable.DSCOcorrencia), GlobalVariable.VALDescricaodaOcorrencia)

WebUI.click(CustomKeywords.'bizagi.BizagiFile.getTestObject'(GlobalVariable.BINEvidencia))

CustomKeywords.'bizagi.BizagiFile.attachFile'(GlobalVariable.VALArquivoEvidencia)

WebUI.waitForPageLoad(GlobalVariable.MinValueWait)

CustomKeywords.'bizagi.BizagiDropDownMenu.selectOption'(GlobalVariable.TipodeSolicitacao, GlobalVariable.VALTipodeSolicitacao)

CustomKeywords.'bizagi.BizagiDropDownMenu.selectOption'(GlobalVariable.Aplicacao, GlobalVariable.VALAplicacao)

CustomKeywords.'bizagi.BizagiDropDownMenu.selectOption'(GlobalVariable.Ambiente, GlobalVariable.VALAmbiente)

CustomKeywords.'bizagi.BizagiNewCaseWindow.createCase'()

WebUI.callTestCase(findTestCase('deveValidarOcorrencia'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('DeveManipularOcorrencia'), [:], FailureHandling.STOP_ON_FAILURE)

