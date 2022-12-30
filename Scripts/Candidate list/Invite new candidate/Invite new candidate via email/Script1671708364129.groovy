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

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Invite new candidate'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/button Personal invite via email'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 1 - Choose the assessment/dropdown Unit'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 1 - Choose the assessment/dropdown Item'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 1 - Choose the assessment/dropdown Function'))

TestObject dropdownFunction = findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 1 - Choose the assessment/dropdown Item')

List<WebElement> listFunctions = WebUI.findWebElements(dropdownFunction, 10)

for (int i = 0; i < listFunctions.size(); ++i) {
    String nameFunction = listFunctions.get(i).getText()

    if (nameFunction == 'Behaviour') {
        WebUI.click(WebUI.convertWebElementToTestObject(listFunctions.get(i)))

        break
    }
}

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 1 - Choose the assessment/button Next'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/button Add candidate'))

int randomInt = new Random().nextInt((999 - 100) + 1) + 100

String firstName = 'test' + randomInt.toString()

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/input First name'), 
    firstName)

randomInt = (new Random().nextInt((999 - 100) + 1) + 100)

String lastName = 'abc ' + randomInt.toString()

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/input Last name'), 
    lastName)

String email = firstName + '@test.com'

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/input Email'), 
    email)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/dropdown Gender'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/item Male'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/button Save'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 2 - Add one or more candidates/button Next'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 3 - Send the invitation/span Email'), 
    email)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 3 - Send the invitation/button Send invitation'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 3 - Send the invitation/notification Invitation successfully sent'), 
    'The invitation has been succesfully sent to the candidate!')

WebUI.delay(3)

WebUI.closeBrowser()







