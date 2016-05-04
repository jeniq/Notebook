package com.company.model;

import java.util.Date;

/**
 * Created by Женя on 04.05.2016.
 */
public class Notebook {
    private String surname;
    private String name;
    private String middleName;
    private String nickname;
    private String comment;
    private String group;
    private String mobileNumber;
    private String homeNumber;
    private String email;
    private String skype;
    private String address; // index, city, street, house number, apartment number
    private String index;
    private String city;
    private String street;
    private String houseNumber; // address
    private String apartmentNumber;
    private Date created; // date
    private Date lastModified; // last modified date

    /**
     * This method unites name parts into surname and initials
     * @return surname with name's initials
     */
    public String getFullName(){
        StringBuilder fullName = new StringBuilder();
        fullName.append(surname).append(" ").append(name.charAt(0)).append(". ")
                .append(middleName.charAt(0)).append(".");
        return fullName.toString();
    }

    /**
     * This method units full address information
     * @return person's address
     */
    public String getAddress() {
        StringBuilder address = new StringBuilder();
        address.append(index).append("\n").append(city).append(", ").append(street).append(", ")
                .append(houseNumber).append(", ").append(apartmentNumber);
        return address.toString();
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
