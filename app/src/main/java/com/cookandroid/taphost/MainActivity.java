package com.cookandroid.taphost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecFirst = tabHost.newTabSpec("First").setIndicator("강아지");
        tabSpecFirst.setContent(R.id.강아지);
        tabHost.addTab(tabSpecFirst);

        TabSpec tabSpecSecond = tabHost.newTabSpec("second").setIndicator("고양이");
        tabSpecSecond.setContent(R.id.고양이);
        tabHost.addTab(tabSpecSecond);

        TabSpec tabSpecThird = tabHost.newTabSpec("third").setIndicator("토끼");
        tabSpecThird.setContent(R.id.토끼);
        tabHost.addTab(tabSpecThird);

        TabSpec tabSpecFourth = tabHost.newTabSpec("Fourth").setIndicator("말");
        tabSpecFourth.setContent(R.id.말);
        tabHost.addTab(tabSpecFourth);
        tabHost.setCurrentTab(0);
    }
}