package co.com.choucair.certification.proyectoulloa.questions;

import co.com.choucair.certification.proyectoulloa.userinterface.utestregister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strValidation;

    public Answer(String strValidation) {
        this.strValidation = strValidation;
    }

    public static Answer toThe(String strValidation) {
        return new Answer(strValidation);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String botonEnd= Text.of(utestregister.ENTER_BUTONEND).viewedBy(actor).asString();
        if (strValidation.equals(botonEnd)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
