package pageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class Frontend extends BaseForm {
    public final IButton frontend = getElementFactory().getButton(By.xpath("//a[normalize-space()='localhost/wordpress']"), "demo site");
    private final ILabel wpDarkModeLabel = getElementFactory().getLabel(By.xpath("//label[@for='wp-dark-mode-switch']"), "WP Dark Mode Lable");

    public Frontend(){
        super(By.xpath("//h1[@class='alignwide wp-block-heading']"), "Unique Element of frontend homepage");
    }

    public void navigatedToFrontEnd(){
        frontend.clickAndWait();
    }
    public boolean validateDarkMode() {
        return wpDarkModeLabel.state().isExist();
    }
}
