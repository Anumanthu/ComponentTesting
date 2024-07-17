package org.blackline;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day3 {
	
/*	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Day3 It will execute BEFORE executing any test method in Day3 class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Day3 It will execute AFTER executing any test method in Day3 class");
	}
	*/


    //@Parameters("URL")
    @Test
    @Parameters("URL")//This we can give above test as well
    public void WebloginCarLoan(String url) {
        //selenium
        System.out.println("Day3 weblogincar");
        //System.out.println("Day3 browser "+url);
        //System.out.println();

    }

    @Parameters({"URL", "USERID"})
    @Test(groups = {"Smoke"})
    public void MobileLogincarLoan(String url, String userid) {
        //Appium
        System.out.println("Dya3 Mobilelogincar");
        System.out.println("Day3 browser " + url);
        System.out.println("Day3 browser " + userid);

        Assert.assertTrue(false);

    }


    @BeforeSuite
    public void Bfsuite() {
        System.out.println("Day3 I am no 1");
    }

    @BeforeSuite
    public void Bfsuite1() {
        System.out.println("DAY3 I'M THE NO.1");
    }

    /*
        @BeforeMethod
        public void beforemethod()
        {
            System.out.println("Day3 I will execute BEFORE executing ALL test methods in Day3 class");
        }

        @AfterMethod
        public void aftermethod()
        {
            System.out.println("Day3 I will execute AFTER executing ALL test methods in Day3 class");
        }
        */
    @Test(enabled = false)
    public void MobilesignincarLoan() {
        //Appium
        System.out.println("Day3 MobilesignincarLoan");
    }

    @Test(timeOut = 4000)
    public void MobilesignoutcarLoan() {
        //Appium
        System.out.println("Day3 MobilesignoutcarLoan");
        //System.out.println(username);
        //System.out.println(password);

    }

    //@Test
    //@Test(dependsOnMethods= {"WebloginCarLoan","MobilesignoutcarLoan"},dataProvider="mydata")
    //@Test(dependsOnMethods= {"MobilesignoutcarLoan"},dataProvider="getData",groups= {"smoke","regression"})
    @Test(dependsOnMethods = {"MobilesignoutcarLoan"}, dataProvider = "getData")
    public void LoginAPIcarLoan(String username, String password) {
        //Rest API automation
        System.out.println("Day3 LoginAPIcarLoan");
        System.out.println(username);
        System.out.println(password);
    }


    //@DataProvider(name="myData")
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[4][2];

        //first set of data

        data[0][0] = "anumanthu";
        data[0][1] = "sandhya@143";


        //2nd set of data

        //data[1][0]=123;
        //data[1][1]=234;
        data[1][0] = "nandini";
        data[1][1] = "nandini@143";

        //3rd set of data

        data[2][0] = "divya";
        data[2][1] = "divya@123";

        //4th set of data

        data[3][0] = "ram";
        data[3][1] = "ram@123";


        return data;

    }


}