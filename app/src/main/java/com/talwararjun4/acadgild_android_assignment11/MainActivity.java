package com.talwararjun4.acadgild_android_assignment11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button showhideButton = null;
    ImageView imageView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showhideButton = (Button)findViewById(R.id.button);
        imageView = (ImageView)findViewById(R.id.imgView);
    }

    public void onButtonClick(View view){

        String value = showhideButton.getText().toString();

        if(value.equalsIgnoreCase("show")){
            showhideButton.setText("HIDE");
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            showhideButton.setText("SHOW");
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}
