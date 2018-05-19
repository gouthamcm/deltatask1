package com.example.rec.deltatask;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int a=0;
    private int b=0;
    private int c=0;
    private int d=0;
    private int e=0;
    private int f=0;
   private int ran=0;
    private String s;
    ArrayList<String> arraylist ;
    ArrayAdapter<String> adapter ;
    ListView list;
    LinearLayout mylayout ;
    TextView mytext;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        mytext= findViewById(R.id.textView2);
        list=findViewById(R.id.listview);
        mylayout= findViewById(R.id.activity_main);


        Button button1 = findViewById(R.id.buttonpower);

        Button button7=findViewById(R.id.button7);

        arraylist =new ArrayList<String>();
        adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraylist);
        list.setAdapter(adapter);


        button1.setOnClickListener(this);

        button7.setOnClickListener(this);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonpower:

                Random r=new Random();
                ran=r.nextInt(6);
                abc(ran);

                break;

            case R.id.button7:
                arraylist.clear();
                adapter.notifyDataSetChanged();
                mylayout.setBackgroundColor(Color.WHITE);
                mytext.setText("HELLO THANOS ");



        }
}
@SuppressLint("SetTextI18n")
public void abc(int x)
{
   switch(x) {
       case 0:
           a++;if(a==1) {
           s = "power stone";
           arraylist.add(s);
           adapter.notifyDataSetChanged();
           mylayout.setBackgroundColor(Color.MAGENTA);
           mytext.setText("Congratulation, you just found POWER STONE");
       }else{
           mytext.setText("SORRY,YOU MISSED THE STONE BY AN INCH");
       }

           bac();
           break;
       case 1:
          b++;if(b==1) {
           s = "space stone";
           arraylist.add(s);
           adapter.notifyDataSetChanged();
           mylayout.setBackgroundColor(Color.BLUE);
           mytext.setText("Congratulation, you just found SPACE STONE");
       }else{
           mytext.setText("SORRY,YOU MISSED THE STONE BY AN INCH");
       }
           bac();break;
       case 2:
           c++;if(c==1) {
           s = "time stone";
           arraylist.add(s);
           adapter.notifyDataSetChanged();
           mylayout.setBackgroundColor(Color.GREEN);
           mytext.setText("Congratulation, you just found TIME STONE");
       }else{
           mytext.setText("SORRY,YOU MISSED THE STONE BY AN INCH");
       }
           bac();break;
       case 3:
           d++;if(d==1) {
           s = "reality stone";
           arraylist.add(s);
           adapter.notifyDataSetChanged();
           mylayout.setBackgroundColor(Color.RED);
           mytext.setText("Congratulation, you just found REALITY STONE");
       }else{
           mytext.setText("SORRY,YOU MISSED THE STONE BY AN INCH");
       }
           bac();break;
       case 4:
          e++;if(e==1) {
           s = "soul stone";
           arraylist.add(s);
           adapter.notifyDataSetChanged();
           mylayout.setBackgroundColor(Color.rgb(255, 165, 0));
           mytext.setText("Congratulation, you just found SOUL STONE");
       }else{
           mytext.setText("SORRY,YOU MISSED THE STONE BY AN INCH");
       }
           bac();break;
       case 5:
           f++;if(f==1) {
           s = "mind stone";
           arraylist.add(s);
           adapter.notifyDataSetChanged();
           mylayout.setBackgroundColor(Color.YELLOW);
           mytext.setText("Congratulation, you just found MIND STONE");
       }else{
           mytext.setText("SORRY,YOU MISSED THE STONE BY AN INCH");
       }
           bac();break;
   }
}

     public void bac(){
          if(a!=0&&b!=0&&c!=0&&d!=0&&e!=0&&f!=0){
            openActivity2();}

     }
     public void openActivity2(){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
     }
}
