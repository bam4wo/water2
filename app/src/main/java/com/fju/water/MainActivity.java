package com.fju.water;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edmonth;
    private EditText ednext;
    int count ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        edmonth = findViewById(R.id.month);
        ednext = findViewById(R.id.next);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void reset(){
        edmonth.setText(String.valueOf(count));
        ednext.setText(String.valueOf(count));
    }
    public void enter(View view){
        int mon = Integer.parseInt(edmonth.getText().toString());
        int nex = Integer.parseInt(ednext.getText().toString());
        float monm;
        float nexm;
        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
            }
        };
        TextUtils.isEmpty(String.valueOf(mon));
        if (mon>=1 && mon<=10){
            monm = mon*7.35f;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用:"+monm)
                    .setPositiveButton("ok",listener)
                    .show();
        }else if (mon>=11 && mon<=30){
            monm = mon*9.45f-21;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用:"+monm)
                    .setPositiveButton("ok",listener)
                    .show();
        }else if (mon>=31 && mon<=50){
            monm = mon*11.55f-84;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用:"+monm)
                    .setPositiveButton("ok",listener)
                    .show();
        }else if (mon>=51 ){
            monm = mon*12.075f-110.25f;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用:"+monm)
                    .setPositiveButton("ok",listener)
                    .show();
        }
        TextUtils.isEmpty(String.valueOf(nex));
        if(nex>=1 && nex<=10){
            nexm=nex*7.35f;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("隔月抄表費用")
                    .setMessage("費用:"+nexm)
                    .setPositiveButton("ok",listener)
                    .show();
        }else if(nex>=11 && nex<=30){
            nexm=nex*9.45f-42;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("隔月抄表費用")
                    .setMessage("費用:"+nexm)
                    .setPositiveButton("ok",listener)
                    .show();
        }else if(nex>=31 && nex<=50){
            nexm=nex*11.55f-84;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("隔月抄表費用")
                    .setMessage("費用:"+nexm)
                    .setPositiveButton("ok",listener)
                    .show();
        }
        else if(nex>=51){
            nexm=nex*12.075f-110.25f;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("隔月抄表費用")
                    .setMessage("費用:"+nexm)
                    .setPositiveButton("ok",listener)
                    .show();
        }
    }
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
}
