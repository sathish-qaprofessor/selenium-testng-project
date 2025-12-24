package org.automation.pages;

import org.framework.base.PageBase;
import org.framework.htmls.*;
import org.openqa.selenium.By;

public class SignInPage extends PageBase {

    public HtmlElement signInPageTitle = new HtmlElement(By.cssSelector("header.page-header h1"));
    public HtmlInput emailInput = new HtmlInput(By.name("email"));
    public HtmlInput passwordInput = new HtmlInput(By.name("password"));
    public HtmlButton showPasswordButton = new HtmlButton(By.cssSelector("button[data-action='show-password']"));
    public HtmlButton signInButton = new HtmlButton(By.id("submit-login"));
    public HtmlLink forgotYourPasswordLink = new HtmlLink(By.cssSelector("div.forgot-password a"));
    public HtmlLink noAccountCreateOneLink = new HtmlLink(By.cssSelector("div.no-account a"));

}
