package org.academy.web.pages;

import org.academy.utils.web.elements.elements.*;
import org.academy.web.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Issue21420Page extends AbstractPage {
    public Issue21420Page(WebDriver webDriver) {
        super(webDriver, false, "");
    }
    public Issue21420Page(WebDriver webDriver, boolean navigateToPage, String navigateToPageUrl) {
        super(webDriver, navigateToPage, navigateToPageUrl);
    }

    @FindBy(xpath = "//tr[contains(@class,'d-block')]//p")
    private List<WebElement> commentsList;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]/g-emoji[1]/font[1]/font[1]")
    private WebElement reaction;

    public String getLastComment() {
        return commentsList.get(commentsList.size()-1).getText();
    }

    public String getReaction(){
        return reaction.getText();
    }
}
