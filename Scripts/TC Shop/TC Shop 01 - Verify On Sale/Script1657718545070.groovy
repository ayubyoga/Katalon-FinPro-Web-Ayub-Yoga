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

WebUI.click(findTestObject('On Sale/span_Shop'))

WebUI.click(findTestObject('On Sale/a_On Sale'))

WebUI.verifyElementPresent(findTestObject('Object Repository/On Sale/span_Sale'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/img_Sale_attachment-woocommerce_thumbnail s_432ea2'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/h2_Beanie'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_Rp20 Rp18'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_Sale'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/img_Sale_attachment-woocommerce_thumbnail s_432ea2'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/h2_Belt'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_Rp65 Rp55'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_Sale'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/img_Sale_attachment-woocommerce_thumbnail s_432ea2'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/h2_Cap'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_Rp18.000 Rp16.000'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_Sale'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/img_Sale_attachment-woocommerce_thumbnail s_432ea2'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/h2_Hoodie with Zipper'), 0)

WebUI.verifyElementPresent(findTestObject('On Sale/span_Rp45.000 Rp42.000'), 0)

WebUI.closeBrowser()

