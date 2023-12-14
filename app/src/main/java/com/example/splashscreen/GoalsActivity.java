package com.example.splashscreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GoalsActivity extends AppCompatActivity {

    private EditText goalText;
    private TextView currentGoalText;
    private TextView completedGoalsCounterText;
    private String currentGoal = "";
    private int completedGoalsCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        goalText = findViewById(R.id.goal_text);
        currentGoalText = findViewById(R.id.current_goal_text);
        completedGoalsCounterText = findViewById(R.id.completed_goals_counter_text);


        ImageView yourLogo = findViewById(R.id.imageView5);


        yourLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GoalsActivity.this, MainPageActivity.class);
                startActivity(intent);
            }
        });

        SharedPreferences sharedPreferences = getSharedPreferences("goals", MODE_PRIVATE);
        currentGoal = sharedPreferences.getString("currentGoal", "");
        completedGoalsCounter = sharedPreferences.getInt("completedGoalsCounter", 0);

        updateText();
    }

    public void setGoal(View view) {
        currentGoal = goalText.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("goals", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("currentGoal", currentGoal);
        editor.putInt("completedGoalsCounter", completedGoalsCounter);
        editor.apply();

        updateText();
    }

    public void markAsCompleted(View view) {

        completedGoalsCounter++;


        currentGoal = "";


        SharedPreferences sharedPreferences = getSharedPreferences("goals", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("currentGoal", currentGoal);
        editor.putInt("completedGoalsCounter", completedGoalsCounter);
        editor.apply();

        updateText();
    }

    private void updateText() {
        currentGoalText.setText("Current Goal: " + currentGoal);
        completedGoalsCounterText.setText("Goals Completed: " + completedGoalsCounter);
    }
}
