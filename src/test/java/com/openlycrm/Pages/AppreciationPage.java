package com.openlycrm.Pages;


import com.openlycrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

   public AppreciationPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy(xpath = "(//*[@class='menu-popup-item-text'])[2]")
    public WebElement appreciation;

   @FindBy(xpath = "//div[@id='post-buttons-bottom']/span")
    public WebElement uploadFilesicon;

//   @FindBy(css = "bxu_files[]")
 // public WebElement uploadimage;

   @FindBy(xpath = "//div[@class='diskuf-uploader']")
   public WebElement uploadfilesandimages;

   @FindBy(xpath ="//td[@class='wd-fa-add-file-light-cell']" )
   public WebElement selectDocFromBitrix;


   @FindBy(css="span[class*='accept']")
   public WebElement selectDoc;

   @FindBy(id="blog-submit-button-save")
   public WebElement send;

   @FindBy(xpath = "//span[@class='diskuf-label-icon']")
   public WebElement uploadplace;

   @FindBy(id = "id='post-buttons-bottom']/span[2]")
    public WebElement link;

   @FindBy(xpath = "//div[@id='post-buttons-bottom']/span[3]")
    public WebElement insertVideo;


    @FindBy(xpath = "//div[@id='post-buttons-bottom']/span[4]")
    public WebElement quoteText;


    @FindBy(xpath = "//div[@id='post-buttons-bottom']/span[5]")
    public WebElement addMention;

    @FindBy(css="button#blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(css="feed-add-post-grat-container")
    public WebElement addRecipient;





}
