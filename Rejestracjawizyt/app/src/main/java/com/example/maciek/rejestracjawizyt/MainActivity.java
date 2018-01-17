package com.example.maciek.rejestracjawizyt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.Pokaz_Liste)
    Button PokazListe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.Pokaz_Liste)
    public void ShowList() {

        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);

    }
}
