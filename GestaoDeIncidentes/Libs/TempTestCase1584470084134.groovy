import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\ALEXAN~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\DeveManipularOcorrencia\\20200317_153444\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.verifyElementPresent(CustomKeywords.'bizagi.BizagiTable.getCollection'(GlobalVariable.HistoricodeOcorrencias), 
    GlobalVariable.MinValueWait)

not_run: CustomKeywords.'bizagi.BizagiTable.selectRow'(GlobalVariable.HistoricodeOcorrencias, 'Data', GlobalVariable.VALData)

not_run: CustomKeywords.'bizagi.BizagiTable.editRowInSubForm'(GlobalVariable.HistoricodeOcorrencias)

not_run: CustomKeywords.'bizagi.BizagiTable.addRowInSubForm'(GlobalVariable.HistoricodeOcorrencias)

WebUI.click(CustomKeywords.'bizagi.BizagiFile.getTestObject'(GlobalVariable.BINArquivo))

CustomKeywords.'bizagi.BizagiFile.attachFile'(GlobalVariable.VALArquivoEvidencia)

WebUI.click(findTestObject('bizagi/Page_Bizagi BPM/btn_guardar'))

''', 'Test Cases/DeveManipularOcorrencia', new TestCaseBinding('Test Cases/DeveManipularOcorrencia',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
