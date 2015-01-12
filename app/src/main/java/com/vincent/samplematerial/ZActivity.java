package com.vincent.samplematerial;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import com.vincent.samplematerial.View.DragFrameLayout;

import org.json.JSONException;
import org.json.JSONObject;


public class ZActivity extends Activity {

    private CardView cardView;
    private DragFrameLayout dragFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z);

        cardView = (CardView) findViewById(R.id.cardView);
        dragFrameLayout = (DragFrameLayout) findViewById(R.id.draglayout);
        dragFrameLayout.setDragFrameController(new DragFrameLayout.DragFrameLayoutController() {
            @Override
            public void onDragDrop(boolean captured) {
                cardView.animate().translationZ(captured ? 50 : 0);
            }
        });
        dragFrameLayout.addDragView(cardView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_z, menu);
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

    int height;

    public void zoomIn(View view) {
        cardView.setTranslationZ(height += 5);
    }

    public void zoomOut(View view) {
        cardView.setTranslationZ(height -= 5);
    }
}
