package selenium.Pages;

import selenium.Base.BasePage;
import org.openqa.selenium.By;

public class HomeRegister extends BasePage {

    By openNewAccountBtn = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a");
    By accountsOverview = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a");
    By transferFounds = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a");

    public HomeRegister() {}

    public void clickOpenNewAccountBtn(){
        click(openNewAccountBtn);
    }

    public void clickAccountsOverview(){
        click(accountsOverview);
    }

    public void clickTransferFounds(){
        click(transferFounds);
    }

    public void openNewAccountBtn() throws InterruptedException {
        clickOpenNewAccountBtn();
    }

    public void accountsOverview() throws InterruptedException {
        clickAccountsOverview();
    }

    public void transferFounds() throws InterruptedException {
        clickTransferFounds();
    }
}
