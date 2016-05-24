package voluda.treasurehuntkali;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;


public class FinalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_final);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        TextView myTextview = (TextView) findViewById(R.id.textView10);
        myTextview.setTypeface(myTypeface);
        myTextview.setTextColor(Color.parseColor("#fbda9d"));
        myTextview.setShadowLayer(8, 0, 0, Color.BLACK);

        Typeface myTypeface2 = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        TextView myTextview2 = (TextView) findViewById(R.id.textView11);
        myTextview2.setTypeface(myTypeface2);
        myTextview2.setTextColor(Color.parseColor("#fbda9d"));
        myTextview2.setShadowLayer(8, 0, 0, Color.BLACK);

        Typeface myTypeface3 = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        TextView myTextview3 = (TextView) findViewById(R.id.textView12);
        myTextview3.setTypeface(myTypeface3);
        myTextview3.setTextColor(Color.parseColor("#fbda9d"));
        myTextview3.setShadowLayer(8, 0, 0, Color.BLACK);

        Typeface myTypeface4 = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        TextView myTextview4 = (TextView) findViewById(R.id.textView13);
        myTextview4.setTypeface(myTypeface4);
        myTextview4.setTextColor(Color.parseColor("#fbda9d"));
        myTextview4.setShadowLayer(8, 0, 0, Color.BLACK);

        Typeface myTypeface5 = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        TextView myTextview5 = (TextView) findViewById(R.id.textView14);
        myTextview5.setTypeface(myTypeface5);
        myTextview5.setTextColor(Color.parseColor("#fbda9d"));
        myTextview5.setShadowLayer(8, 0, 0, Color.BLACK);

        Globals g = Globals.getInstance();
        int data = g.getData();

        System.out.println(data);

        TextView tw = (TextView)findViewById(R.id.textView13);
        tw.append(Integer.toString(data));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_final, menu);
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
