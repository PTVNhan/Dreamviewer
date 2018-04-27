package com.example.nhanphan.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

TextView txtTitle;
EditText edNhap,edtPass;
Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitle = (TextView) findViewById(R.id.txtNote);
        edNhap = (EditText) findViewById(R.id.edInput);
        edtPass = (EditText) findViewById(R.id.edPass);
        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nhap1 = edNhap.getText().toString();
                String pass = edtPass.getText().toString();
                String nhap = "Wellcome " + edNhap.getText().toString() + "!";
                txtTitle.setText( "Ok, please waiting...");
                if ( nhap1.equals("nhan")) {
                    if(pass.equals("123")){
                    Toast.makeText(getApplicationContext(), nhap.toString(), Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Ban Nhap sai mat khau", Toast.LENGTH_SHORT).show();
                    }
                }else
                {
                    String nhap2 =  nhap1 + " is not vaild user!";
                    Toast.makeText(getApplicationContext(), nhap2.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
