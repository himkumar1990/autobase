package com.integra.autobase.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum DriverType implements DriverSetup {

    CHROME {

        @Override
        public DesiredCapabilities getDesiredCapablities() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public WebDriver getWebDriverObject(DesiredCapabilities cap) {
            // TODO Auto-generated method stub
            return null;
        }
    },
    FIREFOX {

        @Override
        public DesiredCapabilities getDesiredCapablities() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public WebDriver getWebDriverObject(DesiredCapabilities cap) {
            // TODO Auto-generated method stub
            return null;
        }
    },
    IE {

        @Override
        public DesiredCapabilities getDesiredCapablities() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public WebDriver getWebDriverObject(DesiredCapabilities cap) {
            // TODO Auto-generated method stub
            return null;
        }
    },
    EDGE {

        @Override
        public DesiredCapabilities getDesiredCapablities() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public WebDriver getWebDriverObject(DesiredCapabilities cap) {
            // TODO Auto-generated method stub
            return null;
        }
    }

}
