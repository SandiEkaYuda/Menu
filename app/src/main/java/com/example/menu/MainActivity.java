package com.example.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1: {
                Intent i = new Intent(getApplicationContext(),Menu1.class);
                startActivity(i);
            }break;
            case R.id.item2: {
                Intent i = new Intent(getApplicationContext(),Menu2.class);
                startActivity(i);
            }break;
            case R.id.item3: {
                Intent i = new Intent(getApplicationContext(),Menu3.class);
                startActivity(i);
            }break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menunew, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
