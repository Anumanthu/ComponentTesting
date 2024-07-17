package org.blackline;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {


    @Test(groups = {"Smoke"})
    public void ploan() {
        System.out.println("Day2 good");
    }

    @BeforeTest
    public void prerequiste() {
        System.out.println("Day 2---I will execute first in tests");
    }
	
/*
	@BeforeTest
	public void prerequiste1()
	{
		System.out.println("Day 2---I will execute first1");
	}
	*/

}
