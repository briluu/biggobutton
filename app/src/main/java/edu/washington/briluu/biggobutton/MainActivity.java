package edu.washington.briluu.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    Button button;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btnPushMe);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter++;
                Log.d(TAG, "Button clicked! It has been clicked " + counter + " time(s).");
                button.setText("You have pushed me " + counter + " time(s)!");
            }
        });
    }
}
