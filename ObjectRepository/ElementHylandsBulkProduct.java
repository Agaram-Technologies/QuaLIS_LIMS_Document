package GenericRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHylandsBulkProduct extends ElementGenericRegistration
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
	public static WebElement manufacturerDate;

	@FindBy(xpath = "//*[@displaymember='sstorageconditionname'][@valuemember=''nstorageconditioncode]")
	public static WebElement storageCondition;
 
	@FindBy(xpath = "//*[@displaymember='nnoofcontainers']")
	public static WebElement numberOfContainer;
	

	@FindBy(xpath = "//*[@displaymember='slotquantity']")
	public static WebElement lotQuantity;
	

	@FindBy(xpath = "//*[@displaymember='scontainerquantity']")
	public static WebElement containerQuantity;

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
