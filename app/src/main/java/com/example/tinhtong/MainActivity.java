package com.example.tinhtong;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;

public class MainActivity extends Activity {
    EditText edtNuma, edtNumb;
    Button btnSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Hello();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNuma	=	(EditText)	findViewById(R.id.edtNum);

        btnSum	=	(Button)	findViewById(R.id.btnSubmit);
        btnSum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent myIntent	=	new Intent(getApplication(), MainActivity2.class);
                    int a	=	Integer.parseInt(edtNuma.getText().toString());

                    Bundle myBundle	=	 new Bundle();
                    myBundle.putInt("soa", a);

                    myIntent.putExtra("mysum", myBundle);
                    startActivity(myIntent);
                }
                catch(Exception ex){

                }
            }
        });
            }
    public void Hello()
    {
        // System.exit(0);
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage("© 2020 Copyright by Tiendatmagic - All Rights Reserved | Designed by Tiendatmagic 😁😁😁");
        dlgAlert.setTitle("Bản quyền:");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
//© 2020 Copyright by Tiendatmagic
    }
}