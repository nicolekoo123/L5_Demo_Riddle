package sg.edu.rp.c346.id19047433.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswer = findViewById(R.id.textView);
        tvAnswer.setText("In second activity");
        Intent getintent = getIntent();
        String questionSelected = getintent.getStringExtra("Question");
        tvAnswer.setText(questionSelected + " Answer is : Gone");
    }
}
