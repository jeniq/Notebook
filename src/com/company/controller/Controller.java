package com.company.controller;

import com.company.Group;
import com.company.model.Notebook;
import com.company.view.View;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Женя on 04.05.2016.
 */
public class Controller {
    Notebook notebook;
    View view;
    boolean exit;
    int nicknameMinLength = 3;

    // Constructor
    public Controller(Notebook notebook, View view){
        this.notebook = notebook;
        this.view = view;
    }

    // The work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        while (!exit){
            view.printMessage(View.MENU_POSITIONS);
            switch (sc.nextInt()) {
                case 1:
                    view.printMessage(View.ASK_SURNAME);
                    notebook.setSurname(checkInputFullName(sc));
                    view.printMessage(View.ASK_NAME);
                    notebook.setName(checkInputFullName(sc));
                    view.printMessage(View.ASK_MIDDLE_NAME);
                    notebook.setMiddleName(checkInputFullName(sc));
                    view.printMessage(View.ASK_NICKNAME);
                    notebook.setNickname(checkInputNickname(sc));
                    view.printMessage(View.ASK_COMMENT);
                    notebook.setComment(sc.next());
                    view.printMessage(View.ASK_GROUP);
                    notebook.setGroup(checkInputGroup(sc));
                    view.printMessage(View.ASK_HOME_NUMBER);
                    notebook.setHomeNumber(checkInputHomeNumber(sc));
                    view.printMessage(View.ASK_MOBILE_NUMBER);
                    notebook.setMobileNumber(checkInputMobileNumber(sc));
                    view.printMessage(View.ASK_EMAIL);
                    notebook.setEmail(checkInputEmail(sc));
                    view.printMessage(View.ASK_SKYPE);
                    notebook.setSkype(checkInputSkype(sc));
                    view.printMessage(View.ASK_ADDRESS);
                    view.printMessage(View.ASK_INDEX);
                    notebook.setIndex(checkInputIndex(sc));
                    view.printMessage(View.ASK_CITY);
                    notebook.setCity(checkInputCity(sc));
                    view.printMessage(View.ASK_STREET);
                    notebook.setStreet(checkInputStreet(sc));
                    view.printMessage(View.ASK_HOUSE_NUMBER);
                    notebook.setHouseNumber(checkInputHouseNumber(sc));
                    view.printMessage(View.ASK_APARTMENTS);
                    notebook.setApartmentNumber(checkInputApartments(sc));
                    notebook.setCreated(new Date());
                    notebook.setLastModified(notebook.getCreated());
                    break;
                case 2:
                    view.printMessage(notebook.getFullName());
                    view.printMessage(View.NICKNAME + notebook.getNickname());
                    view.printMessage(notebook.getComment());
                    view.printMessage(View.GROUP + notebook.getGroup());
                    view.printMessage(View.HOME_NUMBER + notebook.getHomeNumber());
                    view.printMessage(View.MOBILE_NUMBER + notebook.getMobileNumber());
                    view.printMessage(View.EMAIL + notebook.getEmail());
                    view.printMessage(View.SKYPE + notebook.getSkype());
                    view.printMessage(View.ADDRESS + notebook.getAddress() );
                    view.printMessage(View.REC_CREATED + notebook.getCreated().toString());
                    view.printMessage(View.REC_LAST_MODIFIED + notebook.getLastModified().toString());
                    break;
                case 3:
                    outer:
                    while (true){
                        view.printMessage(View.EDIT_MENU);
                        switch (sc.nextInt()) {
                            case 1:
                                view.printMessage(View.ASK_SURNAME);
                                notebook.setSurname(checkInputFullName(sc));
                                notebook.setLastModified(new Date());
                                break;
                            case 2:
                                view.printMessage(View.ASK_NAME);
                                notebook.setName(checkInputFullName(sc));
                                notebook.setLastModified(new Date());
                                break;
                            case 3:
                                view.printMessage(View.ASK_MIDDLE_NAME);
                                notebook.setMiddleName(checkInputFullName(sc));
                                break;
                            case 0:
                                break outer;
                            default:
                                view.printMessage(View.WRONG_DATA);
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    view.printMessage(View.WRONG_DATA);
            }
        }
    }


