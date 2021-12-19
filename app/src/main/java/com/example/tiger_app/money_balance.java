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
    Dialog popupStart, popupSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_balance);

        // SET BUTTON SUBMIT
        btnSubmit = findViewById(R.id.buttonSubmit);

        // NEW DIALOG POPUP START
        popupStart = new Dialog( this);

        // NEW DIALOG POPUP SUBMIT
        popupSubmit = new Dialog( this);

        // ON CLICK BTN SUBMIT CALL FUNC OPEN ALERT POPUP
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view){
                openAlertSubmit();
            }
        });

        // CALL FUNC OPEN ALERT START
        openAlertStart();
    }

    // FUNC POPUP START
    private void openAlertStart() {
        // SET DIALOG POPUP
        popupStart.setContentView(R.layout.alert_popup_start);
        popupStart.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        // SET BUTTON START
        Button btnStartAlert = popupStart.findViewById(R.id.buttonSubmitStartAlert);

        // ON CLICK BTN START ALERT CLOSE ALERT POPUP
        btnStartAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupStart.dismiss();
            }
        });

        // SHOW POPUP START
        popupStart.show();
    }

    // FUNC POPUP SUBMIT
    private void openAlertSubmit() {
        // SET DIALOG POPUP
        popupSubmit.setContentView(R.layout.alert_popup_submit);
        popupSubmit.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        // SET BUTTON CANCEL & SUBMIT ALERT
        Button btnCancelAlert = popupSubmit.findViewById(R.id.buttonCancelAlert);
        Button btnSubmitAlert = popupSubmit.findViewById(R.id.buttonSubmitAlert);

        // ON CLICK BTN CANCEL ALERT CLOSE ALERT POPUP
        btnCancelAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupSubmit.dismiss();
            }
        });
        // SHOW POPUP SUBMIT
        popupSubmit.show();
    }
}