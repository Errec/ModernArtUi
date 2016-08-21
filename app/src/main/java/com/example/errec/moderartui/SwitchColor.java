package com.example.errec.moderartui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import java.util.Random;


public class SwitchColor{
    private View view;
    private int colorIndex;
    private String initialColor;
    private String finalColor;
    private Context context;

    public SwitchColor(Context context, View view, int colorIndex, String initialColor, String finalColor) {
        this.context = context;
        this.view = view;
        this.colorIndex = colorIndex;
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        SwitchTextViewBackground();//Change is here
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
