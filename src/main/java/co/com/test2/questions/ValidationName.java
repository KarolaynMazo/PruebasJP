package co.com.test2.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidationName implements Question {

    private final String name;

    public ValidationName(String name) {
        this.name = name;
    }

    @Override
    public Object answeredBy(Actor actor) {
        String response = SerenityRest.lastResponse().getBody().jsonPath().getString("data.name");
        if(response.equals(name)){
            return true;
        }
        return false;
    }

    public static ValidationName with(String name){
        return new ValidationName(name);
    }
}
