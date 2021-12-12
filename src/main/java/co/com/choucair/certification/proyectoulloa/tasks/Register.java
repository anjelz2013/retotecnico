package co.com.choucair.certification.proyectoulloa.tasks;

import co.com.choucair.certification.proyectoulloa.userinterface.utestregister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguage;
    private String strZipCode;
    private String strBrand;
    private String strModel;
    private String strOs;
    private String strCity;
    private String strPass;

    public Register(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguage, String strZipCode, String strBrand, String strModel, String strOs, String strCity, String strPass) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguage = strLanguage;
        this.strZipCode = strZipCode;
        this.strBrand = strBrand;
        this.strModel = strModel;
        this.strOs = strOs;
        this.strCity = strCity;
        this.strPass = strPass;
    }


    public static Register the(String srtFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguage, String strZipCode,String strCity, String strBrand, String strModel, String strOs, String strPass) {
        return Tasks.instrumented(Register.class, srtFirstName, strLastName, strEmail, strMonth,strDay,strYear,strLanguage, strZipCode, strCity, strBrand, strModel, strOs, strPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(utestregister.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(utestregister.NAME_FIRST),
                Enter.theValue(strLastName).into(utestregister.NAME_LAST),
                Enter.theValue(strEmail).into(utestregister.ENTER_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(utestregister.ENTER_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(utestregister.ENTER_DAY),
                SelectFromOptions.byVisibleText(strYear).from(utestregister.ENTER_YEAR),
                Enter.theValue(strLanguage).into(utestregister.ENTER_LANGUAGE),
                Click.on(utestregister.NEXT_LOCATION),
                Enter.theValue(strZipCode).into(utestregister.ZIP_CODE),
                Click.on(utestregister.ENTER_CITY),
                Click.on(utestregister.SELECT_CITY),
                Click.on(utestregister.NEXT_DEVICES),
                Click.on(utestregister.SELECT_BRAND),
                Click.on(utestregister.SELECT_BRAND1),
                Click.on(utestregister.SELECT_MODEL),
                Click.on(utestregister.SELECT_MODEL1),
                Click.on(utestregister.SELECT_OS),
                Click.on(utestregister.SELECT_OS1),
                Click.on(utestregister.NEXT_STEP),
                Enter.theValue(strPass).into(utestregister.ENTER_PASS),
                Enter.theValue(strPass).into(utestregister.ENTER_PASS1),
                Click.on(utestregister.ENTER_CHECK),
                Click.on(utestregister.ENTER_CHECK1)

        );

    }
}









