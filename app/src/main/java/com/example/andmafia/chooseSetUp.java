package com.example.andmafia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import Model.BrainObj;
import Model.CardObj;
import Model.UserObj;

public class chooseSetUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_set_up);

       /* CardObj co = new CardObj("Doctor");
        UserObj uo = new UserObj("Moisha",co);

        BrainObj bo = new BrainObj();
        UserObj [] boArr = bo.createArrayOfUsers(uo,1);
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(boArr[0].UserName() + " ты: " +  boArr[0].Co().CardName());*/

    }
}


