package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;

import com.weather_bak.R;
import com.weather_bak.presenter.TestActivityPresenter;

/**
 * Created by roma on 15.06.15.
 */
public class TestActivity extends Activity {

    private TestActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        presenter = new TestActivityPresenter(getApplicationContext(), this);
    }
}
