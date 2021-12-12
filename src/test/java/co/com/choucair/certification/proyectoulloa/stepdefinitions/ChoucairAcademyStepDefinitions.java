package co.com.choucair.certification.proyectoulloa.stepdefinitions;

import co.com.choucair.certification.proyectoulloa.model.AcademyChoucairData;
import co.com.choucair.certification.proyectoulloa.tasks.OpenUp;
import co.com.choucair.certification.proyectoulloa.tasks.Register;
import co.com.choucair.certification.proyectoulloa.questions.Answer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() throws Exception {
        OnStage.theActorCalled( "Brandon"). wasAbleTo(OpenUp.thePage());
    }


    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo((Register.the(academyChoucairData.get(0).getStrFirstName(),academyChoucairData.get(0).getStrLastName(),
                academyChoucairData.get(0).getStrEmail(),academyChoucairData.get(0).getStrMonth(),academyChoucairData.get(0).getStrDay(),
                academyChoucairData.get(0).getStrYear(),academyChoucairData.get(0).getStrLanguage(), academyChoucairData.get(0).getStrZipCode(),academyChoucairData.get(0).getStrCity(),
                academyChoucairData.get(0).getStrBrand(),academyChoucairData.get(0).getStrModel(), academyChoucairData.get(0).getStrOs(), academyChoucairData.get(0).getStrPass())));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrValidation())));

    }

}
