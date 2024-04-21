package Locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locate {

	public static WebElement username(WebDriver driver) {
		// id of username
		WebElement username = driver.findElement(By.name("username"));
		return username;
	}

	public static WebElement password(WebDriver driver) {
		// id of password
		WebElement password = driver.findElement(By.name("password"));
		return password;
	}

	public static WebElement login(WebDriver driver) {
		// locating login by xpath which contains class
		WebElement login = driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		return login;
	}

	public static WebElement admin(WebDriver driver) {
		// id of admin
		WebElement admin = driver.findElement(By.linkText("Admin"));
		return admin;
	}

	public static WebElement job(WebDriver driver) {
		// xpath of Job
		WebElement job = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/header/div[2]/nav/ul/li[2]"));
		return job;
	}

	public static WebElement jobcategory(WebDriver driver) {
		// xpath of Job Category
		WebElement jobcategory = driver.findElement(By.xpath("//*[text()='Job Categories']"));
		return jobcategory;
	}

	public static WebElement add(WebDriver driver) {
		// xpath of add button
		WebElement add = driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
		return add;
	}

	public static WebElement category(WebDriver driver) {
		// xpath of category of job to be added
		WebElement category = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
		return category;
	}
	
	public static void cbox(WebDriver driver) {
		List<WebElement> lol=driver.findElements(By.xpath("//*[@class=\"oxd-table-row oxd-table-row--with-border\" and @role=\"row\"]"));
	    int y1 = -1; // Initialize y1 with a default value (e.g., -1) in case the skill is not found

	    for (int i = 0; i < lol.size(); i++) {
	        WebElement j = lol.get(i);
	        String str2 = j.getText();
	        String str1 = "Test Engineer";
//	        System.out.println(i+")"+str2);
	    
	        if (str2.equals(str1)) {
	            y1 = i; // Update y1 with the correct index
	        }
	    }	
	    List<WebElement> cboxx=driver.findElements(By.xpath("//*[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]"));
		for(int i=0;i<cboxx.size();i++)
		{
			if(i==y1) {
				cboxx.get(i).click();
			}
			}
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)"," ");
	
		WebElement devl = driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]"));
		devl.click();
	}

	
	public static WebElement save(WebDriver driver) {
		// xpath of save button
		WebElement save = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
															 
		return save;
	}

	public static WebElement del1(WebDriver driver) {
		// id of delete button
		WebElement del1 = driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]"));
		return del1;
	}
	
	public static WebElement yesdel(WebDriver driver) {
		// id of Yes,delete confirmation button
		WebElement yesdel = driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]"));
		return yesdel;
	}
	public static WebElement organization(WebDriver driver) {
		// locating of organization dropdown through cssSelector
		WebElement organization = driver.findElement(By.xpath("//*[text()[contains(.,'Organization')]]"));
		return organization;
	}
	public static WebElement location(WebDriver driver) {
		//to locate location form the topbar
		WebElement location = driver.findElement(By.xpath("//*[text()='Locations']"));
		return location;
	}
	public static WebElement locadd(WebDriver driver) {
		// add location
		WebElement locadd = driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
		return locadd;													
	}
	public static WebElement name(WebDriver driver) {
		// name in location page
		WebElement name = driver.findElement(By.xpath("//*[@placeholder=\"Type here ...\"]"));
		return name;
	}

	public static WebElement india(WebDriver driver) {
		// select india
		WebElement india = driver.findElement(By.xpath("//*[text()=\"India\"]"));
		return india;
	}
	public static void loccb(WebDriver driver) {
		// save location
		List<WebElement> lol=driver.findElements(By.xpath("//*[@class=\"oxd-table-row oxd-table-row--with-border\" and @role=\"row\"]"));
	    int y1 = -1; // Initialize y1 with a default value (e.g., -1) in case the skill is not found

	    for (int i = 0; i < lol.size(); i++) {
	        WebElement j = lol.get(i);
	        String str2 = j.getText();
	        String str1 = "Admin";
	        
	    
	        if (str2.equals(str1)) {
	            y1 = i; // Update y1 with the correct index
	        }
	    }	
	    List<WebElement> cboxx=driver.findElements(By.xpath("//*[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]"));
		for(int i=0;i<cboxx.size();i++)						
		{
			if(i==y1) {
				cboxx.get(i).click();
			}
			}
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)"," ");//scrolling down to find the saved location
		
		
		js.executeScript("window.scrollBy(0,-350)"," ");//scrolling up to find the delete button 
		WebElement devl = driver.findElement(By.xpath("//*[@class=\"oxd-icon-button oxd-table-cell-action-space\"]"));
		devl.click();
		
	}
	public static WebElement qualification(WebDriver driver) {
		// save location
		WebElement qualification = driver.findElement(By.xpath("//*[text()[contains(.,\"Qualifications\")]]"));
		return qualification;
	}
	public static WebElement skills(WebDriver driver) {
		// id of skills from dropdown 
		WebElement skills = driver.findElement(By.cssSelector("a.oxd-topbar-body-nav-tab-link"));
		return skills;
	}
	
	public static void loe(WebDriver driver){
		List<WebElement> loe=driver.findElements(By.xpath("//*[@class=\"oxd-table-row oxd-table-row--with-border\"]"));//creating the list of Webelements skills to select the saved "Testing Demo" skill.
	    int y1 = -1; // Initialize y1 with a default value (e.g., -1) in case the skill is not found

	    for (int i = 0; i < loe.size(); i++) {
	        WebElement j = loe.get(i);
	        String str = j.getText();
	        String str1 = "Testing Demo";

//	        System.out.println(i + ")" + str);
	        if (str.equals(str1)) {
	            y1 = i; // Update y1 with the correct index
	        }
	    }	
	    List<WebElement> cboxx=driver.findElements(By.xpath("//*[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]"));
		for(int i=0;i<cboxx.size();i++)
		{
			if(i==y1) {
				cboxx.get(i).click();//clicking the Testing demo checkbox for deleteion 
			}
			}
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)"," ");//scrolling up the page to search for the delete button 
	
		WebElement devl = driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]"));
		devl.click();
	}
	

	public static WebElement txt(WebDriver driver) {
		// xpath of successfully deleted text (alert)
		WebElement txt = driver.findElement(By.xpath("//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]"));
		return txt;
		}
		
		public static void verifysd(WebDriver driver) {
			//to check whether the skill is actually deleted (reverify)
			List<WebElement> loe=driver.findElements(By.xpath("//*[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
		    for (int i = 0; i < loe.size(); i++) {
		        WebElement j = loe.get(i);
		        String str = j.getText();
		        String str1 = "Testing Demo";

		        if (str.equals(str1)) {
		            System.out.println("Skill not deleted");
		            break ;
		        }
		    }
		    System.out.println("skill deleted successfully Reverified");
		}
		
		public static WebElement profile(WebDriver driver) {
			// xpath of successfully deleted text (alert)
			WebElement profile = driver.findElement(By.xpath("//*[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]"));
			return profile;
			}
		
		public static WebElement logout(WebDriver driver) {
			// xpath of successfully deleted text (alert)
			WebElement logout = driver.findElement(By.xpath("//a[@role=\"menuitem\" and @href=\"/web/index.php/auth/logout\" ]"));
			return logout;
			}
	}

