package com.kitestart.thenetwork.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kitestart.thenetwork.Controller.ListActivity;
import com.kitestart.thenetwork.R;

public class MainActivity extends AppCompatActivity {

    EditText login, pass;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login = findViewById(R.id.loginField);
        pass = findViewById(R.id.passField);

        submitBtn = findViewById(R.id.submitBtn);



        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ListActivity.class);

                intent.putExtra("login", login.getText());
                intent.putExtra("pass", pass.getText());

                startActivity(intent);

            }
        });



    }
}
