package  com.fahad.applicationfahad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
EditText search,search1;
Button button,button1,button6;
TextView output,output1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        search=findViewById(R.id.search);
        button=findViewById(R.id.button);
        output=findViewById(R.id.output);
        search1=findViewById(R.id.search1);
        button1=findViewById(R.id.button1);
        output1=findViewById(R.id.output1);
button6=findViewById(R.id.button6);




       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String username=search.getText().toString();

               output.setText("hello "+username+" good work ");

               Toast.makeText(MainActivity2.this, username+" good work", Toast.LENGTH_LONG).show();

           }
       });






        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int number;

String s_number=search1.getText().toString();
number=Integer.parseInt(s_number);


if (number%2 ==0) {
    output1.setText(number+" is even");
    Toast.makeText(MainActivity2.this, number+" is even", Toast.LENGTH_SHORT).show();
} else {


    output1.setText(number+" is odd");
    Toast.makeText(MainActivity2.this, number+" is odd", Toast.LENGTH_SHORT).show();
}

            }
        });








        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);



            }
        });







    }
}