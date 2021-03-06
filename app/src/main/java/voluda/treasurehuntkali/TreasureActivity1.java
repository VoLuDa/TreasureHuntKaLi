package voluda.treasurehuntkali;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TreasureActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_treasure_activity1);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        TextView myTextview = (TextView) findViewById(R.id.textView2);
        myTextview.setTypeface(myTypeface);
        myTextview.setTextColor(Color.parseColor("#fbda9d"));
        myTextview.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText = (Button) findViewById(R.id.button12);
        myButtonText.setTypeface(myTypeface);
        myButtonText.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText.setShadowLayer(8, 0, 0, Color.BLACK);

        Button myButtonText2 = (Button) findViewById(R.id.button15);
        myButtonText2.setTypeface(myTypeface);
        myButtonText2.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText2.setShadowLayer(8, 0, 0, Color.BLACK);

        EditText et = (EditText)findViewById(R.id.editText);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                Globals g = Globals.getInstance();
                int data = g.getData();

                EditText et = (EditText)findViewById(R.id.editText);
                int in = Integer.parseInt(et.getText().toString());

                if (in == 5){
                    g.setData(data+10);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        ((Button) findViewById(R.id.button12)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TreasureActivity1.this, KarteActivity.class);
                i.putExtra("FROM_ACTIVITY", "Campus");
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.button15)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TreasureActivity1.this, MenueActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_treasure_activity1, menu);
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
