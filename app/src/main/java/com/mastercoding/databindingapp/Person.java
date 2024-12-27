package com.mastercoding.databindingapp;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {

    //extending teh baseObseverable provides notification properties for when properties change.
    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }


    // The below @Bindable is required for the code to know that Name is bindable
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
        //this notification is critical for 2-way databinding
        // BR = Binding Resources which contains constant integer values
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {

    }
}
