package unc.live.d42n81.priority;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;
//=======
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//<<<<<<< Updated upstream
//
//    }
//>>>>>>> Stashed changes
        View red = (View) findViewById(R.id.red);
    }
}

