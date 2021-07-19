package in.ac.bmsit.sixthsem.program6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button bXML, bJSON;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bJSON = findViewById(R.id.bJSON);
        res = findViewById(R.id.outputDisplay);

        bJSON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //JSON file

            }
        });
    }

    public void parseXML(View v){

    }
}