package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText mOperandOneEditText;;
EditText edt1;
    double input1 = 0, input2 = 0;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    Button  button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPer, buttonDel,
            buttonSub, buttonAdd , buttonEql, buttonDiv, buttonMul, button0;
    final String add= " + ";
    final String sub= " - ";
    final String mul= " *  ";
    final String div= " / ";
    String strInput1=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Button v1=findViewById(R.id.button1);
        Button v2=findViewById(R.id.button2);
        Button v3=findViewById(R.id.button3);
        Button v4=findViewById(R.id.button4);
        Button v5=findViewById(R.id.button5);
        Button v6=findViewById(R.id.button6);
        Button v7=findViewById(R.id.button7);
        Button v8=findViewById(R.id.button8);
        Button v9=findViewById(R.id.button9);
        Button v10=findViewById(R.id.buttonPer);
        Button v11=findViewById(R.id.buttonDel);
        Button v12=findViewById(R.id.buttonSub);
        Button v13=findViewById(R.id.buttonAdd);
        Button v14=findViewById(R.id.buttonEql);
        Button v15=findViewById(R.id.buttonDiv);
        Button v16=findViewById(R.id.buttonMul);
        Button v17=findViewById(R.id.button0);

        edt1 = (EditText) findViewById(R.id.edt1);

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            edt1.setText(edt1.getText() + "1");
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "2");
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "3");
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "4");
            }
        });
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "5");
            }
        });
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "6");
            }
        });
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "7");
            }
        });
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "8");
            }
        });
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        v13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    strInput1="";
                    strInput1= edt1.getText() + add;
                    edt1.setText(strInput1);
                    Addition = true;
                    decimal = false;

                }
            }
        });
        v12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    strInput1="";
                    strInput1= edt1.getText() + sub;
                    edt1.setText(strInput1);
                    Subtract = true;
                    decimal = false;

                }
            }
        });

        v16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    strInput1="";
                    strInput1= edt1.getText() + mul;
                    edt1.setText(strInput1);
                    Multiplication = true;
                    decimal = false;

                }
            }
        });

        v15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    strInput1="";
                    strInput1= edt1.getText() + div;
                    edt1.setText(strInput1);
                    Division = true;
                    decimal = false;

                }
            }
        });

        v17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        v14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    String str_input2 = edt1.getText() + "";
                    input2 = Float.parseFloat(str_input2.replace(strInput1,""));
                }

                if (Addition) {

                    edt1.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    edt1.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    edt1.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    edt1.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    edt1.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });

        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });






    }
}


