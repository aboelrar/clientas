package com.example.lenovo.client.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.lenovo.client.R;

public class verfication extends AppCompatActivity {
    TextView time;
    Button sendAgain;
    ViewSwitcher switcher1;
    Button verfiy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verfication);
         time=(TextView)findViewById(R.id.time);
         sendAgain=(Button)findViewById(R.id.sendagainn);
         switcher1= (ViewSwitcher) findViewById(R.id.my_switcher);
         verficationCode();
         onClick();



         }
         public void verficationCode()
         {
             final int[] count = {10};

             final Handler handler = new Handler();
             final Runnable runnable = new Runnable() {
                 public void run() {
                     if (count[0]-->0){
                         time.setText(Integer.toString(count[0]));
                         if(count[0] ==0)
                         {
                             switcher1.showNext();
                         }
                     }
                     handler.postDelayed(this, 1000);
                     }
             };
             // trigger first time
             handler.post(runnable);
         }
         public void onClick()
         {
             sendAgain.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     switcher1.showNext();
                     verficationCode();
                 }
             });
             verfiy =(Button)findViewById(R.id.verfiy);
             verfiy.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     startActivity(new Intent(verfication.this,chooseMarket.class));
                 }
             });
         }


}
