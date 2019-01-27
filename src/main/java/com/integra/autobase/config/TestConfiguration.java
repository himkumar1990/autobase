package com.integra.autobase.config;

import java.util.HashMap;
import java.util.Map;

import org.testng.ITestContext;

public class TestConfiguration {

    public static enum BrowserTypes {
        CHROME, FIREFOX, IE, EDGE;
    }

    public static enum Environment {
        WINDOWS, LINUX
    }

    public static enum ParameterNames {
        browser, isremote, gridurl, browserurl, platform;
    }

    private BrowserTypes browserType;
    private Environment environment;
    private String browserUrl;
    private boolean isRemote;
    private String gridUrl;
    private String usersFile;
    public static Map<String, String> configParameters = new HashMap<>();

    public void loadConfigParameters(ITestContext context) {
        configParameters = context.getCurrentXmlTest().getSuite().getParameters();
        String browser = configParameters.get(ParameterNames.browser.toString().toUpperCase());
        browserType = BrowserTypes.valueOf(browser);

        environment = Environment.valueOf(configParameters.get(ParameterNames.platform.toString().toUpperCase()));
        browserUrl = configParameters.get(ParameterNames.browserurl.toString());
        isRemote = Boolean.parseBoolean(configParameters.get(ParameterNames.isremote.toString()));
        gridUrl = configParameters.get(ParameterNames.gridurl.toString());
        usersFile = configParameters.get("users");
    }

}
