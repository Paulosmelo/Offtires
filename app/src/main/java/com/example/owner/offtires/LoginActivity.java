package com.example.owner.offtires;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView mytv;
    TextView mytv2;
    Typeface MyFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mytv = (TextView)findViewById(R.id.txtCadastro);
        mytv2 = (TextView)findViewById(R.id.btnEntrar);
        MyFont = Typeface.createFromAsset(this.getAssets(), "fonts/seguili.ttf");
        mytv.setTypeface(MyFont);
        mytv2.setTypeface(MyFont);
    }
    public void Entrar(View view) {
       Intent intent = new Intent(this, HomeActivity.class);
       startActivity(intent);

    }
    public void Cadastro(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
}
