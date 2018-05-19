package com.example.rec.deltatask;

import android.annotation.SuppressLint;
import android.content.Intent;
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int a=0;
    private int b=0;
    private int c=0;
    private int d=0;
    private int e=0;
    private int f=0;
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
        Button button2 = findViewById(R.id.buttonspace);
        Button button3 = findViewById(R.id.buttonreality);
        Button button4 = findViewById(R.id.buttontime);
        Button button5 = findViewById(R.id.buttonsoul);
        Button button6 = findViewById(R.id.buttonmind);
        Button button7=findViewById(R.id.button7);

        arraylist =new ArrayList<String>();
        adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraylist);
        list.setAdapter(adapter);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonpower:

                s="power stone";
                arraylist.add(s);
                adapter.notifyDataSetChanged();
                mylayout.setBackgroundColor(Color.MAGENTA);
                mytext.setText("Congratulation, you just found POWER STONE");
                a++;
                bac();

                break;
            case R.id.buttonspace:

                s="space stone";
                arraylist.add(s);
                adapter.notifyDataSetChanged();
                mylayout.setBackgroundColor(Color.BLUE);
                b++;
                mytext.setText("Congratulation, you just found SPACE STONE");
                bac();

                break;
            case R.id.buttonreality:

                s="reality stone";
                arraylist.add(s);
                adapter.notifyDataSetChanged();
                c++;
                mylayout.setBackgroundColor(Color.RED);
                mytext.setText("Congratulation, you just found REALITY STONE");
                bac();

                break;
            case R.id.buttontime:

                s="time stone";
                arraylist.add(s);
                adapter.notifyDataSetChanged();
                d++;
                mylayout.setBackgroundColor(Color.GREEN);
                mytext.setText("Congratulation, you just found TIME STONE");
                bac();

                break;
            case R.id.buttonsoul:

                s="soul stone";
                arraylist.add(s);
                adapter.notifyDataSetChanged();
                e++;
                mylayout.setBackgroundColor(Color.rgb(255,165,0));
                mytext.setText("Congratulation, you just found SOUL STONE");
                bac();

                break;

                case R.id.buttonmind:

                    s="mind stone";
                    arraylist.add(s);
                    adapter.notifyDataSetChanged();
                    f++;
                    bac();
                    mylayout.setBackgroundColor(Color.YELLOW);

                    mytext.setText("Congratulation, you just found MIND STONE");

                break;
            case R.id.button7:
                arraylist.clear();
                adapter.notifyDataSetChanged();
                mylayout.setBackgroundColor(Color.WHITE);
                mytext.setText("HELLO THANOS ");



        }
}

     public void bac(){
        if(a!=0&&b!=0&&c!=0&&d!=0&&e!=0&&f!=0)
        {
            openActivity2();
        }
     }
     public void openActivity2(){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
     }
}
