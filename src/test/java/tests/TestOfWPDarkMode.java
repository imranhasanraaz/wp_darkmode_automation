package tests;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Dashboard;
import pageObjects.Frontend;
import pageObjects.WPDarkMode;
import pageObjects.WpLogin;
import static utils.EnvReader.ReadEnv;

public class TestOfWPDarkMode extends BaseTest {
    @Test
    public void wpDarkModeTesting(){
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");
        String pluginName = testdata.getValue("/plugin").toString();

        logger.info("Navigated to admin login page");
        WpLogin wpLogin = new WpLogin();
        wpLogin.setUsername(ReadEnv("Username"));
        wpLogin.setPassword(ReadEnv("Password"));
        wpLogin.clickedOnLogin();
        Dashboard dashboard = new Dashboard();
        Assert.assertTrue(dashboard.waitForDisplayed(), "Dashboard is not open");
        logger.info("Login Successful");

        String allSubMenu = dashboard.getAllMenuName();
        if (allSubMenu.contains(pluginName)) {
            logger.info("plugin found in activated state");
            dashboard.clickedOnWpDarkMode();
        } else {
            dashboard.clickedOnPlugin();
            String allPluginList = dashboard.getAllPluginList();
            if (allPluginList.contains(pluginName)) {
                logger.info("plugin found in deactivated state");
                dashboard.clickedOnActive();
            } else {
                logger.info("plugin not found");
                dashboard.clickedOnAddNew();
                dashboard.clickedOnUploadPlugin();
                dashboard.clickedOnChooseFile(testdata.getValue("/pluginLocation").toString());
                dashboard.clickedOnInstall();
                dashboard.clickedOnActivePlugin();
                logger.info("Plugin Install and active successfully");
            }
        }
        WPDarkMode wpDarkMode = new WPDarkMode();
        Assert.assertTrue(wpDarkMode.waitForDisplayed(), "WP DarkMode Plugin Setting is not Open");
        wpDarkMode.enableBackendDarkMode();
        wpDarkMode.clickedOnSaveSettings();
        wpDarkMode.moveMouseTODarkModeButton();
        Assert.assertEquals(wpDarkMode.getBackgroundColor(), testdata.getValue("/darkModeBackgroundColor").toString(), "Dark Mode is not working");
        logger.info("Dark Mood Activated");
        wpDarkMode.clickedOnSwitchSetting();
        wpDarkMode.selectOtherFloatingStyle();
        wpDarkMode.clickedOnSaveSettings();
        logger.info("Floating Style Changed");
        wpDarkMode.clickedOnSwitchSetting();
        wpDarkMode.selectSwitchSizeCustom();
        wpDarkMode.setSliderTODesireValue(testdata.getValue("/scaleSize").toString());
        wpDarkMode.clickedOnSaveSettings();
        logger.info("Custom Size Updated");
        wpDarkMode.clickedOnSwitchSetting();
        String switchPosition = testdata.getValue("/position").toString();
        wpDarkMode.selectSwitchPosition(switchPosition);
        wpDarkMode.clickedOnSaveSettings();
        Assert.assertEquals(wpDarkMode.getSwitchPositionSelectedText(), switchPosition, "Position is not working");
        logger.info("Position switch worked fine");

        logger.info("Disable Keyboard Shortcut from the Accessibility Settings.");
        wpDarkMode.navigateToAccessibilitySetting();
        wpDarkMode.disableKeyboardShortcut();
        wpDarkMode.clickedOnSaveSettings();

        logger.info("Animation Setting");
        wpDarkMode.navigateToAnimationSettings();
        wpDarkMode.enableDarkModeToggleAnimation();
        wpDarkMode.selectAnimationEffect();
        wpDarkMode.clickedOnSaveSettings();

        logger.info("Frontend Validation");
        Frontend frontend = new Frontend();
        frontend.navigatedToFrontEnd();
        Assert.assertTrue(frontend.waitForDisplayed(), "Frontend is not open");
        Assert.assertTrue(frontend.validateDarkMode(), "WP Dark Mode is not working");

    }
}
