package com.example.bmc208mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.bmc208mobileassignment.model.Applicant;
import com.example.bmc208mobileassignment.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Applicant applicant = new Applicant("ricky", "123", "ricky tan", "ricky@gmail.com", 2500);
        TextView textView = findViewById(R.id.textView);
        textView.setText(applicant.toString());
    }
}