    /**
     * This method check input name's data that it correct
     * @param sc letters entered by user
     * @return surname and name's initials
     */
    private String checkInputFullName(Scanner sc){
        while (!sc.hasNext(View.NAME_SAMPLE)){
            view.printMessage(View.WRONG_DATA);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input nickname
     * @param sc nickname
     * @return correct nickname
     */
    private String checkInputNickname(Scanner sc){
        String nickname;
        while (true) {
            while (!sc.hasNext(View.NICKNAME_SAMPLE)) {
                view.printMessage(View.WRONG_DATA);
                sc.next();
            }
            if ((nickname = sc.next()).length() < nicknameMinLength) {
                view.printMessage(View.WRONG_NICKNAME_LEN);
                continue;
            }
            break;
        }
        return nickname;
    }

    private String checkInputGroup(Scanner sc){
        String group;
        int i = 1;
        int choice;

        // show groups
        for (Group groupName : Group.values()) {
            view.printMessage(i + "." + groupName.toString());
            i++;
        }

        while (true) {
            while (!sc.hasNextInt()) {
                //view.printMessage(View.WRONG_DATA);
                sc.next();
            }
            switch (sc.nextInt()) {
                case 1:
                    return Group.FAVORITES.toString();
                case 2:
                    return Group.FAMILY.toString();
                case 3:
                    return Group.FRIENDS.toString();
                case 4:
                    return Group.OTHER.toString();
                default:
                    view.printMessage(View.WRONG_GROUP);
            }
        }
    }

    /**
     * This method check input home number
     * @param sc home number
     * @return correct home number
     */
    private String checkInputHomeNumber(Scanner sc){
        while (!sc.hasNext(View.HOME_NUMBER_SAMPLE)){
            view.printMessage(View.WRONG_NUMBER);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input mobile number
     * @param sc mobile number
     * @return correct mobile number
     */
    private String checkInputMobileNumber(Scanner sc){
        while (!sc.hasNext(View.MOBILE_NUMBER_SAMPLE)){
            view.printMessage(View.WRONG_NUMBER);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input email address
     * @param sc email
     * @return correct email address
     */
    private String checkInputEmail(Scanner sc){
        while (!sc.hasNext(View.EMAIL_SAMPLE)){
            view.printMessage(View.WRONG_EMAIL);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input Skype info
     * @param sc skype login
     * @return correct skype data
     */
    private String checkInputSkype(Scanner sc){
        while (!sc.hasNext(View.SKYPE_SAMPLE)){
            view.printMessage(View.WRONG_SKYPE);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input address's index
     * @param sc index
     * @return index number
     */
    private String checkInputIndex(Scanner sc){
        while (!sc.hasNext(View.INDEX_SAMPLE)){
            view.printMessage(View.WRONG_INDEX);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input city name
     * @param sc city
     * @return correct city name
     */
    private String checkInputCity(Scanner sc){
        while (!sc.hasNext(View.CITY_SAMPLE)){
            view.printMessage(View.WRONG_CITY);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input street
     * @param sc street name
     * @return correct street name
     */
    private String checkInputStreet(Scanner sc) {
        while (!sc.hasNext(View.STREET_SAMPLE)){
            view.printMessage(View.WRONG_STREET);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input building's number
     * @param sc building's number
     * @return correct building's number
     */
    private String checkInputHouseNumber(Scanner sc) {
        while (!sc.hasNext(View.HOUSE_SAMPLE)){
            view.printMessage(View.WRONG_HOUSE);
            sc.next();
        }
        return sc.next();
    }

    /**
     * This method check input apartments number
     * @param sc apartments number
     * @return correct apartments number
     */
    private String checkInputApartments(Scanner sc) {
        while (!sc.hasNext(View.APARTMENTS_SAMPLE)){
            view.printMessage(View.WRONG_APARTMENTS);
            sc.next();
        }
        return sc.next();
    }
}
