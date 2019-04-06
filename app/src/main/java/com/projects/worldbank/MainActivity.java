package com.projects.worldbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setLogo(R.drawable.world_bank);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //WebView worldbank= (WebView) findViewById(R.id.webView1);
        //worldbank.loadUrl("http://www.worldbank.org/en/who-we-are");

        iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.wb);
    }
    @Override
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu_di_scelta,menu);
            return true;
        }
    @Override
        public boolean onOptionsItemSelected(MenuItem item){

            int id= item.getItemId();
            switch(id) {
                case R.id.Menu_1:
                    Intent int1= new Intent(getApplicationContext(),Main2Activity.class); // inizializza l'intent per passare dalla prima pagina alla successiva
                    startActivity(int1);

                case R.id.Menu_2:

                case R.id.Menu_3:

                case R.id.Menu_4:
            }
            return false;
        }

}
