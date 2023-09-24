package pageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class WpLogin extends BaseForm {
    private final ITextBox username = getElementFactory().getTextBox(By.xpath("//input[@id='user_login']"), "username");
    private final ITextBox password = getElementFactory().getTextBox(By.xpath("//input[@id='user_pass']"), "Password");
    private final IButton login = getElementFactory().getButton(By.xpath("//input[@id='wp-submit']"), "Login");
    public WpLogin(){
        super(By.xpath("//a[normalize-space()='Lost your password?']"), "login page is not open");
    }

    public void setUsername(String value){
        username.clearAndType(value);
    }

    public void setPassword(String value){
        password.clearAndType(value);
    }

    public void clickedOnLogin(){
        login.clickAndWait();
    }
}