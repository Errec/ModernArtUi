package com.example.errec.moderartui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static SeekBar seekbar;
    private static TextView textview;

    private static TextView topSqr;
    private static TextView middleSqr;
    private static TextView middleSqrContentA;
    private static TextView MiddleSqrContentB;
    private static TextView bottomSqr;
    private static TextView stripe1;
    private static TextView stripe2;
    private static TextView stripe3;
    private static TextView stripe4;
    private static TextView stripe5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarAction();
    }


    private void seekBarAction() {

        seekbar = (SeekBar) findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int seekBarProgressValue = 0;

                    SwitchColor switchColor = new SwitchColor(topSqr,seekBarProgressValue,"#FFF","#000");
                    switchColor.SwitchTextViewBackground(); // cannot resolve Symbol

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    seekBarProgressValue = i;
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }

                }
        );

    }

}
