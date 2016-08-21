package com.example.errec.moderartui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.moreInfo) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Check out The Museum of Modern Art´s Website");

            alertDialogBuilder.setNegativeButton("Not now",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });

            alertDialogBuilder.setPositiveButton("Visit MoMA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    String url = "http://www.moma.org";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        return true;
    }


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

        seekbar.setProgress(0);
        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    public int seekBarProgressValue = 0;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        seekBarProgressValue = i;

                        SwitchColor sTopSqr = new SwitchColor(topSqr, i, "#FF009B3A", "#FFFFFF");
                        sTopSqr.SwitchTextViewBackground();

                        SwitchColor sMiddleSqr = new SwitchColor(middleSqr, i, "#FEDF00", "#3C3B6E");
                        sMiddleSqr.SwitchTextViewBackground();

                        SwitchColor sMiddleSqrContentA = new SwitchColor(middleSqrContentA, i, "#002776", "#FFFFFF");
                        sMiddleSqrContentA.SwitchTextViewBackground();

                        SwitchColor sMiddleSqrContentB = new SwitchColor(middleSqrContentB, i, "#FFFFFF", "#000000");
                        sMiddleSqrContentB.SwitchTextViewBackground();

                        SwitchColor sBottomSqr = new SwitchColor(bottomSqr, i, "#FF009B3A", "#FFFFFF");
                        sBottomSqr.SwitchTextViewBackground();

                        SwitchColor mStripe1 = new SwitchColor(stripe1, i, "#FF009B3A", "#B22234");
                        mStripe1.SwitchTextViewBackground();

                        SwitchColor mStripe2 = new SwitchColor(stripe2, i, "#FF009B3A", "#B22234");
                        mStripe2.SwitchTextViewBackground();

                        SwitchColor mStripe3 = new SwitchColor(stripe3, i, "#FF009B3A", "#B22234");
                        mStripe3.SwitchTextViewBackground();

                        SwitchColor mStripe4 = new SwitchColor(stripe4, i, "#FF009B3A", "#B22234");
                        mStripe4.SwitchTextViewBackground();

                        SwitchColor mStripe5 = new SwitchColor(stripe5, i, "#FF009B3A", "#B22234");
                        mStripe5.SwitchTextViewBackground();
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
