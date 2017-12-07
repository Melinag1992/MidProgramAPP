package com.cq4.midprogramapp;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoopActivity extends AppCompatActivity {

    private TextView loopcompleted;
    private int loopnumbers = 0;
    private Context context= getApplicationContext();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        loopcompleted = (TextView) findViewById(R.id.loops_count);

    }

    private class LoopNumbers extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            loopcompleted.setText(doInBackground());
            Intent i = new Intent(context, LoginActivity.class);
            startActivity(i);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            loopcompleted.setText(doInBackground());
        }

        @Override
        protected Integer doInBackground(Integer... integers) {

            int count = integers.length;
            for (int i = count; i < 100000; i++) {
                 publishProgress(i);

                 loopnumbers = i;
            }
            return loopnumbers;
        }
    }
}
