package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    private static final Logger logger = LogManager.getLogger(Listeners.class);
    @Override
     public void onTestStart(ITestResult result) {
        logger.trace("***** Test started: "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
    }
    @Override
    public void onTestFailure(ITestResult result) {

    }
    @Override
    public void onTestSkipped(ITestResult result) {
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }
    @Override
    public void onStart(ITestContext context) {
    }
    @Override
    public void onFinish(ITestContext context) {
    }

}
