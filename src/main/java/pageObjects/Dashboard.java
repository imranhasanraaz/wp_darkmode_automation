package pageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import frameworks.BaseForm;
import org.openqa.selenium.By;

import java.io.File;


public class Dashboard extends BaseForm {
    private final IButton wpDarkMode = getElementFactory().getButton(By.cssSelector("a[class='wp-has-submenu wp-not-current-submenu menu-top toplevel_page_wp-dark-mode-settings menu-top-last'] div[class='wp-menu-name']"), "WP Dark Mode");
    private final IButton plugins = getElementFactory().getButton(By.cssSelector("a[class='wp-has-submenu wp-not-current-submenu menu-top menu-icon-plugins'] div[class='wp-menu-name']"), "plugins");
    private final IButton addNew = getElementFactory().getButton(By.xpath("//a[@class='page-title-action']"), "Add New plugin");
    private final IButton uploadPlugin = getElementFactory().getButton(By.xpath("//span[@class='upload']"), "Upload Plugin");
    private final IButton chooseFile = getElementFactory().getButton(By.xpath("//input[@id='pluginzip']"), "Choose file");
    private final IButton install = getElementFactory().getButton(By.xpath("//input[@id='install-plugin-submit']"), "plugin install button");
    private final IButton activePlugin = getElementFactory().getButton(By.xpath("//a[@id='activate-wp-dark-mode']"), "Plugin Activated Button");
    private final IButton activePluginWhileInstall = getElementFactory().getButton(By.xpath("//a[@class='button button-primary']"), "Active plugin while installing");
    private final ILabel wpMenu = getElementFactory().getLabel(By.xpath("//ul[@id='adminmenu']"), "Menu");
    private final ILabel allPluginList =getElementFactory().getLabel(By.id("the-list"), "Plugin List");

    public String getAllPluginList(){
        return allPluginList.getText();
    }

    public String getAllMenuName(){
        return wpMenu.getText();
    }

    public Dashboard(){
        super(By.xpath("//div[normalize-space()='Dashboard']"), "Dashboard");
    }

    public void clickedOnActivePlugin(){
        activePluginWhileInstall.clickAndWait();
    }

    public void clickedOnActive(){
        activePlugin.clickAndWait();
    }

    public void clickedOnInstall(){
        install.clickAndWait();
    }
    public void clickedOnChooseFile(String path){
        String filePath = new File(path).getAbsolutePath();
        chooseFile.sendKeys(filePath);
    }
    public void clickedOnWpDarkMode(){
        wpDarkMode.clickAndWait();
    }
    public void clickedOnAddNew(){
        addNew.clickAndWait();

    }
    public void clickedOnUploadPlugin(){
        uploadPlugin.clickAndWait();
    }

    public void clickedOnPlugin(){
        plugins.clickAndWait();
    }

}
