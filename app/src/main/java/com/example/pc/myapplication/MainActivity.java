package com.example.pc.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // checkbox function to determine which elements to show
    public void onCheckboxClicked(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();

        // determine which checkbox was checked
        switch(view.getId()) {
            case R.id.checkbox_arms:
                // show or hide image depending on checkbox state
                ImageView arms = (ImageView) findViewById(R.id.arms);
                if (checked)
                {
                    arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_shoes:
                ImageView shoes = (ImageView) findViewById(R.id.shoes);
                if (checked)
                {
                    shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_glasses:
                ImageView glasses = (ImageView) findViewById(R.id.glasses);
                if (checked)
                {
                    glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_hat:
                ImageView hat = (ImageView) findViewById(R.id.hat);
                if (checked)
                {
                    hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_eyebrows:
                ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                if (checked)
                {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_mouth:
                ImageView mouth = (ImageView) findViewById(R.id.mouth);
                if (checked)
                {
                    mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_nose:
                ImageView nose = (ImageView) findViewById(R.id.nose);
                if (checked)
                {
                    nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_eyes:
                ImageView eyes = (ImageView) findViewById(R.id.eyes);
                if (checked)
                {
                    eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_ears:
                ImageView ears = (ImageView) findViewById(R.id.ears);
                if (checked)
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_moustache:
                ImageView moustache = (ImageView) findViewById(R.id.moustache);
                if (checked)
                {
                    moustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    moustache.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
