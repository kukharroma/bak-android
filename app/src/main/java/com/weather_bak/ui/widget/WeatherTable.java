package com.weather_bak.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.weather_bak.R;

/**
 * Created by roma on 16.06.15.
 */
public class WeatherTable extends TableLayout {

    private TableRow trDate;
    private TableRow trTemperature;
    private TableRow trWindSpeed;
    private TableRow trPrecipitation;
    private TableRow trCloudiness;

    public WeatherTable(Context context) {
        this(context, null);
        init(context);
    }

    public WeatherTable(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.layout_weather_table, this);
        trDate = (TableRow) findViewById(R.id.tr_date);
        trTemperature = (TableRow) findViewById(R.id.tr_temperature);
        trWindSpeed = (TableRow) findViewById(R.id.tr_wind_speed);
        trPrecipitation = (TableRow) findViewById(R.id.tr_precipitation);
        trCloudiness = (TableRow) findViewById(R.id.tr_cloudiness);
    }

    public TableRow getTrDate() {
        return trDate;
    }

    public void setTrDate(TableRow trDate) {
        this.trDate = trDate;
    }

    public TableRow getTrTemperature() {
        return trTemperature;
    }

    public void setTrTemperature(TableRow trTemperature) {
        this.trTemperature = trTemperature;
    }

    public TableRow getTrWindSpeed() {
        return trWindSpeed;
    }

    public void setTrWindSpeed(TableRow trWindSpeed) {
        this.trWindSpeed = trWindSpeed;
    }

    public TableRow getTrPrecipitation() {
        return trPrecipitation;
    }

    public void setTrPrecipitation(TableRow trPrecipitation) {
        this.trPrecipitation = trPrecipitation;
    }

    public TableRow getTrCloudiness() {
        return trCloudiness;
    }

    public void setTrCloudiness(TableRow trCloudiness) {
        this.trCloudiness = trCloudiness;
    }
}
