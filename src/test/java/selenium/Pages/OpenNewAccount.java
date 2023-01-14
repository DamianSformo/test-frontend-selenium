package selenium.Pages;

import selenium.Base.BasePage;
import org.openqa.selenium.By;

public class OpenNewAccount extends BasePage {

    By type = By.id("type");
    By saving = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]/option[2]");

    By openNewAccountBtn = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input");

    public OpenNewAccount(){}

    public void selectSaving(){
        click(type);
        click(saving);
    }

    public void clickSubmitBtn(){
        click(openNewAccountBtn);
    }

    public void openAccount() throws InterruptedException {
        selectSaving();
        clickSubmitBtn();
    }
}
