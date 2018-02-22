import cucumber.api.PendingException;

public class HomePageSteps {
    public HomePageSteps() {
        @When("^I launch Quikr app$")
        public void iLaunchQuikrApp() throws Throwable {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "5.1");
            capabilities.setCapability("deviceName", "Custom Phone");
            capabilities.setCapability("app",
                    "C:\\Users\\gourav\\IdeaProjects\\Hellow\\App\\com.quikr_2018-02-08.apk");
            AppiumDriver wd = new AppiumDriver(new
                    URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            throw new PendingException();
        });
    }
}
