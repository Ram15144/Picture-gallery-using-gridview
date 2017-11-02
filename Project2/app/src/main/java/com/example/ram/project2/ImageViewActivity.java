package com.example.ram.project2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ram_n on 10/3/2017.
 */

public class ImageViewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the Intent used to start this Activity
        final Intent intent = getIntent();

        // Make a new ImageView
        ImageView imageView = new ImageView(getApplicationContext());

        // Get the ID of the image to display and set it as the image for this ImageView
        imageView.setImageResource(intent.getIntExtra(MainActivity.EXTRA_RES_ID, 0));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri;
                Intent i;
                switch(intent.getStringExtra(MainActivity.DEALER))
                {
                    case "Bentley"  :    uri = Uri.parse("https://www.bentleymotors.com/en.html");
                                         i = new Intent(Intent.ACTION_VIEW, uri);
                                         startActivity(i);
                                         break;
                    case "Audi"     :    uri = Uri.parse("http://www.audi.com/en.html");
                                         i = new Intent(Intent.ACTION_VIEW, uri);
                                         startActivity(i);
                                         break;
                    case "BMW"      :    uri = Uri.parse("https://www.bmw.com/en/home.html");
                                         i = new Intent(Intent.ACTION_VIEW, uri);
                                         startActivity(i);
                                         break;
                    case "Jeep"     :    uri = Uri.parse("https://www.jeep.com/");
                                         i = new Intent(Intent.ACTION_VIEW, uri);
                                         startActivity(i);
                                         break;
                    case "Mercedes" :    uri = Uri.parse("https://www.mercedes-benz.co.in/content/india/mpc/mpc_india_website/enng/home_mpc/passengercars.html");
                                         i = new Intent(Intent.ACTION_VIEW, uri);
                                         startActivity(i);
                                         break;
                    case "Chevrolet":   uri = Uri.parse("http://www.chevrolet.com/");
                                        i = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(i);
                                        break;
                    case "Honda"    :   uri = Uri.parse("http://www.honda.com/");
                                        i = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(i);
                                        break;
                    case "Skoda"    :   uri = Uri.parse("http://www.skoda-auto.co.in/");
                                        i = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(i);
                                        break;
                    case "Jaguar"   :   uri = Uri.parse("http://www.howardorloffjaguar.com/");
                                        i = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(i);
                                        break;
                    case "GMC"      :   uri = Uri.parse("http://www.castlebpg.com/");
                                        i = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(i);
                                        break;
                    case "Lexus"    :   uri = Uri.parse("http://www.lexus.com/");
                                        i = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(i);
                                        break;
                }
            }
        });

        setContentView(imageView);
    }
}
