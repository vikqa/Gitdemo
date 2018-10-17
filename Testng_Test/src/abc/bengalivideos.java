package abc;

import java.io.IOException;

import org.testng.annotations.Test;

public class bengalivideos extends BaseTest {

    @Test(enabled = false, priority = 0)
    public void BengaliPageTitle() throws IOException {
        openBrowser();
        navigate("BengaliHomePage");
        //VerifyPageTitle("Watch, Stream Videos Online in Tamil, Bengali, Malayalam, Telugu & Kannada | OnMo");
        closeBrowser();
    }

    @Test(enabled = true, priority=1)
    public void BengaliWebLogin() throws IOException, InterruptedException {
        openBrowser();
        navigate("BengaliHomePage");
        wait(5);
        Login("9034127772");
    }

    @Test(enabled = true, priority=2)
    public void BengaliSubscribe() throws IOException, InterruptedException {
        
        advanceClick("Menu_Xpath");
        AllSubscribePlans("StringSubscribePlanList_Xpath");
        wait(5);
        }

    @Test(enabled = true, priority = 3)
    public void BengaliSearch() throws IOException, InterruptedException {
        HeaderSearchVideoNPlay("Anu fall in Love");
    }
    
    @Test(enabled = true, priority = 4)
    public void BengaliFavorite() throws IOException, InterruptedException{
        VideoFavoriteLogic("Bengalifavorites");
    }
    
    @Test(enabled = true, priority = 5 )
    public void BengaliAPISearch() throws IOException, InterruptedException {
        HeaderAPISearchNPlay("Kis");
        closeBrowser();
    }

    

}