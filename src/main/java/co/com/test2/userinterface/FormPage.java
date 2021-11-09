package co.com.test2.userinterface;

import co.com.test2.utils.Utilitarios;
import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target NAME = Target.the("Enter the name")
            .locatedBy("//input[@id='firstName']");

    public static final Target LAST_NAME = Target.the("Enter the lastName")
            .locatedBy("//input[@id='lastName']");

    public static final Target EMAIL = Target.the("Enter the userEmail")
            .locatedBy("//input[@id='userEmail']");

    public static final String GENDER = "//label[contains(text(),'%s')]";

    public static Target Gender(String gender) {
        return Target.the("Enter the gender user")
                .locatedBy(Utilitarios.replace(GENDER, gender));
    }

    public static final Target MOBILE = Target.the("Enter the userMobile")
            .locatedBy("//input[@id='userNumber']");

    public static final Target DATE_BIRTH = Target.the("Enter the userDateBirth")
            .locatedBy("//input[@id='dateOfBirthInput']");

    public static final Target SUBJECTS = Target.the("Enter the userSubject")
            .locatedBy("//*[@id='subjectsContainer']/div/div[1]");

    public static final String HOBBIES = "//label[contains(text(),'%s')]";
    public static Target Hobbies(String hobbies) {
        return Target.the("Enter the hobbies user")
                .locatedBy(Utilitarios.replace(HOBBIES, hobbies));
    }

    public static final Target PICTURES = Target.the("Enter the userPictures")
            .locatedBy("//input[@id='uploadPicture']");

    public static final Target ADDRESS = Target.the("Enter the userAddress")
            .locatedBy("//textarea[@id='currentAddress']");


    public static final Target STATE = Target.the("Enter the userState")
            .locatedBy("//*[@id='state']/div/div[1]/div[1]");

    public static final Target CITY = Target.the("Enter the userCity")
            .locatedBy("//*[@id='stateCity-wrapper']/div[3]");

    public static final Target SUBMIT = Target.the("Button de submit")
            .locatedBy("//button[@id='submit']");



}
