package com.incra.searchergrid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class InitialActivity extends Activity {

  /** Called when the activity is first created. */
  private static final int ACTIVITY_CREATE = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_initial);

    final Button button1 = (Button) findViewById(R.id.startANewSearch);
    button1.setOnClickListener(new Button.OnClickListener() {

      public void onClick(View v) {
        startANewSearch();
      }
    });

    final Button button2 = (Button) findViewById(R.id.selectExistingSearch);
    button2.setOnClickListener(new Button.OnClickListener() {

      public void onClick(View v) {
        selectExistingSearch();
      }
    });
  }

  protected void startANewSearch() {
    Intent i = new Intent(this, SearchCreateActivity.class);
    startActivityForResult(i, ACTIVITY_CREATE);
  }

  protected void selectExistingSearch() {
    Intent i = new Intent(this, SearchListActivity.class);
    startActivityForResult(i, ACTIVITY_CREATE);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.login, menu);
    return true;
  }

}
