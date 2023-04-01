package com.example.btandroid;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Ex4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);
        final EditText usrInput = (EditText) findViewById(R.id.edt_usr_input);
        final AlertDialog alert_dialog = new AlertDialog.Builder(this).create();
        usrInput.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DPAD_CENTER) {
                String message = usrInput.getText().toString();
                alert_dialog.setMessage(message);
                alert_dialog.show();
                return true;
            }
            return false;
        });
    }
}
