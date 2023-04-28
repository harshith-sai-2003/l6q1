/*
Create a home page of “XYZ Institute” where in the menu based on Option Menu is used with the following Requirements
a)Create a simple option menus where in once you click the “menu options”, the option items should get displayed which are “Courses”,”Admission”,”Faculty”.
  On click of each item corresponding content should get displayed .Eg. Courses should display all the course details offered by the institute.
  Admission should display all the details regarding admission procedure.Faculty should display the details photo of each faculty.
b)This option menu uses images/icons instead of textual content. This textual content should represent “Contact US”, “About Us”,” Homepage”.
  Once the user clicks on the corresponding icons it should display corresponding content.
*/

package com.example.l6q1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent about = new Intent(MainActivity.this, com.example.l6q1.about.class);
        Intent contact = new Intent(MainActivity.this, com.example.l6q1.contact.class);
        Intent admission = new Intent(MainActivity.this, com.example.l6q1.admission.class);
        Intent courses = new Intent(MainActivity.this, com.example.l6q1.courses.class);
        Intent faculty = new Intent(MainActivity.this, com.example.l6q1.faculty.class);
        switch(item.getItemId()){
            case R.id.contact:
                startActivity(contact);
                return true;
            case R.id.about:
                startActivity(about);
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

