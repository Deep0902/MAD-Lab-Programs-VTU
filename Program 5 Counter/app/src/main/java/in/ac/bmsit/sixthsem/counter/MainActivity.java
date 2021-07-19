package in.ac.bmsit.sixthsem.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button start;
    Button stop;
    Button reset;
    int counter = 0;
    Handler myH = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.CounterText);
        start = findViewById(R.id.button);
        stop = findViewById(R.id.button2);
        reset = findViewById(R.id.buttonReset);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myH.post(countTimer);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myH.post(countTimer2);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myH.post(zero);
            }
        });
    }// on create class

    private final Runnable countTimer = new Runnable() {
        @Override
        public void run() {
            counter++;
            tv.setText(""+counter);
            //myH.postDelayed(this,0);
            //myH.removeCallbacks(countTimer);
        }
    };

    private final Runnable countTimer2 = new Runnable() {
        @Override
        public void run() {
            counter--;
            tv.setText(""+counter);
            //myH.postDelayed(this,0);
            //myH.removeCallbacks(countTimer2);
        }
    };

    private final Runnable zero = new Runnable() {
        @Override
        public void run() {
            counter = 0;
            tv.setText(""+counter);
        }
    };
}