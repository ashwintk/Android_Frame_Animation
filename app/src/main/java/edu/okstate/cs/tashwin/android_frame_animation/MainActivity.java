package edu.okstate.cs.tashwin.android_frame_animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    protected AnimationDrawable myFrameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    /*This method is used to initialize frame animation & start it*/
    public void onWindowFocusChanged (boolean hasFocus) {
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        //Set the image view's background to the xml file created under drawable folder
        myImageView.setBackgroundResource(R.drawable.frame_animation);
        //Create an animation drawable
        myFrameAnimation = ((AnimationDrawable) myImageView.getBackground());
        //Start the animation
        myFrameAnimation.start();
    }

}
