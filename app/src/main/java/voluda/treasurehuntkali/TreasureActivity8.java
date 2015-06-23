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
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;


public class TreasureActivity8 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure_activity8);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        TextView myTextview = (TextView) findViewById(R.id.textView8);
        myTextview.setTypeface(myTypeface);
        myTextview.setTextColor(Color.parseColor("#fbda9d"));
        myTextview.setShadowLayer(8, 0, 0, Color.BLACK);

        RadioButton eins = (RadioButton)findViewById(R.id.radioButton10);
        RadioButton zwei = (RadioButton)findViewById(R.id.radioButton11);
        RadioButton drei = (RadioButton)findViewById(R.id.radioButton12);

        zwei.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Globals g = Globals.getInstance();
                int data = g.getData();
                g.setData(data+10);
            }
        });

        ((Button) findViewById(R.id.button21)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TreasureActivity8.this, KarteActivity.class);
                i.putExtra("FROM_ACTIVITY", "H");
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.button25)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TreasureActivity8.this, MenueActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_treasure_activity8, menu);
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
