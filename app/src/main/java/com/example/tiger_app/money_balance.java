package com.example.tiger_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class money_balance extends AppCompatActivity {

    Button btnSubmit;
    Dialog popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_balance);

        btnSubmit = findViewById(R.id.buttonSubmit);
        popup = new Dialog( this);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view){
                openAlertPopup();
            }
        });
    }

    private void openAlertPopup() {
        popup.setContentView(R.layout.alert_popup_submit);
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button btnCancelAlert = popup.findViewById(R.id.buttonCancelAlert);
        Button btnSubmitAlert = popup.findViewById(R.id.buttonSubmitAlert);

        btnCancelAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });

        popup.show();
    }
}