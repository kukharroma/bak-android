package com.weather_bak.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.weather_bak.R;
import com.weather_bak.presenter.CitiesListPresenter;

/**
 * Created by roma on 15.06.15.
 */
public class CitiesListActivity extends Activity {

    private CitiesListPresenter presenter;
    private ListView lvCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities_list);
        initPresenter();
        initComponents();
        fillListView();
    }

    private void initComponents() {
        lvCities = (ListView) findViewById(R.id.lv_cities);
    }

    private void initPresenter() {
        presenter = new CitiesListPresenter(getApplicationContext(), this);
    }

    private void fillListView() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cities_list));
        lvCities.setAdapter(adapter);
        lvCities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailWeatherActivity.class);
                intent.putExtra(DetailWeatherActivity.POSITION, position);
                startActivity(intent);
            }
        });
    }
}
