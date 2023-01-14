package selenium.Pages;

import selenium.Base.BasePage;
import org.openqa.selenium.By;

public class TransferFunds extends BasePage {

    By amount = By.id("amount");
    By toAccountId = By.id("toAccountId");

    By transferBtn = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input");

    public TransferFunds(){}

    public void writeAmount(String amount){
        write(amount, this.amount);
    }

    public void selectFromAccountId(){
        enterAndDown(toAccountId);
    }

    public void clickTransferBtn(){
        click(transferBtn);
    }

    public void transferFunds(){
        writeAmount("100");
        selectFromAccountId();
        clickTransferBtn();
    }
}
