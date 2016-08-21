package com.example.errec.moderartui;

import android.graphics.Color;
import android.view.View;

import java.util.Random;


public class SwitchColor{
    private View view;
    private int colorIndex;
    private String initialColor;
    private String finalColor;


    public SwitchColor(View view, int colorIndex, String initialColor, String finalColor) {
        this.view = view;
        this.colorIndex = colorIndex;
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        SwitchTextViewBackground();
    }

    public void SwitchTextViewBackground(){

        if(colorIndex <= 10 && colorIndex >= 0) {
            view.setBackgroundColor(Color.parseColor(initialColor));
        } else {
            if (colorIndex >= 90 && colorIndex <=100){
                view.setBackgroundColor(Color.parseColor(finalColor));
            }
            else {
                Random rnd = new Random();
                int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                view.setBackgroundColor(color);
            }
        }
    }
}
