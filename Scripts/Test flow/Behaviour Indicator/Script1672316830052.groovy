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
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Filters'))

// select Behaviour sequence
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/dropdown Filter Function'))

TestObject dropdownFunction = findTestObject('MatchQ DEV/Candidate List page/Filters/dropdown Item')

List<WebElement> listFunctions = WebUI.findWebElements(dropdownFunction, 10)

for (int i = 0; i < listFunctions.size(); ++i) {
    String nameFunction = listFunctions.get(i).getText()

    if (nameFunction == 'Behaviour') {
        WebUI.click(WebUI.convertWebElementToTestObject(listFunctions.get(i)))

        break
    }
}

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/dropdown Filter Status'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/Filters Statuses/Status Remindable'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/button Apply'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Selection/button Actions'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Action Remind'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Remind/test link'))

// get index of current tab
int tabNewUI = WebUI.getWindowIndex()

// set active new opened tab
WebUI.switchToWindowIndex(tabNewUI + 1)

WebUI.click(findTestObject('MatchQ DEV/Test flow/Behaviour Indicator/button Next'))

WebUI.click(findTestObject('MatchQ DEV/Test flow/Behaviour Indicator/button Next'))

WebUI.click(findTestObject('MatchQ DEV/Test flow/Behaviour Indicator/icon Plus'))

