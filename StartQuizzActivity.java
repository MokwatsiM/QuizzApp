package codetribe.com.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StartQuizzActivity extends AppCompatActivity {

    private ArrayList<Quizz> quizzList = MainActivity.quizzList;

    private Button btnSubmit;
    private TextView txtQuestion1;
    private TextView txtQuestion2;
    private TextView txtQuestion3;
    private TextView txtQuestion4;
    private TextView txtQuestion5;
    private Spinner spnAnswers1;
    private Spinner spnAnswers2;
    private Spinner spnAnswers3;
    private Spinner spnAnswers4;
    private Spinner spnAnswers5;

  //  String[] optionList;
    private ArrayList<String> answerList = new ArrayList<>();

 //   private Quizz objQuizz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quizz);

        btnSubmit = (Button) findViewById(R.id.btnSubmitAnswer);

        txtQuestion1 = (TextView) findViewById(R.id.text_view_Question1);
        txtQuestion2 = (TextView) findViewById(R.id.text_view_Question2);
        txtQuestion3 = (TextView) findViewById(R.id.text_view_Question3);
        txtQuestion4 = (TextView) findViewById(R.id.text_view_Question4);
        txtQuestion5 = (TextView) findViewById(R.id.text_view_Question5);

        spnAnswers1 = (Spinner) findViewById(R.id.spnQuestion1);
        spnAnswers2 = (Spinner) findViewById(R.id.spnQuestion2);
        spnAnswers3 = (Spinner) findViewById(R.id.spnQuestion3);
        spnAnswers4 = (Spinner) findViewById(R.id.spnQuestion4);
        spnAnswers5 = (Spinner) findViewById(R.id.spnQuestion5);

        setQuestionAndAnswer();
        btnSubmit.setOnClickListener(new SubmitQuestion());


    }

    public void setQuestionAndAnswer() {

        ArrayList<String> optionsList = new ArrayList<>();
        Quizz temp = quizzList.get(0);
        System.out.println(temp.getQuestion());
        System.out.println(temp.getOption1());
        txtQuestion1.setText(temp.getQuestion());

        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());
//
        ArrayAdapter<String> optionsAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers1.setAdapter(optionsAdapter1);

//
        optionsList = new ArrayList<>();
        temp = quizzList.get(1);
        txtQuestion2.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers2.setAdapter(optionsAdapter2);


        optionsList = new ArrayList<>();
        temp = quizzList.get(2);
        txtQuestion3.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers3.setAdapter(optionsAdapter3);


        optionsList = new ArrayList<>();
        temp = quizzList.get(3);
        txtQuestion4.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers4.setAdapter(optionsAdapter4);


        optionsList = new ArrayList<>();
        temp = quizzList.get(4);
        txtQuestion5.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers5.setAdapter(optionsAdapter5);


    }

    private class SubmitQuestion implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String userAnswer = "A";
            String correctAnswer;


            //question1
            Quizz temp = quizzList.get(0);
            correctAnswer = temp.getAnswer();
            System.out.println(temp.getAnswer());
            int score = 0;

                if(spnAnswers1.getSelectedItemPosition()==0)
                {
                   userAnswer = "A";
                    if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                        score += 1;
                    } else {
                        score += 0;

                    }
                }else if(spnAnswers1.getSelectedItemPosition()==1)
                {
                    userAnswer = "B";
                    if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                        score += 1;
                    } else {
                        score += 0;

                    }

                }else if(spnAnswers1.getSelectedItemPosition()==2)
                {
                    userAnswer = "C";
                    if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                        score += 1;
                    } else {
                        score += 0;

                    }

                }else if(spnAnswers1.getSelectedItemPosition()==3)
                {
                    userAnswer = "D";
                    if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                        score += 1;
                    } else {
                        score += 0;

                    }

                }




            //question2
            temp = quizzList.get(1);
            correctAnswer = temp.getAnswer();

            if(spnAnswers2.getSelectedItemPosition()==0)
            {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }
            }else if(spnAnswers2.getSelectedItemPosition()==1)
            {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers2.getSelectedItemPosition()==2)
            {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers2.getSelectedItemPosition()==3)
            {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }



            //question3

            temp = quizzList.get(2);
            correctAnswer = temp.getAnswer();

            if(spnAnswers3.getSelectedItemPosition()==0)
            {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }
            }else if(spnAnswers3.getSelectedItemPosition()==1)
            {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers3.getSelectedItemPosition()==2)
            {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers3.getSelectedItemPosition()==3)
            {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }


            //question4

            temp = quizzList.get(3);
            correctAnswer = temp.getAnswer();

            if(spnAnswers4.getSelectedItemPosition()==0)
            {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }
            }else if(spnAnswers4.getSelectedItemPosition()==1)
            {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers4.getSelectedItemPosition()==2)
            {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers4.getSelectedItemPosition()==3)
            {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }



            //question5

            temp = quizzList.get(4);
            correctAnswer = temp.getAnswer();

            if(spnAnswers5.getSelectedItemPosition()==0)
            {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }
            }else if(spnAnswers5.getSelectedItemPosition()==1)
            {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers5.getSelectedItemPosition()==2)
            {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }else if(spnAnswers5.getSelectedItemPosition()==3)
            {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                } else {
                    score += 0;

                }

            }



            Toast.makeText(StartQuizzActivity.this,"Your score is="+score,Toast.LENGTH_LONG).show();



        }
    }

}
