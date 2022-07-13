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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Object Repository/Login/span_Login'))

if (usernameInvalid) {
    WebUI.setText(findTestObject('Object Repository/Login/input_Username or E-mail_username-298'), 'ayubyoga2')

    WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_user_password-298'), 'GjpfHMqYYvap3a0RmZe3oA==')

    WebUI.click(findTestObject('Object Repository/Login/input_Keep me signed in_um-submit-btn'))

    WebUI.verifyElementPresent(findTestObject('Login/div_Please enter your username or email'), 0)
} else {
    WebUI.setText(findTestObject('Object Repository/Login/input_Username or E-mail_username-298'), 'ayubyoga1')

    WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_user_password-298'), 'iGDxf8hSRT4=')

    WebUI.click(findTestObject('Object Repository/Login/input_Keep me signed in_um-submit-btn'))

    WebUI.verifyElementPresent(findTestObject('Login/div_Please enter your password'), 0)
}

WebUI.closeBrowser()

