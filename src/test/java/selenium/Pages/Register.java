package selenium.Pages;

import selenium.Base.BasePage;
import org.openqa.selenium.By;

public class Register extends BasePage {

    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By repeatedPassword = By.id("repeatedPassword");

    By registerBtn = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input");

    public Register() {}

    public void writeFirtsName(String firstName){
        write(firstName, this.firstName);
    }

    public void writeLastName(String lastName){
        write(lastName, this.lastName);
    }

    public void writeAddress(String address){
        write(address, this.address);
    }

    public void writeCity(String city){
        write(city, this.city);
    }

    public void writeState(String state){
        write(state, this.state);
    }

    public void writeZipCode(String zipCode){
        write(zipCode, this.zipCode);
    }

    public void writePhone(String phone){
        write(phone, this.phone);
    }

    public void writeSsn(String ssn){
        write(ssn, this.ssn);
    }

    public void writeUsername(String username){
        write(username, this.username);
    }

    public void writePassword(String password){
        write(password, this.password);
    }

    public void writeRepeatedPassword(String repeatedPassword){
        write(repeatedPassword, this.repeatedPassword);
    }

    public void clickRegisterBtn() throws InterruptedException {
        click(registerBtn);
    }

    public void login() throws InterruptedException {
        writeFirtsName("Juan");
        writeLastName("Perez");
        writeAddress("Av. San Martín 1234");
        writeCity("CABA");
        writeState("Buenos Aires");
        writeZipCode("1234");
        writePhone("11345678");
        writeSsn("123");
        writeUsername("perez-juan-testing");
        writePassword("12345678");
        writeRepeatedPassword("12345678");

        Thread.sleep(1000);

        clickRegisterBtn();
    }

}