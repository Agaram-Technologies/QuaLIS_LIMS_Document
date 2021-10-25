package GenericRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHylandsFinishedGoods extends ElementGenericRegistration
{
	@FindBy(xpath = "//*[@displaymember='sproductcatname']")
	public static WebElement sampleCategory;

	@FindBy(xpath = "//*[@displaymember='sproductname']")
	public static WebElement sample;

	@FindBy(xpath = "//*[@displaymember='sitemcode']")
	public static WebElement itemCode;

	@FindBy(xpath = "//*[@displaymember='smanufsitename']")
	public static WebElement manufacturerSite;

	@FindBy(xpath = "//*[@displaymember='spono']")
	public static WebElement PONumber;

	@FindBy(xpath = "//*[@displaymember='sshclotno']")
	public static WebElement SHCLotNumber;

	@FindBy(xpath = "//*[@displaymember='sbatchno']")
	public static WebElement batchNumber;

	@FindBy(xpath = "//*[@displaymember='scountryname']")
	public static WebElement marketDestination;

	@FindBy(xpath = "//*[@displaymember='sstorageconditionname']")
	public static WebElement storageCodition;

	@FindBy(xpath = "//*[@displaymember='nnoofpallets']")
	public static WebElement numberOfPallets;

	@FindBy(xpath = "//*[@displaymember='scontainertype']")
	public static WebElement containerType;

	@FindBy(xpath = "//*[@displaymember='slotquantity']")
	public static WebElement lotQuantity;

	@FindBy(xpath = "//*[@displaymember='spalletquantity']")
	public static WebElement palletQuantity;

	@FindBy(xpath = "//*[@displaymember='stestingtype']")
	public static WebElement testingType;

	@FindBy(xpath = "//*[@displaymember='stotalquantity']")
	public static WebElement totalQuantity;

	@FindBy(xpath = "//*[@displaymember='stotalqty']")
	public static WebElement totalQuantity2;

	@FindBy(xpath = "//*[@displaymember='sunitname']")
	public static WebElement totalQuantityUnit;

	@FindBy(xpath = "//*[@displaymember='spriorityname']")
	public static WebElement priority;

	@FindBy(xpath = "//*[@displaymember='sremarks']")
	public static WebElement remarks;

}
