package com.sumit.scenetransitionexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/**
 * Created by Sumit Sahoo on 4/18/2017.
 */


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartTransition;
    private ImageView imageViewRobot;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        buttonStartTransition = (Button) findViewById(R.id.button_test_animation);
        imageViewRobot = (ImageView) findViewById(R.id.image_robot);

        buttonStartTransition.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == buttonStartTransition) {

            // Start detail activity with transition
            // Transition name needs to be same on both the View to make the scene transition work across activities
            // View ID can be different

            ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, imageViewRobot, context.getString(R.string.transition_name));
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            ActivityCompat.startActivity(context, intent, activityOptionsCompat.toBundle());
        }
    }
}
