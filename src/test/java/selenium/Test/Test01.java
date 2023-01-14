package selenium.Test;

import selenium.Reports.ExtenseFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.Pages.*;

import static org.junit.jupiter.api.Assertions.*;

public class Test01 {

    WebDriver driver;
    Home home;
    Register register;
    HomeRegister homeRegister;
    OpenNewAccount openNewAccount;
    TransferFunds transferFunds;
    AccountsOverview accountsOverview;
    Account account;

    static ExtentSparkReporter spark = new ExtentSparkReporter("target/Reports.html");
    static ExtentReports extent;
    ExtentTest test;

    @BeforeEach
    public void setUp() {
        home = new Home(driver);
        register = new Register();
        homeRegister = new HomeRegister();
        openNewAccount = new OpenNewAccount();
        transferFunds = new TransferFunds();
        accountsOverview = new AccountsOverview();
        account = new Account();

        driver = home.chromeDriverConnection();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        extent = ExtenseFactory.getInstance();
        extent.attachReporter(spark);
    }

    @Test
    void test_01() throws InterruptedException {

        test = extent.createTest("test_ParaBank");
        test.log(Status.INFO, "Inicia el test...");

        home.toRegister();

        test.log(Status.PASS, "Abrir página de registro");

        Thread.sleep(3000);

        register.login();
        String resultLogin = driver.findElement(By.id("rightPanel")).getText();
        assertTrue(resultLogin.contains("You are now logged in"));

        test.log(Status.PASS, "Usuario registrado");

        homeRegister.openNewAccountBtn();

        test.log(Status.PASS, "Abrir página para crear nueva cuenta");

        Thread.sleep(1000);

        openNewAccount.openAccount();

        Thread.sleep(1000);

        String resultOpenAccount = driver.findElement(By.id("rightPanel")).getText();
        assertTrue(resultOpenAccount.contains("Congratulations, your account is now open"));

        test.log(Status.PASS, "Nueva cuenta creada");

        homeRegister.accountsOverview();

        Thread.sleep(1000);

        String resultAccountsOverview = driver.findElement(By.id("rightPanel")).getText();
        assertTrue(resultAccountsOverview.contains("Balance includes deposits that may be subject to holds"));

        test.log(Status.PASS, "Abrir página para ver el resumen de las cuentas");

        homeRegister.transferFounds();

        String openTransferFunds = driver.findElement(By.id("rightPanel")).getText();
        assertTrue(openTransferFunds.contains("Transfer Funds"));

        test.log(Status.PASS, "Abrir página para transferir fondos");

        Thread.sleep(1000);

        transferFunds.transferFunds();

        Thread.sleep(1000);

        String completeTransferFunds = driver.findElement(By.id("rightPanel")).getText();
        assertTrue(completeTransferFunds.contains("Transfer Complete!"));

        test.log(Status.PASS, "Transferencia registrada correctamente");

        homeRegister.accountsOverview();

        Thread.sleep(1000);

        String resultAccountsOverview_01 = driver.findElement(By.id("rightPanel")).getText();
        assertTrue(resultAccountsOverview_01.contains("Balance includes deposits that may be subject to holds"));

        test.log(Status.PASS, "Abrir página para ver el resumen de las cuentas");

        accountsOverview.clickAccount();

        Thread.sleep(1000);

        String accountDetails = driver.findElement(By.id("rightPanel")).getText();
        assertTrue(accountDetails.contains("Account Details"));

        test.log(Status.PASS, "Abrir página para ver el resumen de una de las cuentas");

        account.clickGo();
    }

    @AfterAll
    static void tearDown(){
        extent.flush();
    }
}
