package com.ejh.elacheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkBlue;
    private CheckBox chkGreen;
    private CheckBox chkRed;
    private Button btn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkBlue=findViewById(R.id.chkBlue);
        chkGreen=findViewById(R.id.chkGreen);
        chkRed=findViewById(R.id.chkRed);
        textView=findViewById(R.id.textView);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder s=new StringBuilder();
                if (chkRed.isChecked())
                    s.append(chkRed.getText().toString()+ " light has a 750-620 nm wavelength"+"\n");
                if (chkGreen.isChecked())
                    s.append(chkGreen.getText().toString()+ " light has a 495-570 nm wavelength"+"\n");
                if (chkBlue.isChecked())
                    s.append(chkBlue.getText().toString()+ " light has a 450-495 nm wavelength"+"\n");
                textView.setText(s);
            }

        });

    }
}