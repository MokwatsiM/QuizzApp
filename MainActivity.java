package codetribe.com.quizzapp;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    public static ArrayList<Quizz> quizzList= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initialise();


    }


    public void initialise() {

        String data[];
        String question, option1, option2, option3, option4, answer;

        Quizz objQuiz;


        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(getAssets().open("question.txt")));
            String mline;
            while ((mline = reader.readLine()) != null) {
                data = mline.split(",");




                question = data[0];
                option1 = data[1];
                option2 = data[2];
                option3 = data[3];
                option4 = data[4];
                answer = data[5];

                objQuiz = new Quizz(question,option1,option2,option3,option4,answer);

                quizzList.add(objQuiz);
          System.out.println(quizzList.get(0).getQuestion());
                System.out.println(quizzList.size());

            }

        } catch (IOException ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT);

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT);
                }
            }
        }


    }

    public void startQuizz(View view) {


        Intent intent = new Intent(MainActivity.this, StartQuizzActivity.class);

        startActivity(intent);

    }
}
