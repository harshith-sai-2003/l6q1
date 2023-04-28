package com.example.l6q1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class faculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent about = new Intent(faculty.this, com.example.l6q1.about.class);
        Intent contact = new Intent(faculty.this, com.example.l6q1.contact.class);
        Intent home = new Intent(faculty.this, MainActivity.class);
        Intent courses = new Intent(faculty.this, com.example.l6q1.courses.class);
        Intent admission = new Intent(faculty.this, com.example.l6q1.admission.class);
        switch(item.getItemId()){
            case R.id.contact:
                startActivity(contact);
                return true;
            case R.id.about:
                startActivity(about);
                return true;
            case R.id.home:
                startActivity(home);
                return true;
            case R.id.courses:
                startActivity(courses);
                return true;
            case R.id.admission:
                startActivity(admission);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}