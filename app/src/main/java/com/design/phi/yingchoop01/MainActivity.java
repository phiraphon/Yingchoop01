package com.design.phi.yingchoop01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageItem = (ImageView)findViewById(R.id.imageItem);
    }

    public void clickHammer(View view){
        imageItem.setImageResource(R.drawable.hammer);
    }

    public void clickScissor(View view){
        imageItem.setImageResource(R.drawable.scissor);
    }

    public void clickPaper(View view){
        imageItem.setImageResource(R.drawable.paper);
    }

    public void clickRandom(View view){
        Random random = new Random();
        int value = random.nextInt(3);
        if (value==0){
            imageItem.setImageResource(R.drawable.hammer);
        }else if (value==1){
            imageItem.setImageResource(R.drawable.scissor);
        }else {
            imageItem.setImageResource(R.drawable.paper);
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
