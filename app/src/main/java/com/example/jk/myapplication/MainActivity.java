package com.example.jk.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ประกาศตัวแปล

    private ListView trafficListView;
    private Button aboutMeButtom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //ButtonController
        buttonController();




    } // เมธอทหลัก

    private void buttonController() {

        aboutMeButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.clickeffect1);
                buttonMediaPlayer.start();

                //intent to Webview
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("http://www.trafficpolice.go.th/"));
                startActivity(objIntent);

            }
        });

    } //button controller

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButtom = (Button) findViewById(R.id.button);


    } //Bind Widget

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
} //Main Class
