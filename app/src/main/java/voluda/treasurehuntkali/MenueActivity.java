package voluda.treasurehuntkali;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenueActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        Button myButtonText = (Button) findViewById(R.id.button3);
        myButtonText.setTypeface(myTypeface);
        myButtonText.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText2 = (Button) findViewById(R.id.button4);
        myButtonText2.setTypeface(myTypeface);
        myButtonText2.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText2.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText3 = (Button) findViewById(R.id.button5);
        myButtonText3.setTypeface(myTypeface);
        myButtonText3.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText3.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText4 = (Button) findViewById(R.id.button6);
        myButtonText4.setTypeface(myTypeface);
        myButtonText4.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText4.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText5 = (Button) findViewById(R.id.button7);
        myButtonText5.setTypeface(myTypeface);
        myButtonText5.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText5.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText6 = (Button) findViewById(R.id.button8);
        myButtonText6.setTypeface(myTypeface);
        myButtonText6.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText6.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText7 = (Button) findViewById(R.id.button9);
        myButtonText7.setTypeface(myTypeface);
        myButtonText7.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText7.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText8 = (Button) findViewById(R.id.button10);
        myButtonText8.setTypeface(myTypeface);
        myButtonText8.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText8.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText9 = (Button) findViewById(R.id.button11);
        myButtonText9.setTypeface(myTypeface);
        myButtonText9.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText9.setShadowLayer(8, 0, 0, Color.BLACK);

        ((Button)findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity1.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity2.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity3.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity4.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button7)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity5.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button8)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity6.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button9)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity7.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button10)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, TreasureActivity8.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.button11)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenueActivity.this, FinalActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menue, menu);
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
