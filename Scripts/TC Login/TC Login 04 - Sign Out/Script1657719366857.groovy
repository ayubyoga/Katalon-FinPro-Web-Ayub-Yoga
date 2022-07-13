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

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/my-account-2/ayubyoga/')

WebUI.setText(findTestObject('Object Repository/Login/Page_ayubyoga  Kotakoki/input__username'), 'ayubyoga')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_ayubyoga  Kotakoki/input__password'), 'GjpfHMqYYvap3a0RmZe3oA==')

WebUI.click(findTestObject('Object Repository/Login/Page_ayubyoga  Kotakoki/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Login/Page_ayubyoga  Kotakoki/button_Log in'))

WebUI.click(findTestObject('Object Repository/Login/Page_ayubyoga  Kotakoki/a_Log out'))

WebUI.closeBrowser()

WebUI.comment('Sign Out cannot be performed, the page still in My Account')

