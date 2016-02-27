package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        TextView winnerTeamText = (TextView) findViewById(R.id.teamName);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String data = bundle.getString("data");
            winnerTeamText.setText(data);
        }

    }
}
