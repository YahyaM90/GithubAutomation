package GithubWeb;

import Base.BaseClass;
import Pages.GithubPages;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {



    @Test(testName = "TS-001")
    @Severity(SeverityLevel.BLOCKER)
    public void ClkdocMethod() throws InterruptedException {
        GithubPages Docs = new GithubPages(driver);

        Docs.ButtomOFpage();




    }

}
