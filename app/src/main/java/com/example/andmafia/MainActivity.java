package com.example.andmafia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //вход id: btnEnter
    private Button nextScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextScreen = (Button)findViewById(R.id.btnEnter);

        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCharacterSelectChoice();
            }
        });
    }

    public void openCharacterSelectChoice(){
        Intent intent = new Intent(this, chooseSetUp.class );
        startActivity(intent);
    }
}
