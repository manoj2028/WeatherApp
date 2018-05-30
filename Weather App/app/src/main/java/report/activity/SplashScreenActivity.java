package report.activity;

/**
 * Created by ManojG on 5/30/2018.
 */


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.manoj.weather.R;

import helper.Permission;
import helper.Utility;

public class SplashScreenActivity extends Activity {


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen);



        Thread startmenu=new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    Thread.sleep(4000);
                    runOnUiThread(new Runnable() {
                        public void run() {

                            startActivity(new Intent(SplashScreenActivity.this, HomeActivity.class));
                            finish();

                        }
                    });
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });
        startmenu.start();

    }
}
