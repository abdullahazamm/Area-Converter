package com.example.areaconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConverterSQFT();
        ConverterAcre();
        ConverterSQKM();
        ConverterSQM();
        Reset();
    }


    public void ConverterSQFT(){
        Button btn1=findViewById(R.id.button4);
        Button btn2=findViewById(R.id.button3);
        Button btn3=findViewById(R.id.button1);
        Button btn4=findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float SqFtToAcre=Float.parseFloat(editText.getText().toString());
                float SqFtToAc= SqFtToAcre/43560;

                editText1.setText(String.valueOf(SqFtToAc));


                float SqFtToSqKM=Float.parseFloat(editText.getText().toString());
                float SqFTToSqK= SqFtToSqKM/10760000;

                editText2.setText(String.valueOf(SqFTToSqK));


                float SqFtToSqMile=Float.parseFloat(editText.getText().toString());
                float SqFtToSqM=SqFtToSqMile/27880000;


                editText3.setText(String.valueOf(SqFtToSqM));
            }
        });


    }
    public void ConverterAcre() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float AcreToSqFt=Float.parseFloat(editText1.getText().toString());
                float AcToSqFt= AcreToSqFt*43560;
                editText.setText(String.valueOf(AcToSqFt));


                float AcreToSqKM=Float.parseFloat(editText1.getText().toString());
                float AcToSqKM= (float) (AcreToSqKM/247.1);
                editText2.setText(String.valueOf(AcToSqKM));


                float AcreToSQM=Float.parseFloat(editText1.getText().toString());
                float AcToSqM= AcreToSQM/640;
                editText3.setText(String.valueOf(AcToSqM));

            }
        });
    }


    public void ConverterSQKM() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float SQKMToSQFT=Float.parseFloat(editText2.getText().toString());
                float SqKToSQFt= SQKMToSQFT*10760000;
                editText.setText(String.valueOf(SqKToSQFt));


                float SQKMToAcre=Float.parseFloat(editText2.getText().toString());
                float SqKToAc= (float) (SQKMToAcre*247.1);
                editText1.setText(String.valueOf(SqKToAc));


                float SQKMToSQM=Float.parseFloat(editText2.getText().toString());
                float SqKToSqM= (float) (SQKMToSQM/2.59);
                editText3.setText(String.valueOf(SqKToSqM));

            }

        });

    }

    public void ConverterSQM() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float SQMToSQFT=Float.parseFloat(editText3.getText().toString());
                float SqMToSqF= SQMToSQFT*27880000;
                editText.setText(String.valueOf(SqMToSqF));


                float SQMToAAcre=Float.parseFloat(editText3.getText().toString());
                float SqMToAc= SQMToAAcre*640;
                editText1.setText(String.valueOf(SqMToAc));


                float SQMToSQKM=Float.parseFloat(editText3.getText().toString());
                float SQMToSQK= (float) (SQMToSQKM*2.59);
                editText2.setText(String.valueOf(SQMToSQK));

            }

        });

    }

    public void Reset(){
        Button resetbtn=findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                editText.setText(null);
                editText1.setText(null);
                editText2.setText(null);
                editText3.setText(null);

            }
        });


    }

}