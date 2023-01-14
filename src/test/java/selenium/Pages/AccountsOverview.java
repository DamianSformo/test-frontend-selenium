package selenium.Pages;

import selenium.Base.BasePage;
import org.openqa.selenium.By;

public class AccountsOverview extends BasePage {

    By account = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/a");

    public AccountsOverview() {}

    public void clickAccount() throws InterruptedException {
        click(account);
    }

    public void toRegister()throws InterruptedException {
        clickAccount();
    }
}
