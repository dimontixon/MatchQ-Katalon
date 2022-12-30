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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

String inputSearch = 'test'

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/input Search'), inputSearch)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Search'))

TestObject candidateNames = findTestObject('MatchQ DEV/Candidate List page/Selection/button Candidate Name')

List<WebElement> listCandidateNames = WebUI.findWebElements(candidateNames, 10)

int count = 0

for (int i = 0; i < listCandidateNames.size(); ++i) {
    String candidateName = listCandidateNames.get(i).getText().toLowerCase()

    if (candidateName.contains(inputSearch)) {
        count++
    }
}

WebUI.verifyEqual(count, listCandidateNames.size())

String textSearchBreadcrumb = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Filters/Filters Breadcrumbs/breadcrumb Search'))

WebUI.verifyEqual(textSearchBreadcrumb.toLowerCase(), inputSearch)

WebUI.delay(3)

WebUI.closeBrowser()

