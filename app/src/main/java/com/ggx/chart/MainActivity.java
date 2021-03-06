package com.ggx.chart;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

import com.ggx.chart_lib.Chart;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Chart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        chart= (Chart) findViewById(R.id.chart);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=new Random().nextInt(100);
                int n2=new Random().nextInt(200);
                int n3=new Random().nextInt(300);
                chart.setValue(n1,n2,n3);
            }
        });
    }

}
