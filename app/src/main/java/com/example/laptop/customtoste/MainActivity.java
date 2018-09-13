package com.example.laptop.customtoste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    private Button btnClicked;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        btnClicked = findViewById(R.id.btnClickedId);

        btnClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();

                View coustomToast = inflater.inflate(layout.custom_toast, (ViewGroup) findViewById(R.id.toastLayoutId));


                Toast toast = new Toast(MainActivity.this);

                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(coustomToast);
                toast.show();


            }
        });


    }
}
