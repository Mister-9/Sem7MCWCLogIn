package com.mr9.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static EditText uname,pass;
    private static TextView out;

    private static Button sub,retry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname= (EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        sub=(Button)findViewById(R.id.submit);
        sub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(MainActivity.this,LogInActivity.class);
                        intent.putExtra("uname",uname.getText().toString());
                        intent.putExtra("pass",pass.getText().toString());
                        startActivity(intent);
                    }
                }
        );
    }
}
