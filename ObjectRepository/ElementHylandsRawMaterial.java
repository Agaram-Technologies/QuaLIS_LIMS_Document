package GenericRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHylandsRawMaterial extends ElementGenericRegistration
{
	@FindBy(xpath = "//*[@displaymember='sproductcatname'][@valuemember=''nproductcatcode]")
	public static WebElement sampleCategory;

	@FindBy(xpath = "//*[@displaymember='sproductname'][@valuemember=''nproductcode]")
	public static WebElement sample;

	@FindBy(xpath = "//*[@displaymember='sitemcode']")
	public static WebElement itemCode;

	@FindBy(xpath = "//*[@displaymember='ssamplesitename'][@valuemember=''nsamplingsitecode]")
	public static WebElement sampleSite;

	@FindBy(xpath = "//*[@displaymember='ssampleportname'][@valuemember=''nsampleportcode]")
	public static WebElement dropSample;

	@FindBy(xpath = "//*[@displaymember='stimerid']	")
	public static WebElement timeID;

	@FindBy(xpath = "//*[@displaymember='slotno']")
	public static WebElement lotNumber;

	@FindBy(xpath = "//*[@displaymember='sstorageconditionname'][@valuemember=''nstorageconditioncode]")
	public static WebElement storageCondition;
 
	@FindBy(xpath = "//*[@displaymember='nnoofcontainers']")
	public static WebElement numberOfContainer;

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
