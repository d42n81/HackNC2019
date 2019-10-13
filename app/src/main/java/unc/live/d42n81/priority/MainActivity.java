package unc.live.d42n81.priority;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View red = (View) findViewById(R.id.red);
        View blue = (View) findViewById(R.id.blue);
        View green = (View) findViewById(R.id.green);
        View magenta = (View) findViewById(R.id.magenta);
        View gold = (View) findViewById(R.id.gold);
        red.setOnTouchListener(handleTouch);
        blue.setOnTouchListener(handleTouch);
        green.setOnTouchListener(handleTouch);
        magenta.setOnTouchListener(handleTouch);
        gold.setOnTouchListener(handleTouch);

    }

    private View.OnTouchListener handleTouch = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            int x = (int) event.getX();
            int y = (int) event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Log.v("TAG", "touched down");
                    break;
                case MotionEvent.ACTION_MOVE:
                    Log.i("TAG", "moving: (" + x + ", " + y + ")");
                    break;
                case MotionEvent.ACTION_UP:
                    Log.i("TAG", "touched up");

                    break;
            }

            return true;
        }
    };


    public void settingsOnClick(View v) {
        Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(settingsIntent);
    }

    public void updateDisplay(){
        runOnUiThread(new Runnable() {
            public void run() {
                SharedPreferences settings = getSharedPreferences("settings", 0);
//                output = (TextView)findViewById(R.id.outputText);
//                output.setTextColor(settings.getInt("fontColor", Color.WHITE));
//                output.setBackgroundColor(settings.getInt("bgColor", Color.BLACK));
//                output.setTextSize(1,defaultTextSize);
//                // set output text:
//                output.setText(text);
//
//                output.invalidate();
                Log.v("DOM", "DOM Rerendered");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateDisplay();
    }
}

