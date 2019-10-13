package unc.live.d42n81.priority;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
//=======
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View red = (View) findViewById(R.id.red);

    }

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

