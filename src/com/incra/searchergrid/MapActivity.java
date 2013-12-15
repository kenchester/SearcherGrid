package com.incra.searchergrid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MapActivity extends Activity {

  /** Called when the activity is first created. */
  private static final int ACTIVITY_CREATE = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map);

    final Button button2 = (Button) findViewById(R.id.map_back);
    button2.setOnClickListener(new Button.OnClickListener() {

      public void onClick(View v) {
        back();
      }
    });
  }

  protected void startANewSearch() {
    Intent i = new Intent(this, SearchCreateActivity.class);
    startActivityForResult(i, ACTIVITY_CREATE);
  }

  protected void back() {
    Intent i = new Intent(this, InitialActivity.class);
    startActivityForResult(i, ACTIVITY_CREATE);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.login, menu);
    return true;
  }

}
