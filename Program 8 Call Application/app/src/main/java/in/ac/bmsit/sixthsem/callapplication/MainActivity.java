package in.ac.bmsit.sixthsem.callapplication;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView phone;
    Button call,save,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bStar,bHash,bDel;
    String phoneNum="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone = findViewById(R.id.phone);
        call = findViewById(R.id.bCall);
        save = findViewById(R.id.bSave);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bStar = findViewById(R.id.bStar);
        bHash = findViewById(R.id.bHash);
        bDel = findViewById(R.id.bDel);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum = phone.getText().toString();
                Uri phoneData = Uri.parse("tel:"+phoneNum);
                Intent myInt = new Intent(Intent.ACTION_DIAL);
                myInt.setData(phoneData);
                startActivity(myInt);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum = phone.getText().toString();
                Intent myInt = new Intent(Intent.ACTION_INSERT);
                myInt.setType(ContactsContract.Contacts.CONTENT_TYPE);
                myInt.putExtra(ContactsContract.Intents.Insert.NAME, "Test");
                myInt.putExtra(ContactsContract.Intents.Insert.PHONE, phoneNum);
                startActivity(myInt);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"0";
                phone.setText(phoneNum);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"1";
                phone.setText(phoneNum);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"2";
                phone.setText(phoneNum);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"3";
                phone.setText(phoneNum);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"4";
                phone.setText(phoneNum);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"5";
                phone.setText(phoneNum);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"6";
                phone.setText(phoneNum);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"7";
                phone.setText(phoneNum);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"8";
                phone.setText(phoneNum);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"9";
                phone.setText(phoneNum);
            }
        });
        bStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"*";
                phone.setText(phoneNum);
            }
        });
        bHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum+"#";
                phone.setText(phoneNum);
            }
        });
        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNum = phone.getText().toString();
                phoneNum = phoneNum.substring(0,phoneNum.length()-1);
                phone.setText(phoneNum);
            }
        });
    }
}