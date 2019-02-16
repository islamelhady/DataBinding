package com.elhady.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.elhady.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this , R.layout.activity_main);

        Model model = new Model();
        activityMainBinding.setModle(model);

        model.setName("google");
        model.setLink("www.google.com");
        model.setDetil("searching for anything");

    }
}
