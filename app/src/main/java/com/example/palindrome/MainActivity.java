package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
private  char[] ReversedString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView userWord=findViewById(R.id.tvWord);
        Button btnCheck=findViewById(R.id.btnCheck);
        TextView decision=findViewById(R.id.tvValidate);
        FloatingActionButton btnGame=findViewById(R.id.btnGame);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String caturedWord=userWord.getText().toString();
                if(!caturedWord.isEmpty()){
                    ReversedString=new char[caturedWord.length()];
                    for(int i=caturedWord.length()-1;i>=0;i--){
                        ReversedString[caturedWord.length()-1-i]=caturedWord.charAt(i);
                    }
                    if(caturedWord.equals(String.valueOf(ReversedString))){
                        decision.setText("\uD83C\uDF89 Congratulation "+caturedWord+" is a Palindrome \uD83C\uDF89 ");
                    }else{
                        decision.setText(" \uD83D\uDE1E Sorry you are Wrong");
                    }
                }
            }
        });

        btnGame.setOnClickListener(view->{
           Toast.makeText(this,"The Game Feature Will be added soon",Toast.LENGTH_LONG).show();
      });
    }
}