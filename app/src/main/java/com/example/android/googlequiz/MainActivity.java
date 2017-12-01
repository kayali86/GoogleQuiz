package com.example.android.googlequiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Edit text view declaring
    EditText nameField;

    /**
     *  Radio buttons declaring
     */
    RadioButton question1Choice1, question1Choice2, question1Choice3, question1Choice4,
            question2Choice1, question2Choice2, question2Choice3, question2Choice4,
            question3Choice1, question3Choice2, question3Choice3, question3Choice4,
            question4Choice1, question4Choice2, question4Choice3, question4Choice4,
            question5Choice1, question5Choice2, question5Choice3, question5Choice4;

    /**
     *  Check boxes declaring
     */
    CheckBox question6Choice1, question6Choice2, question6Choice3, question6Choice4, question6Choice5, question6Choice6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *  Edit text view declaring by id
         */
        nameField = (EditText) findViewById(R.id.name_edit_text);


        /**
         *  Radio buttons declaring by id
         */

        // Question 1
        question1Choice1 = findViewById (R.id.radio_1Question1);
        question1Choice2 = findViewById (R.id.radio_2Question1);
        question1Choice3 = findViewById (R.id.radio_3Question1);
        question1Choice4 = findViewById (R.id.radio_4Question1);

        // Question 2
        question2Choice1 = findViewById(R.id.radio_1Question2);
        question2Choice2 = findViewById(R.id.radio_2Question2);
        question2Choice3 = findViewById(R.id.radio_3Question2);
        question2Choice4 = findViewById(R.id.radio_4Question2);

        // Question 3
        question3Choice1 = findViewById(R.id.radio_1Question3);
        question3Choice2 = findViewById(R.id.radio_2Question3);
        question3Choice3 = findViewById(R.id.radio_3Question3);
        question3Choice4 = findViewById(R.id.radio_4Question3);

        // Question 4
        question4Choice1 = findViewById(R.id.radio_1Question4);
        question4Choice2 = findViewById(R.id.radio_2Question4);
        question4Choice3 = findViewById(R.id.radio_3Question4);
        question4Choice4 = findViewById(R.id.radio_4Question4);

        // Question 5
        question5Choice1 = findViewById(R.id.radio_1Question5);
        question5Choice2 = findViewById(R.id.radio_2Question5);
        question5Choice3 = findViewById(R.id.radio_3Question5);
        question5Choice4 = findViewById(R.id.radio_4Question5);


        // Question 6
        question6Choice1 = findViewById(R.id.question6Choice1Check);
        question6Choice2 = findViewById(R.id.question6Choice2Check);
        question6Choice3 = findViewById(R.id.question6Choice3Check);
        question6Choice4 = findViewById(R.id.question6Choice4Check);
        question6Choice5 = findViewById(R.id.question6Choice5Check);
        question6Choice6 = findViewById(R.id.question6Choice6Check);

    }



    /**
     * On click Result button
     */

    public void calculateResult (View view) {

        int right = 0;
        int wrong = 0;

        // Getting the name from name field
        String userName = nameField.getText().toString();


        /**
         * Question 1 validation
         */

        boolean isQ1Choice3Checked = question1Choice3.isChecked();

        if (isQ1Choice3Checked) {
            right += 1 ;
        } else {
            wrong += 1 ;
        }

        /**
         * Question 2 validation
         */

        boolean isQ2Choice2Checked = question2Choice2.isChecked();

        if (isQ2Choice2Checked) {
            right += 1 ;
        } else {
            wrong += 1 ;
        }


        /**
         * Question 3 validation
         */

        boolean isQ3Choice3Checked = question3Choice3.isChecked();

        if (isQ3Choice3Checked) {
            right += 1 ;
        } else {
            wrong += 1 ;
        }


        /**
         * Question 4 validation
         */

        boolean isQ4Choice1Checked = question4Choice1.isChecked();

        if (isQ4Choice1Checked) {
            right += 1 ;
        } else {
            wrong += 1 ;
        }


        /**
         * Question 5 validation
         */

        boolean isQ5Choice4Checked = question5Choice4.isChecked();

        if (isQ5Choice4Checked) {
            right += 1 ;
        } else {
            wrong += 1 ;
        }


        /**
         * Question 6 validation
         */
        boolean isQ6Choice1Checked = question6Choice1.isChecked();
        boolean isQ6Choice2Checked = question6Choice2.isChecked();
        boolean isQ6Choice3Checked = question6Choice3.isChecked();
        boolean isQ6Choice4Checked = question6Choice4.isChecked();
        boolean isQ6Choice5Checked = question6Choice5.isChecked();
        boolean isQ6Choice6Checked = question6Choice6.isChecked();

        if (isQ6Choice1Checked && isQ6Choice3Checked && isQ6Choice4Checked && isQ6Choice5Checked &&  isQ6Choice2Checked == false && isQ6Choice6Checked == false){
           right += 1;
        } else  {
            wrong += 1;
        }


        /**
         * Score Message
         * */

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.toast_layout_root));
        TextView text = (TextView) layout.findViewById(R.id.text);

        // I used getString for Translation
        text.setText(getString(R.string.toast, userName, right, wrong));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }



    /**
     *  Reset checked Radio buttons
     */

    public void reset (View view){

        // Question 1
        question1Choice1.setChecked(false);
        question1Choice2.setChecked(false);
        question1Choice3.setChecked(false);
        question1Choice4.setChecked(false);

        // Question 2
        question2Choice1.setChecked(false);
        question2Choice2.setChecked(false);
        question2Choice3.setChecked(false);
        question2Choice4.setChecked(false);

        // Question 3
        question3Choice1.setChecked(false);
        question3Choice2.setChecked(false);
        question3Choice3.setChecked(false);
        question3Choice4.setChecked(false);

        // Question 4
        question4Choice1.setChecked(false);
        question4Choice2.setChecked(false);
        question4Choice3.setChecked(false);
        question4Choice4.setChecked(false);

        // Question 5
        question5Choice1.setChecked(false);
        question5Choice2.setChecked(false);
        question5Choice3.setChecked(false);
        question5Choice4.setChecked(false);

        // Question 6
        question6Choice1.setChecked(false);
        question6Choice2.setChecked(false);
        question6Choice3.setChecked(false);
        question6Choice4.setChecked(false);
        question6Choice5.setChecked(false);
        question6Choice6.setChecked(false);

    }

}
