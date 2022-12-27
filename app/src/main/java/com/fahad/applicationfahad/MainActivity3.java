package com.fahad.applicationfahad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
EditText buy,sell,kg,fit,inch;
Button calculated,bmi;
TextView equal,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);




        kg=findViewById(R.id.kg);
        fit=findViewById(R.id.fit);
        inch=findViewById(R.id.inch);
        bmi=findViewById(R.id.bmi);
        ans=findViewById(R.id.ans);

        buy=findViewById(R.id.buy);
        sell=findViewById(R.id.sell);
        calculated=findViewById(R.id.calculated);
        equal=findViewById(R.id.equal);


       calculated.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               float buyPrice,sellPrice,profit,precent;

               String sbuy=buy.getText().toString();
               buyPrice=Float.parseFloat(sbuy);


               String s_sell=sell.getText().toString();
               sellPrice=Float.parseFloat(s_sell);

               profit=sellPrice-buyPrice;

               precent=profit/buyPrice*100;


               if(buyPrice<sellPrice){
                   equal.setText("your profit is "+profit+"\nprofit yours="+precent+"%");
                   Toast.makeText(MainActivity3.this, "your profit is "+profit+"\nprofit yours="+precent+"%", Toast.LENGTH_LONG).show();
               }else {
                   equal.setText("your loss is "+profit+"\nloss yours="+precent+"%");
                   Toast.makeText(MainActivity3.this, "your loss is "+profit+"\nloss yours="+precent+"%", Toast.LENGTH_LONG).show();
               }


           }
       });



bmi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        float weaight,heaight1,heaight2,myHeaight,bmi;

        String s_weaight=kg.getText().toString();
        weaight=Float.parseFloat(s_weaight);

        String s_heaight1=fit.getText().toString();
        heaight1=Float.parseFloat(s_heaight1);
        heaight1= (float) (heaight1*0.3048);

        String s_heaight2=inch.getText().toString();
        heaight2=Float.parseFloat(s_heaight2);
        heaight2= (float) (heaight2*0.0254);


        myHeaight=heaight1+heaight2;

          bmi=weaight/(myHeaight*myHeaight);

if (bmi<18){
    ans.setText("your bmi is= "+bmi+"\nyour weaight is low " );

    Toast.makeText(MainActivity3.this, "your bmi is= "+bmi+"\nyour weaight is low ", Toast.LENGTH_LONG).show();
}
  if (bmi>24) {
      ans.setText("your bmi is= "+bmi+"\nyour weaight is over.so you daiet on your body");
      Toast.makeText(MainActivity3.this, "your bmi is= "+bmi+"\nyour weaight is over.so you daiet on your body", Toast.LENGTH_LONG).show();
  }else {

      ans.setText("yuor bmi is="+bmi+"\nyour bmi is perfect");
      Toast.makeText(MainActivity3.this, "yuor bmi is="+bmi+"\nyour bmi is perfect", Toast.LENGTH_SHORT).show();
  }




    }
});














    }
}