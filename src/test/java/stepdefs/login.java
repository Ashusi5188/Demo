package stepdefs;
        import cucumber.api.java.en.And;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import org.junit.Assert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;


public class login {
    static {
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
    }
    WebDriver driver;
    @Given("^User is at login page of facebook$")
    public void userIsAtLoginPage()  {
        driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        String expected_title="Facebook – log in or sign up";
       // Assert.assertEquals(expected_title,driver.getTitle());
    }
    @When("^User enters email and password$")
    public void userEntersEmailAndPassword()
    {
        driver.findElement(By.id("email")).sendKeys("ashutoshsingh.realman@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("abc");

    }

    @And("^User clicks on login button$")
    public void userClicksOnLoginButton()  {
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^User navigates to Home page of facebook$")
    public void userNavigatesToHomePageOfFacebook()  {
        String expected_title="Facebook";
       // Assert.assertEquals(expected_title,driver.getTitle());
    }

    @And("^User closes application$")
    public void userClosesApplication() {
        driver.quit();
    }
}
