package selenium.Pages;

import selenium.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends BasePage {

    By register = By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a");

    public Home(WebDriver driver) {}
    //public Home(WebDriver driver, WebDriverWait wait) {}

    public void clickBtnRegister() throws InterruptedException {
        click(register);
    }

    public void toRegister()throws InterruptedException {
        clickBtnRegister();
    }
}
