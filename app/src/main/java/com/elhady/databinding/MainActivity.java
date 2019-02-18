package com.elhady.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.elhady.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Model model ;
    private MyClick click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this , R.layout.activity_main);

        model = new Model();

        model.setName("google");
        model.setLink("www.google.com");
        model.setDetil("searching for anything");

        binding.setModel(model);

        click = new MyClick(this);
        binding.setClicks(click);
    }
    public class MyClick {

        Context context;

        public MyClick(Context context) {
            this.context = context;
        }

        public void onClicked(View view) {
            Toast.makeText(getApplicationContext(), "clicked!", Toast.LENGTH_SHORT).show();
        }

        public void onButtonClickWithParam(View view, Model model) {
            Toast.makeText(getApplicationContext(), "Button clicked! Name: " + model.name, Toast.LENGTH_SHORT).show();
        }

        public boolean onButtonLongPressed(View view) {
            Toast.makeText(getApplicationContext(), "Button long pressed!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
