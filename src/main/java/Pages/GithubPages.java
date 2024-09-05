package Pages;
import org.openqa.selenium.*;
import static Opjectpath.GithubOpject.*;

public class GithubPages {
    WebDriver driver = null;

    public GithubPages(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenGitHubUrl() {
        driver.get("https://github.com/");
    }

    public void ButtomOFpage() throws InterruptedException {
        WebElement DocLink = driver.findElement(Docs);
        DocLink.sendKeys(Keys.END);
        Thread.sleep(3000);
        DocLink.click();
        Thread.sleep(5000);


    }

}