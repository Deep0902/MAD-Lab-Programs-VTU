package in.ac.bmsit.sixthsem.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button mod;
    Button exp;
    TextView res;

    EditText input1;
    EditText input2;

    int num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.bAdd);
        sub = findViewById(R.id.bSub);
        mul = findViewById(R.id.bMul);
        div = findViewById(R.id.bDiv);
        mod = findViewById(R.id.bMod);
        exp = findViewById(R.id.bExp);

        res = findViewById(R.id.textReult);
        input1 = findViewById(R.id.edInput1);
        input2 = findViewById(R.id.edInput2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result = num1 + num2;
                res.setText(""+result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result = num1 - num2;
                res.setText(""+result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result = num1 * num2;
                res.setText(""+result);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());

                result = num1 / num2;
                res.setText(""+result);
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result = num1 % num2;
                res.setText(""+result);
            }
        });

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result = (int) Math.pow(num1,num2);
                res.setText(""+result);
            }
        });

    }
}