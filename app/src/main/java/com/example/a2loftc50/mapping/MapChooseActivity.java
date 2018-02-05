package com.example.a2loftc50.mapping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 2loftc50 on 05/02/2018.
 */

public class MapChooseActivity extends AppCompatActivity implements View.onClickListener {
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_choose);

        Button regular = (Button)findViewById(R.id.btnRegular);
        Button hikebikemap = (Button)findViewById(R.id.btnHikeBikeMap);

        regular.setOnClickListener(this);
        hikebikemap.setOnClickListener(this);

        public void onClick(View view)
        {
            Boolean hikeBike= false;
            if (view.getId() == R.id.btnHikeBikeMap)
            {
                hikeBike = true;
            }
            Intent intent = new Intent();
            Bundle returnedData = new Bundle();
            returnedData.putBoolean("com.example.a2loftc50.mapping.hikebike", hikeBike);
            intent.putExtras(returnedData);
            setResult(RESULT_OK, intent);
            finish();
        }
    }

}
