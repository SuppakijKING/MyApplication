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

        // Creare ListView
        createListview();


    } // เมธอทหลัก

    private void createListview() {

        int[] intImage =
                {
                        R.drawable.traffic_01,
                        R.drawable.traffic_02,
                        R.drawable.traffic_03,
                        R.drawable.traffic_04,
                        R.drawable.traffic_05,
                        R.drawable.traffic_06,
                        R.drawable.traffic_07,
                        R.drawable.traffic_08,
                        R.drawable.traffic_09,
                        R.drawable.traffic_10,
                        R.drawable.traffic_11,
                        R.drawable.traffic_12,
                        R.drawable.traffic_13,
                        R.drawable.traffic_14,
                        R.drawable.traffic_15,
                        R.drawable.traffic_16,
                        R.drawable.traffic_17,
                        R.drawable.traffic_18,
                        R.drawable.traffic_19,
                        R.drawable.traffic_20,
                };

        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ห้ามเลี้ยวขวา";
        strTitle[2] = "ให้ตรงไป";
        strTitle[3] = "ให้เลี้ยวขวา";
        strTitle[4] = "ให้เลี้ยวซ้าย";
        strTitle[5] = "ทางออก";
        strTitle[6] = "ทางเข้า";
        strTitle[7] = "ทางออก";
        strTitle[8] = "หยุดรถ";
        strTitle[9] = "จำกัดความสูง 2.5 เมตร";
        strTitle[10] = "ทางแยก";
        strTitle[11] = "ห้ามกลับรถ";
        strTitle[12] = "ห้ามจอด";
        strTitle[13] = "รถสวน";
        strTitle[14] = "ห้ามแซง";
        strTitle[15] = "ทางเข้า";
        strTitle[16] = "โปรดหยุดรถ";
        strTitle[17] = "จำกัดความเร็ว 50 กิโลเมตร/ชั่วโมง";
        strTitle[18] = "จำกัดความกว้าง 2.5 เมตร";
        strTitle[19] = "จำกัดความสูง 5 เมตร";

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intImage, strTitle);
        trafficListView.setAdapter(objMyAdapter);





    } // createListView

    private void buttonController() {

        aboutMeButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.clickeffect1);
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
