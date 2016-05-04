package com.company.view;

/**
 * Created by Женя on 04.05.2016.
 */
public class View {
    // The Constants
    public static final String MENU_POSITIONS = "Choice one of the next variants:\n" +
            "1.Create record\n2.View record\n3.Edit record\n4.Exit";
    public static final String EDIT_MENU = "What do you want to edit?\n" +
            "1.Surname\n2.Name\n3.Middle name\n0.Previous menu";

    public static final String ASK_SURNAME = "Enter subscriber's surname:";
    public static final String ASK_NAME = "Enter subscriber's name:";
    public static final String ASK_MIDDLE_NAME = "Enter subscriber's middle name:";
    public static final String WRONG_DATA = "Wrong input, try again:";
    public static final String NAME_SAMPLE = "[A-Za-z]+";

    public static final String NICKNAME = "Nickname: ";
    public static final String ASK_NICKNAME = "Enter nickname (should starts with letter " +
            "and should have at least 3 characters): ";
    public static final String NICKNAME_SAMPLE = "[a-zA-Z]+\\w*";
    public static final String WRONG_NICKNAME_LEN = "Nickname is too short, try longer nickname:";

    public static final String ASK_COMMENT = "You can leave a comment or press Enter button:";

    public static final String GROUP = "Group: ";
    public static final String ASK_GROUP = "Choice a group:";
    public static final String WRONG_GROUP = "Wrong group number, try again:";

    public static final String HOME_NUMBER = "Home number: ";
    public static final String ASK_HOME_NUMBER = "Enter home number " +
            "(example 38-AAA-XXX-XX-XX, where AAA - city code):";
    public static final String HOME_NUMBER_SAMPLE = "38-\\d{3}-\\d{3}-\\d{2}-\\d{2}";
    public static final String MOBILE_NUMBER = "Mobile number: ";
    public static final String ASK_MOBILE_NUMBER = "Enter mobile number (example XXX-XXX-XX-XX):";
    public static final String MOBILE_NUMBER_SAMPLE = "\\d{3}-\\d{3}-\\d{2}-\\d{2}";
    public static final String WRONG_NUMBER = "Entered number is wrong, try again:";

    public static final String EMAIL = "E-mail: ";
    public static final String ASK_EMAIL = "Enter e-mail:";
    public static final String WRONG_EMAIL = "Wrong email, try again:";
    public static final String EMAIL_SAMPLE = "\\w+@(gmail.com|yandex.ru|i.ua|email.ua|mail.ru)";

    public static final String SKYPE = "Skype: ";
    public static final String ASK_SKYPE = "Enter Skype:";
    public static final String WRONG_SKYPE = "Wrong Skype info, try again:";
    public static final String SKYPE_SAMPLE = "([a-zA-Z]+\\w*\\.?\\,?-?\\w*){6,}";

    public static final String ADDRESS = "Address:\n";
    public static final String ASK_ADDRESS = "Address (index, city, street, home number, apartment number)";
    public static final String ASK_INDEX = "Enter index:";
    public static final String INDEX_SAMPLE = "\\d{4,7}";
    public static final String WRONG_INDEX = "Wrong index, try again:";
    public static final String ASK_CITY = "Enter city:";
    public static final String CITY_SAMPLE = "[A-Z][a-z]+";
    public static final String WRONG_CITY = "Wrong city, try again:";
    public static final String ASK_STREET = "Enter street:";
    public static final String STREET_SAMPLE = "[A-Z][a-z]+\\s?[a-zA-Z]*";
    public static final String WRONG_STREET = "Wrong street, try again:";
    public static final String ASK_HOUSE_NUMBER = "Enter building number:";
    public static final String HOUSE_SAMPLE = "(\\d{1,3}|\\d{1,3}/\\d{1,2})[a-z]?";
    public static final String WRONG_HOUSE = "Wrong building number, try again:";
    public static final String ASK_APARTMENTS = "Enter apartments number:";
    public static final String APARTMENTS_SAMPLE = "\\d+[a-z]?";
    public static final String WRONG_APARTMENTS = "Wrong apartments number, try again:";

    public static final String REC_CREATED = "Record was created: ";
    public static final String REC_LAST_MODIFIED = "Last modified: ";

    public void printMessage(String message){
        System.out.println(message);
    }

}
