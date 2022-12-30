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

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

WebUI.delay(3)

//check EN language
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button User Icon'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/User Menu/dropdown Language'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/User Menu/dropdown item Language EN'))

WebUI.delay(3)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button User Icon'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'), 'Candidate list')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/button Invite new candidate'), 'Invite')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/button Group actions'), 'Group actions')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/button Sort by Name'), 'NAME')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/button Sort by Date added'), 'DATE ADDED')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Position'), 'ASSESSMENT')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Note'), 'NOTE')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Status'), 'STATUS')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Test result'), 'TEST RESULT')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Report'), 'REPORT')

//check NL language
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button User Icon'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/User Menu/dropdown Language'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/User Menu/dropdown item Language NL'))

WebUI.delay(3)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button User Icon'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'), 'Kandidatenlijst')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/button Invite new candidate'), 'Uitnodigen')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/button Group actions'), 'Groepsacties')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/button Sort by Name'), 'NAAM')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/button Sort by Date added'), 'DATUM TOEGEVOEGD')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Position'), 'ASSESSMENT')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Note'), 'NOTITIE')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Status'), 'STATUS')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Test result'), 'TESTRESULTAAT')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/header Report'), 'RAPPORT')

WebUI.closeBrowser()

