package com.java.android.activitystack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkActivityStackWorkCorrectly();
    }

    private void checkActivityStackWorkCorrectly() {
        if (!isTaskRoot() &&
                getIntent().hasCategory(Intent.CATEGORY_LAUNCHER) &&
                getIntent().getAction() != null &&
                getIntent().getAction().equals(Intent.ACTION_MAIN)) {
            finish();
        }
    }
}
