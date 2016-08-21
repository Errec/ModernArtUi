package com.example.errec.moderartui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static SeekBar seekbar;

    private static View topSqr;
    private static View middleSqr;
    private static View middleSqrContentA;
    private static View middleSqrContentB;
    private static View bottomSqr;
    private static View stripe1;
    private static View stripe2;
    private static View stripe3;
    private static View stripe4;
    private static View stripe5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar) findViewById(R.id.seekBar);
        topSqr = findViewById(R.id.topSqr);
        middleSqr = findViewById(R.id.middleSrq);
        middleSqrContentA = findViewById(R.id.middleSrqContentA);
        middleSqrContentB = findViewById(R.id.middleSrqContentB);
        bottomSqr = findViewById(R.id.bottomSqr);
        stripe1 = findViewById(R.id.stripe1);
        stripe2 = findViewById(R.id.stripe2);
        stripe3 = findViewById(R.id.stripe3);
        stripe4 = findViewById(R.id.stripe4);
        stripe5 = findViewById(R.id.stripe5);

        seekBarAction();
    }


    private void seekBarAction() {


        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    public int seekBarProgressValue = 0;

                    //SwitchColor switchColor = new SwitchColor(topSqr,seekBarProgressValue,"#FFF","#000");
                    // switchColor.SwitchTextViewBackground(); // cannot resolve Symbol

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        seekBarProgressValue = i;
                        //Edit is here
                        SwitchColor sTopSqr = new SwitchColor(MainActivity.this, topSqr, i, "#FF009B3A", "#FFFFFF");
                        sTopSqr.SwitchTextViewBackground();

                        SwitchColor sMiddleSqr = new SwitchColor(MainActivity.this, middleSqr, i, "#FEDF00", "#3C3B6E");
                        sMiddleSqr.SwitchTextViewBackground();

                        SwitchColor sMiddleSqrContentA = new SwitchColor(MainActivity.this, middleSqrContentA, i, "#002776", "#FFFFFF");
                        sMiddleSqrContentA.SwitchTextViewBackground();

                        SwitchColor sMiddleSqrContentB = new SwitchColor(MainActivity.this, middleSqrContentB, i, "#FFFFFF", "#000000");
                        sMiddleSqrContentB.SwitchTextViewBackground();

                        SwitchColor sBottomSqr = new SwitchColor(MainActivity.this, bottomSqr, i, "#FF009B3A", "#FFFFFF");
                        sBottomSqr.SwitchTextViewBackground();

                        SwitchColor mStripe1 = new SwitchColor(MainActivity.this, stripe1, i, "#FF009B3A", "#B22234");
                        mStripe1.SwitchTextViewBackground();

                        SwitchColor mStripe2 = new SwitchColor(MainActivity.this, stripe2, i, "#FF009B3A", "#B22234");
                        mStripe2.SwitchTextViewBackground();

                        SwitchColor mStripe3 = new SwitchColor(MainActivity.this, stripe3, i, "#FF009B3A", "#B22234");
                        mStripe3.SwitchTextViewBackground();

                        SwitchColor mStripe4 = new SwitchColor(MainActivity.this, stripe4, i, "#FF009B3A", "#B22234");
                        mStripe4.SwitchTextViewBackground();

                        SwitchColor mStripe5 = new SwitchColor(MainActivity.this, stripe5, i, "#FF009B3A", "#B22234");
                        mStripe5.SwitchTextViewBackground();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(getApplicationContext(), "Started tracking seekbar" + seekBarProgressValue, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();

                    }

                }
        );


    }

}
