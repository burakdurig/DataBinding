package com.mastercoding.databindingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import com.mastercoding.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // 1- please review the build.grade.kts (app) as the only means of enabling
    // databinding is to create a BuildFeatures { databinding = true }

    // 2- then within the main activity xml add the <layout> </layout> to the root.

    // 3- within the xml and right below the layout make sure to add a <data> </data> with a
    // <variable />

    // 4- create a handler class Person.java which includes:
    // the constructor, and getter and setters
    // within the xml class add the handler class persons:
    // "com.mastercoding.DataBinding.Person"

    // 5- back to the XML, you want to display the persons name
    // go to teh textview and replace text as bel;ow:
    // @{person.name}

    // 6- create an instance of the databinding activityy via Person p1 and setPerson(p1)

    //creating a clickable button in databinding

    // 7- create a button within the XML and add the feature "android:onCLick="@{}""
    // then create a new variable within the <data> of which the type then requires a new class handler

    // 8- within the xml type add the below. @{clickHandler::onButton1Clicked}
    // the "::" is used to reference a sub method within a class

    // 2-way data binding

    // 9- create a textview and edittext within teh xml in which typing within teh edit
    // text view will change teh textview automatically.

    // 10-


    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p1 = new Person("jack","jack@gmail.com");

        activityMainBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);

        activityMainBinding.setPerson(p1);

        // Binding the Handler for click Events
        myClickHandler = new MyClickHandler(this);
        activityMainBinding.setClickHandler(myClickHandler);


        // two-way Binding


    }

}