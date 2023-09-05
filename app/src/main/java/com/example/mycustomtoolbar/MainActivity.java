package com.example.mycustomtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            // prioririty of Android Manifest is higher than toolbar.setTitle();
             //So added in SetActionBarSupport....
            getSupportActionBar().setTitle("My Title");
        }
        toolbar.setTitle("My Title");
        toolbar.setSubtitle("My Sub-Title");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==(R.id.back)){
            Toast.makeText(getApplicationContext(),"This is Back Button",Toast.LENGTH_SHORT).show();
        }
        if(itemId==R.id.Forget){
            Toast.makeText(getApplicationContext(),"This is Forget Button",Toast.LENGTH_SHORT).show();
        }
        if(itemId==R.id.back){
            Toast.makeText(getApplicationContext(),"This is Back ",Toast.LENGTH_SHORT).show();
        }
        //Id For Back Button

        if(itemId==android.R.id.home){

            Toast.makeText(getApplicationContext(),"This is Back Arrow ",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}