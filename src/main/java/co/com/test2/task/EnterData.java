package co.com.test2.task;

import co.com.test2.models.Form;
import co.com.test2.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.test2.utils.ConstantString.*;
import static co.com.test2.userinterface.FormPage.*;
import static co.com.test2.utils.ConstantsNum.NINE_NUM;
import static co.com.test2.utils.ConstantsNum.TEN_NUM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class EnterData implements Task {

    private Form form;

    public EnterData(Map<String, String> data) {
      form = Form.builder()
                .name(data.get(_NAME))
                .lastName(data.get(_LAST_NAME))
                .email(data.get(_EMAIL))
                .gender(data.get(_GENDER))
                .mobile(data.get(_MOBILE))
                .dateBirth(data.get(_DATE_BIRTH))
                .subjects(data.get(_SUBJECTS))
                .hobbies(data.get(_HOBBIES))
                .picture(data.get(_PICTURES))
                .address(data.get(_ADDRESS))
                .state(data.get(_STATE))
                .city(data.get(_CITY))
                .build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              WaitUntil.the(FormPage.NAME , isVisible()).forNoMoreThan(NINE_NUM).seconds(),
              Enter.theValue(form.getName()).into(NAME),
              Enter.theValue(form.getLastName()).into(LAST_NAME),
              WaitUntil.the(EMAIL , isVisible()).forNoMoreThan(TEN_NUM).seconds(),
              Enter.theValue(form.getEmail()).into(EMAIL),
              Click.on(Gender(form.getGender())),
              Enter.theValue(form.getMobile()).into(MOBILE),
              WaitUntil.the(DATE_BIRTH , isVisible()).forNoMoreThan(TEN_NUM).seconds(),
              Enter.theValue(form.getDateBirth()).into(DATE_BIRTH)


      );
    }
    public static EnterData with(Map<String,String> data){
        return Tasks.instrumented(EnterData.class, data);
    }
}
