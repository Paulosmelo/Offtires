package com.example.owner.offtires;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {
    TextView mytv;
    Typeface MyFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        mytv = (TextView)findViewById(R.id.btnEntrar);
        MyFont = Typeface.createFromAsset(this.getAssets(), "fonts/seguili.ttf");
        mytv.setTypeface(MyFont);
    }
    public void Entrar(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
