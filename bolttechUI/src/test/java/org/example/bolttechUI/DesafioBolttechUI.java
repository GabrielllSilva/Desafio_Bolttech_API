package org.example.bolttechUI;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class DesafioBolttechUI {

    public DesafioBolttechUI(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), page: this);
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Chrome\"]")
    private RemoteWebElement inputFirstNumber;
}
