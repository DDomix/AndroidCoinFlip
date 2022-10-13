package com.example.coinflip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView erme;
    private Button fejgomb;
    private Button irasgomb;
    private TextView textview;
    private int tipp;
    private int tips;
    private Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        fejgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips=0;
                tipp=rnd.nextInt(2);
                if (tipp==tips){
                    erme.setImageResource(R.drawable.heads);
                }
                else{
                    Toast.makeText(MainActivity.this, "Írás volt", Toast.LENGTH_SHORT).show();
                }
            }
        });
        irasgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips=1;
                tipp=rnd.nextInt(2);
                if (tipp==tips){
                    erme.setImageResource(R.drawable.tails);
                }
                else {
                    Toast.makeText(MainActivity.this, "Fej volt", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void init(){
        this.erme=findViewById(R.id.erme);
        this.fejgomb=findViewById(R.id.fejgomb);
        this.irasgomb=findViewById(R.id.irasgomb);
        this.textview=findViewById(R.id.textview);
        rnd=new Random();
        tipp=rnd.nextInt(2);
        tips=-1;
    }
}