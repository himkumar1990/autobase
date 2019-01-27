package com.integra.autobase.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverSetup {

    public DesiredCapabilities getDesiredCapablities();

    public WebDriver getWebDriverObject(DesiredCapabilities cap);

}
