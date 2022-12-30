import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.MatchQ_DEV_URL)

//WebUI.navigateToUrl('https://ui-development.matchq.nl/login')
WebUI.setText(findTestObject('MatchQ DEV/Login page/input Username'), 'sublogin_main')

WebUI.setEncryptedText(findTestObject('MatchQ DEV/Login page/input Password'), '/sXo/tiBEddgT51ao5zVWA==')

WebUI.click(findTestObject('MatchQ DEV/Login page/button Log in'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'), 'Candidate list')

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button User Icon'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/User Menu/dropdown Sub Logins'))

String firstSubLogin = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/User Menu/dropdown item Sub Login'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/User Menu/dropdown item Sub Login'))

WebUI.delay(5)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button User Icon'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/User Menu/label User Name'), 'sublogin_sub1')

WebUI.delay(3)

WebUI.closeBrowser()