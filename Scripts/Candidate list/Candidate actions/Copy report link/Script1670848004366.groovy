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
import com.sun.xml.internal.bind.v2.model.nav.Navigator as Navigator
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Filters'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/dropdown Filter Status'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/Filters Statuses/Status Completed'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/button Apply'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Selection/button Actions'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Action Copy report link'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Copy report link/button Copy'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Copy report link/notification Successfully copied'), 
    'Successfully copied to clipboard!')

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/input Search'))

WebUI.sendKeys(findTestObject('MatchQ DEV/Candidate List page/input Search'), Keys.chord(Keys.CONTROL, 'v'))

String copiedLink = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/input Search'), 'value')

WebUI.verifyMatch(copiedLink, 'https://development.matchq.nl/indicator/r?funcid\\s', true)

