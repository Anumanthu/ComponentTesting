package org.blackline;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult result) {

//System.out.println("Succesfully executed test case---->"+result.getName());


    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Succesfully taken screenshot for Failed test case---->" + result.getName());

        System.out.println(result.getTestName());

        System.out.println(result.getStatus());

        System.out.println(result.FAILURE);


    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }

}
