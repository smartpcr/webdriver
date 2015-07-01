package org.finra.uitest.pagemodel.util;

import com.sun.deploy.services.PlatformType;

/**
 * Created by Administrator on 7/1/2015.
 */
public class Browser {

    private BrowserType browserType;
    private String version;
    private PlatformType platform;

    public BrowserType getBrowserType() {
        return browserType;
    }

    public void setBrowserType(BrowserType name) {
        this.browserType = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PlatformType getPlatform() {
        return platform;
    }

    public void setPlatform(PlatformType platform) {
        this.platform = platform;
    }
}
