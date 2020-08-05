package com.example.tinhtong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends Activity {
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i;
        float S = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtResult	=	(TextView)findViewById(R.id.txtketqua);
        Intent myIntent = getIntent();
        Bundle	myBunble=	myIntent.getBundleExtra("mysum");
        int a	=	myBunble.getInt("soa");
        //int b 	=	myBunble.getInt("sob");
        for(i = 1;i <= a;i++)
        {
            S +=1/(float)i;
        }

        txtResult.setText("Kết quả là: "+ S);
    }
    }