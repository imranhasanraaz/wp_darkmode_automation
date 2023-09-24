package pageObjects;
import aquality.selenium.elements.interfaces.*;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class WPDarkMode extends BaseForm {
    private final ILabel backendDarkMoodIndicator = getElementFactory().getLabel(By.xpath("//div[@class='modes wp-dark-mode-ignore']"), "Dark Mode Enable Button");
    private final IElement enableBackendDarkMode = getElementFactory().getButton(By.cssSelector("label[for='wppool-wp_dark_mode_general[enable_backend]'] div[class='wp-dark-mode-ignore']"), "Enable Backend Dark Mode");
    private final IButton saveButton = getElementFactory().getButton(By.xpath("//input[@id='save_settings' and @value='Save Settings']"), "Save Button");
    private final ILabel backgroundColorOfAnElement = getElementFactory().getLabel(By.xpath("//h2[normalize-space()='WP Dark Mode Settings']"), "WP Setting");
    private final IButton switchSetting = getElementFactory().getButton(By.xpath("//a[@id='wp_dark_mode_switch-tab']//span[contains(text(),'Switch Settings')]"), "switch setting");
    private final ILabel floatingSwitchStyle = getElementFactory().getLabel(By.xpath("//label[@for='wppool-wp_dark_mode_switch[switch_style][3]']//img[@class='image-choose-img']"), "Floating style switch");
    private final IButton switchSizeCustom = getElementFactory().getButton(By.xpath("//span[text()='Custom']"), "Switch Custom size");
    private final ILabel slider = getElementFactory().getLabel(By.xpath("//tr[@class='switcher_scale']//div[@class='wppool-slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"), "slider");
    private final IComboBox switchPosition = getElementFactory().getComboBox(By.xpath("//select[@id='wp_dark_mode_switch[switcher_position]' and @name='wp_dark_mode_switch[switcher_position]']"), "Switch Position Dropdown");
    private final IButton accessibilitySetting = getElementFactory().getButton(By.xpath("//a[@href='#wp_dark_mode_accessibility']"), "Accessibility Setting");
    private final IElement keyboardShortcut = getElementFactory().getLabel(By.cssSelector("label[for='wppool-wp_dark_mode_accessibility[keyboard_shortcut]'] div[class='wp-dark-mode-ignore']"), "Keyboard Shortcut Button");
    private final IButton animation = getElementFactory().getButton(By.xpath("//a[@id='wp_dark_mode_animation-tab']//span[contains(text(),'Animation')]"), "Animation");
    private final ICheckBox darkModeToggleAnimation = getElementFactory().getCheckBox(By.xpath("//input[@type='checkbox' and @name='wp_dark_mode_animation[toggle_animation]' and @value='on' and @checked='checked']"), "Darkmode Toggle Animation");
    private final IComboBox animationEffect = getElementFactory().getComboBox(By.xpath("//select[contains(@id,'wp_dark_mode_animation')]"), "Effect of Animation");

    public WPDarkMode(){
        super(By.xpath("//h2[normalize-space()='WP Dark Mode Settings']"),"Dark mode Plugin");
    }

    public void enableBackendDarkMode(){
        if(!backendDarkMoodIndicator.state().isDisplayed())
            enableBackendDarkMode.clickAndWait();
    }
    public void clickedOnSaveSettings(){
        saveButton.getJsActions().scrollIntoView();
        saveButton.clickAndWait();
    }
    public void moveMouseTODarkModeButton(){
        backendDarkMoodIndicator.getMouseActions().moveMouseToElement();
        backendDarkMoodIndicator.click();
    }

    public String getBackgroundColor(){
        return backgroundColorOfAnElement.getCssValue("background-color");
    }
    public void clickedOnSwitchSetting(){
        switchSetting.clickAndWait();
    }

    public void selectOtherFloatingStyle(){
        floatingSwitchStyle.click();
    }
    public void selectSwitchSizeCustom(){
        switchSizeCustom.getJsActions().scrollIntoView();
        switchSizeCustom.click();
    }
    public void setSliderTODesireValue(String value){
        slider.getJsActions().scrollIntoView();
        slider.getJsActions().setAttribute("data-value", value);
    }

    public void selectSwitchPosition(String value) {
        switchPosition.clickAndSelectByText(value);
    }

    public String getSwitchPositionSelectedText() {
        return switchPosition.getSelectedText();

    }

    public void navigateToAccessibilitySetting() {
        accessibilitySetting.clickAndWait();
    }

    public void disableKeyboardShortcut() {
        if (keyboardShortcut.state().isEnabled()) {
            keyboardShortcut.clickAndWait();
        }
    }
    public void navigateToAnimationSettings() {
        animation.clickAndWait();
    }

    public void enableDarkModeToggleAnimation() {
        if (!darkModeToggleAnimation.state().isExist()) {
            darkModeToggleAnimation.clickAndWait();
        }
    }

    public void selectAnimationEffect() {
        int selectedThirdOne = 3;
        animationEffect.selectByIndex(selectedThirdOne);

    }
}
