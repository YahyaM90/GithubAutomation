package GithubWeb;

import Base.BaseClass;
import Pages.GithubPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {



    @Test(testName = "TS-001")
    public void ClkdocMethod() throws InterruptedException {
        GithubPages Docs = new GithubPages(driver);

        Docs.ButtomOFpage();




    }

}
