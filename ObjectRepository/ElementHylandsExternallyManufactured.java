package GenericRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHylandsExternallyManufactured extends ElementGenericRegistration
{
	@FindBy(xpath = "//*[@displaymember='sproductcatname'][@valuemember=''nproductcatcode]")
	public static WebElement sampleCategory;

	@FindBy(xpath = "//*[@displaymember='sproductname'][@valuemember=''nproductcode]")
	public static WebElement sample;

	@FindBy(xpath = "//*[@displaymember='sitemcode']")
	public static WebElement itemCode;

	@FindBy(xpath = "//*[@displaymember='smanufsitename'][@valuemember=''nmanufsitecode]")
	public static WebElement manufacturerSite;
	
	@FindBy(xpath = "//*[@displaymember='spono'][")
	public static WebElement PONumber;
	
	@FindBy(xpath = "//*[@displaymember='sshclotno']")
	public static WebElement SHCLotNumber;

	@FindBy(xpath = "//*[@displaymember='sbatchno']")
	public static WebElement batchNumber;

	@FindBy(xpath = "//*[@displaymember='sexpirationdate']	")
	public static WebElement expirationRetestDate;

	@FindBy(xpath = "//*[@displaymember='smanufacturerdate']")
	public static WebElement bulkManufacturerDate;
	

	@FindBy(xpath = "//*[@displaymember='smanufacturerdate']")
	public static WebElement packagingDate;
	

	@FindBy(xpath = "//*[@displaymember='scountryname'][@valuemember=''ncountry]")
	public static WebElement marketDestination;

	@FindBy(xpath = "//*[@displaymember='sstorageconditionname'][@valuemember=''nstorageconditioncode]")
	public static WebElement storageCondition;
 
	@FindBy(xpath = "//*[@displaymember='nnoofpallets']")
	public static WebElement numberOfPallets;
	

	@FindBy(xpath = "//*[@displaymember='slotquantity']")
	public static WebElement lotQuantity;
	

	@FindBy(xpath = "//*[@displaymember='spalletquantity']")
	public static WebElement palletQuantity;

	@FindBy(xpath = "//*[@displaymember='scontainertype'][@valuemember=''ncontainertypecode]")
	public static WebElement containerType;
	
 	@FindBy(xpath = "//*[@displaymember='stestingtype'][@valuemember=''ntestingtypecode]")
	public static WebElement testingType;

	@FindBy(xpath = "//*[@displaymember='stotalqty']")
	public static WebElement totalQuantity;
 
	@FindBy(xpath = "//*[@displaymember='sunitname'][@valuemember=''nunitcode]")
	public static WebElement totalQuantityUnit;

	@FindBy(xpath = "//*[@displaymember='spriorityname'][@valuemember=''nprioritycode]")
	public static WebElement priority;

	@FindBy(xpath = "//*[@displaymember='sremarks']")
	public static WebElement remarks;

}
