package DeleteRec;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Locators.Locate;
import Utility.Driverclass;
import Utility.Excel;

public class Delete 
{
	public static WebDriver driver;
	public static String username;
	public static String password;
	public static String skillname;
	public static String msg;
	public static String category;
	public static int count = 0;

	// opening browser importing from driver class (enter chrome or edge in console)
	public void openBrowser() 
	{
		driver = Driverclass.open();
	}

	// browser close
	public void closeBrowser() 
	{
		// driverquit method from driverclass for closing browser
		Driverclass.driverQuit();
	}

	// main code
	public void orangehrm() throws InterruptedException {
		// invoking excel
		Excel read = new Excel();
		// read the values username, password, category(Job)from Excel( excel.xlsx, sheet 1) and read the value skill
		username = read.readExcel("C:\\Users\\2318465\\eclipse-workspace\\DeletingSkillSet\\excel.xlsx", "Sheet1", 0, 0);//read cell of excelsheet with directed loacation of 0 row and 0 column of sheet 1 for name
		password = read.readExcel("C:\\Users\\2318465\\eclipse-workspace\\DeletingSkillSet\\excel.xlsx", "Sheet1", 0, 1);//read cell of excelsheet with directed loacation of 0 row and 1 column of sheet 1 for password
		skillname = read.readExcel("C:\\Users\\2318465\\eclipse-workspace\\DeletingSkillSet\\excel.xlsx", "Sheet1", 0, 2);//read cell of excelsheet with directed loacation of 0 row and 2 column of sheet 1 for skill name
		category = read.readExcel("C:\\Users\\2318465\\eclipse-workspace\\DeletingSkillSet\\excel.xlsx", "Sheet2", 0, 0);//read cell of excelsheet with directed loacation of 0 row and 0 column of sheet 2 for category
		System.out.println("Username is:" + username);// print name
		System.out.println("Password is:" + password);// print password
		Locate.username(driver).sendKeys(username);// taking username
		Locate.password(driver).sendKeys(password);// taking password
		Locate.login(driver).click();// clicking login button
		//--------------Adding and deleting job category---------------------
		TimeUnit.SECONDS.sleep(3);
		Locate.admin(driver).click();// clicking on admin
		Locate.job(driver).click();// clicking on Job which present on the top bar of page
		Locate.jobcategory(driver).click();// clicking on job category
		Locate.add(driver).click();// clicking on add button
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Job Category is:" + category);
		Locate.category(driver).sendKeys(category);//filling the category with the read text from Excel
		Locate.save(driver).click();
		TimeUnit.SECONDS.sleep(3);
		Locate.cbox(driver);
		TimeUnit.SECONDS.sleep(3);
		Locate.yesdel(driver).click();
		TimeUnit.SECONDS.sleep(7);
		//--------------location---------------------
		Locate.organization(driver).click();//clcik on organization
		Locate.location(driver).click();//click on location
		Locate.locadd(driver).click();//to add location
		Locate.name(driver).sendKeys(username);//filling username (mandatory)
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div")).click();//Selecting the country drop down 
		List<WebElement> list = driver.findElements(By.className("oxd-select-option"));//selecting all countries as list of webelements
		for(WebElement a : list)//Iterating through the list of country webelements
		{
			if(a.getText().equals("India"))//if the iterating webelement is equal to india then it is clicked
			{
				a.click();//clicking on india 
				break;
			}
 
		}
		Locate.save(driver).click();//save the location with username and country
		Locate.loccb(driver);// searching for the saved username and location and clicking for deleting
		TimeUnit.SECONDS.sleep(4);
		Locate.yesdel(driver).click();//confirming the delete operation
		TimeUnit.SECONDS.sleep(9);
		//--------------adding and deleting skill---------------------
		Locate.admin(driver).click();// click on admin
		Locate.qualification(driver).click();//click on qualification
		Locate.skills(driver).click();//click on skills
		Locate.add(driver).click();// clcik on add skill
		Locate.category(driver).sendKeys(skillname);// filling the skill to be added 
		System.out.println("SkillName is:" + skillname);// print the text taken as input
		Locate.save(driver).click();// saving the location
		Locate.loe(driver);//selecting all available skills as list of webelements and checking for the skill "Testing Demo" and selecting it for deletion
		TimeUnit.SECONDS.sleep(3);
		Locate.yesdel(driver).click();//confirming the delete operation
		msg = Locate.txt(driver).getText();// getting the successful message
		TimeUnit.SECONDS.sleep(7);
		//--------------verifying the skill is deleted---------------------
		System.out.println("The mesage from the skill deletion process is "+msg);
		if (msg.contains("Successfully Deleted")) 
		{
			System.out.println("Skill deleted Successfully");// on successful skill is deletion this message is printed  
		} else 
		{
			System.out.println("Skill not deleted");// if the skill is not deleted 
		}
		TimeUnit.SECONDS.sleep(5);
		Locate.verifysd(driver);
		Locate.profile(driver).click();
		Locate.logout(driver).click();
		TimeUnit.SECONDS.sleep(3);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Delete d = new Delete();
		d.openBrowser();
		d.orangehrm();
		TimeUnit.SECONDS.sleep(3);
		d.closeBrowser();
	}

}
