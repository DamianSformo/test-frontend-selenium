package selenium.Pages;

import selenium.Base.BasePage;
import org.openqa.selenium.By;

public class Account extends BasePage {

    By go = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[3]/td[2]/input");

    public Account() {}


    public void clickGo() throws InterruptedException {
        click(go);
    }

    public void toRegister()throws InterruptedException {
        clickGo();
    }
}
