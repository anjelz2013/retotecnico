package co.com.choucair.certification.proyectoulloa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class utestregister extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to Join today").located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target NAME_FIRST = Target.the("write the first name").located(By.id("firstName"));
    public static final Target NAME_LAST = Target.the("write last name").located(By.name("lastName"));
    public static final Target ENTER_EMAIL = Target.the("write you email register").located(By.xpath("//input[@id='email']"));
    public static final Target ENTER_MONTH = Target.the("write your birth month").located(By.id("birthMonth"));
    public static final Target ENTER_DAY = Target.the("write your birth day").located(By.id("birthDay"));
    public static final Target ENTER_YEAR = Target.the("write your birth year").located(By.name("birthYear"));
    public static final Target ENTER_LANGUAGE = Target.the("write you language").located(By.xpath("//input[@type='search']"));
    public static final Target NEXT_LOCATION = Target.the("next page of register").located(By.cssSelector(".btn-blue"));
    public static final Target ZIP_CODE = Target.the("enter zip code").located(By.name("zip"));
    public static final Target ENTER_CITY = Target.the("enter you city").located(By.xpath("//div[4]/div[2]/div/div/div/span"));
    public static final Target SELECT_CITY = Target.the("select you city").located(By.cssSelector("#ui-select-choices-row-2-158 > span > div"));
    public static final Target NEXT_DEVICES = Target.the("second page of register").located(By.xpath("//a/span"));
    public static final Target SELECT_BRAND = Target.the("select you brand mobile").located(By.xpath("//div[@id='mobile-device']/div/div[2]/div/div/span"));
    public static final Target SELECT_BRAND1 = Target.the("select you brand mobile").located(By.cssSelector("#ui-select-choices-row-6-2 div"));
    public static final Target SELECT_MODEL = Target.the("select you model mobile").located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/div/span"));
    public static final Target SELECT_MODEL1 = Target.the("select you model mobile").located(By.cssSelector("#ui-select-choices-row-7-59 div"));
    public static final Target SELECT_OS = Target.the("select you os mobile").located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/div/span"));
    public static final Target SELECT_OS1 = Target.the("select you os mobile").located(By.cssSelector("#ui-select-choices-row-8-18 div"));
    public static final Target NEXT_STEP = Target.the("next page of register").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
    public static final Target ENTER_PASS = Target.the("enter your password").located(By.id("password"));
    public static final Target ENTER_PASS1 = Target.the("confirm password").located(By.id("confirmPassword"));
    public static final Target ENTER_CHECK = Target.the("select the first politician").located(By.xpath("//div[5]/label/span"));
    public static final Target ENTER_CHECK1 = Target.the("select the second politician").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span"));
    public static final Target ENTER_BUTONEND = Target.the("complete page of register").located(By.cssSelector("#laddaBtn > span"));

}
