package org.blackline;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Parameters("browser")
    @Test(groups = {"Smoke"},dataProvider="userInput")
    public void dataProviderMethod(String name,String surname,String identity) {
        System.out.println("Day2 good");
        System.out.println("name "+name);
        System.out.println("surname "+surname);
        System.out.println("identity "+identity);
    }

    @BeforeTest
    public void prerequiste() {
        System.out.println("Day 2---I will execute first in tests");
    }

    @DataProvider(name="userInput",indices = {1,2,3})
    public Object[][] dataProviderUserData() {
        Object[][] user_data =
                {
                        {"kindinti", "anumanthu", "data"},
                        {"ad1", "nan1", "surname1"},
                        {"ad2", "nan2", "surname2"},
                        {"ad3", "nan3", "surname3"}
                };
        return user_data;
    }

/*
	@BeforeTest
	public void prerequiste1()
	{
		System.out.println("Day 2---I will execute first1");
	}
	*/
}
