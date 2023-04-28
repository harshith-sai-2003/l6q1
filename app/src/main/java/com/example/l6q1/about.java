package com.example.l6q1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent home = new Intent(about.this, MainActivity.class);
        Intent contact = new Intent(about.this, com.example.l6q1.contact.class);
        Intent admission = new Intent(about.this, com.example.l6q1.admission.class);
        Intent courses = new Intent(about.this, com.example.l6q1.courses.class);
        Intent faculty = new Intent(about.this, com.example.l6q1.faculty.class);
        switch(item.getItemId()){
            case R.id.contact:
                startActivity(contact);
                return true;
            case R.id.home:
                startActivity(home);
                return true;
            case R.id.admission:
                startActivity(admission);
                return true;
            case R.id.courses:
                startActivity(courses);
                return true;
            case R.id.faculty:
                startActivity(faculty);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}