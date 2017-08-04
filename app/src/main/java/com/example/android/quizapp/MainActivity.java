package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int questionsRight;
    CheckBox question2a;
    CheckBox question2b;
    CheckBox question2c;
    CheckBox question2d;
    CheckBox question3a;
    CheckBox question3b;
    CheckBox question3c;
    CheckBox question3d;
    CheckBox question6a;
    CheckBox question6b;
    CheckBox question6c;
    CheckBox question6d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean question1(View view) {
        // Is the RadioButton now checked?
        RadioButton question1 = (RadioButton) findViewById(R.id.question1c);
        boolean question1Answer = question1.isChecked();

        // Check which radio button was clicked
        {
            if (question1Answer) {
                return true;
            }else
            return false;
        }
    }

    public boolean question2(View view) {
        // Is the Radiobutton now checked?
        question2a = (CheckBox)findViewById(R.id.question2a);//correct answer
        question2b = (CheckBox)findViewById(R.id.question2b);
        question2c = (CheckBox)findViewById(R.id.question2c);
        question2d = (CheckBox)findViewById(R.id.question2d);//correct answer
        boolean question2aAnswer = question2a.isChecked();//correct answer
        boolean question2bAnswer = question2b.isChecked();
        boolean question2cAnswer = question2c.isChecked();
        boolean question2dAnswer = question2d.isChecked();//correct answer

        // Check which radio button was clicked
        {
            if (question2aAnswer && question2dAnswer && !question2bAnswer && !question2cAnswer) {
                return true;
            }else
                return false;
        }
    }

    public boolean question3(View view) {
        // Is the Checkbox now checked?
        question3a = (CheckBox)findViewById(R.id.question3a);//correct answer
        question3b = (CheckBox)findViewById(R.id.question3b);//correct answer
        question3c = (CheckBox)findViewById(R.id.question3c);
        question3d = (CheckBox)findViewById(R.id.question3d);
        boolean question3aAnswer = question3a.isChecked(); //correct answer
        boolean question3bAnswer = question3b.isChecked(); //correct answer
        boolean question3cAnswer = question3c.isChecked();
        boolean question3dAnswer = question3d.isChecked();

        // Check which checkboxes were clicked
        {
            if (question3aAnswer && question3bAnswer && !question3cAnswer && !question3dAnswer) {
                return true;
            }else
                return false;
        }
    }

    public boolean question4(View view) {
        // Is the Radiobutton now checked?
        EditText question4 = (EditText) findViewById(R.id.question4);
        String question4answer = question4.getText().toString();

        // Check which radio button was clicked
        {
            if (question4answer.equalsIgnoreCase("headingley")) {
                return true;
            }else
                return false;
        }
    }

    public boolean question5(View view) {
        // Is the RadioButton now checked?
        RadioButton question5 = (RadioButton) findViewById(R.id.question5c);
        boolean question5Answer = question5.isChecked();

        // Check which radio button was clicked
        {
            if (question5Answer) {
                return true;
            }else
                return false;
        }
    }

    public boolean question6(View view) {
        // Is the Radiobutton now checked?
        question6a = (CheckBox)findViewById(R.id.question6a);//correct Answer
        question6b = (CheckBox)findViewById(R.id.question6b);//correct Answer
        question6c = (CheckBox)findViewById(R.id.question6c);
        question6d = (CheckBox)findViewById(R.id.question6d);
        boolean question6aAnswer = question6a.isChecked();//correct Answer
        boolean question6bAnswer = question6b.isChecked();//correct Answer
        boolean question6cAnswer = question6c.isChecked();
        boolean question6dAnswer = question6d.isChecked();

        // Check which radio button was clicked
        {
            if (question6aAnswer && question6bAnswer && !question6cAnswer && !question6dAnswer) {
                return true;
            }else
                return false;
        }
    }

    public boolean question7(View view) {
        // Is the Radiobutton now checked?
        EditText question7 = (EditText) findViewById(R.id.question7);
        String question4answer = question7.getText().toString();


        {
            if (question4answer.equalsIgnoreCase("Lords") || (question4answer.equalsIgnoreCase("Lord's"))) {
                return true;
            }else
                return false;
        }
    }

    public boolean question8(View view) {
        // Is the RadioButton now checked?
        RadioButton question8 = (RadioButton) findViewById(R.id.question8b);
        boolean question8Answer = question8.isChecked();

        // Check which radio button was clicked
        {
            if (question8Answer) {
                return true;
            }else
                return false;
        }
    }

    public void submitButton (View view){

       boolean question1Answer = question1(view);
        boolean question2Answer = question2(view);
        boolean question3Answer = question3(view);
        boolean question4Answer = question4(view);
        boolean question5Answer = question5(view);
        boolean question6Answer = question6(view);
        boolean question7Answer = question7(view);
        boolean question8Answer = question8(view);

            if(question1Answer) {
                questionsRight += 1;
            }
        if(question2Answer) {
            questionsRight += 1;
        }
        if(question3Answer) {
            questionsRight += 1;
        }
        if (question4Answer){
            questionsRight += 1;
        }
        if (question5Answer){
            questionsRight += 1;
        }
        if (question6Answer){
            questionsRight += 1;
        }
        if (question7Answer){
            questionsRight += 1;
        }

        if(question8Answer){
            questionsRight += 1;
        }

        Toast.makeText(this, "You got " + questionsRight + " right", Toast.LENGTH_SHORT).show();

        questionsRight = 0;
    }

    public void resetButton (View view){
        RadioGroup question1 = (RadioGroup)findViewById(R.id.question1);
        EditText question4 = (EditText)findViewById(R.id.question4);
        RadioGroup question5 = (RadioGroup)findViewById(R.id.question5);
        EditText question7 = (EditText)findViewById(R.id.question7);
        RadioGroup question8 = (RadioGroup)findViewById(R.id.question8);
        question2a = (CheckBox)findViewById(R.id.question2a);
        question2b = (CheckBox)findViewById(R.id.question2b);
        question2c = (CheckBox)findViewById(R.id.question2c);
        question2d = (CheckBox)findViewById(R.id.question2d);
        question3a = (CheckBox)findViewById(R.id.question3a);
        question3b = (CheckBox)findViewById(R.id.question3b);
        question3c = (CheckBox)findViewById(R.id.question3c);
        question3d = (CheckBox)findViewById(R.id.question3d);
        question6a = (CheckBox)findViewById(R.id.question6a);
        question6b = (CheckBox)findViewById(R.id.question6b);
        question6c = (CheckBox)findViewById(R.id.question6c);
        question6d = (CheckBox)findViewById(R.id.question6d);

        question1.clearCheck();
        question2a.setChecked(false);
        question2b.setChecked(false);
        question2c.setChecked(false);
        question2d.setChecked(false);
        question3a.setChecked(false);
        question3b.setChecked(false);
        question3c.setChecked(false);
        question3d.setChecked(false);
        question4.setText("Ground");
        question5.clearCheck();
        question6a.setChecked(false);
        question6b.setChecked(false);
        question6c.setChecked(false);
        question6d.setChecked(false);
        question7.setText("Ground");
        question8.clearCheck();




    }
}
