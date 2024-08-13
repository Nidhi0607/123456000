package books;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.qsp.genericutility.Baseclass;
import com.qsp.genericutility.Excelutility;
import com.qsp.objectrepository.HomePage;

public class TC_DWS_005_Test extends Baseclass
{
	@Test
	public void clickonBooks() throws IOException
	{
		hp=new HomePage(driver);
		excelLib=new Excelutility();
		String actualTitle = driver.getTitle();
		String ExpectedTitle = excelLib.getStringDataFromExcel("Book", 1,0);
		Assert.assertEquals(actualTitle, ExpectedTitle , "Books page is not displayed");
		Reporter.log("Books page is displayed");
		
	}
}

	

