package com.mr9.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    private static TextView out;

    private static Button retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Intent intent=getIntent();
        String u_name=intent.getExtras().getString("uname");
        String pass_=intent.getExtras().getString("pass");
        retry=(Button)findViewById(R.id.try_again);
        String st;
        out = (TextView) findViewById(R.id.output);
        if((u_name.compareTo("mister_9") + pass_.compareTo("bhavink"))==0) {
            st = "Log In Successful !!!\nWelcome "+u_name;
        }
        else if(pass_.compareTo("bhavink")!=0 && u_name.compareTo("mister_9")!=0){
            st = "Sorry!!\nWrong Username and Password!!";
        }
        else if(pass_.compareTo("bhavink")!=0) {
            st = "Sorry!!\nWrong Password!!";
        }
        else if(u_name.compareTo("mister_9")!=0) {
            st = "Sorry!!\nWrong Username!!";
        }
        else {
            st="Sorry!!\nTry Again !";
        }
        out.setText(st);
        retry.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(LogInActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
