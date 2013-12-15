package com.incra.searchergrid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SearchListActivity extends Activity {

  /** Called when the activity is first created. */
  private static final int ACTIVITY_CREATE = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_list);

    final Button button1 = (Button) findViewById(R.id.search_list_search1);
    button1.setOnClickListener(new Button.OnClickListener() {

      public void onClick(View v) {
        select();
      }
    });
    final Button button2 = (Button) findViewById(R.id.search_list_search2);
    button2.setOnClickListener(new Button.OnClickListener() {

      public void onClick(View v) {
        select();
      }
    });

    final Button button3 = (Button) findViewById(R.id.searchListBack);
    button3.setOnClickListener(new Button.OnClickListener() {

      public void onClick(View v) {
        back();
      }
    });
  }

  protected void select() {
    Intent i = new Intent(this, MapActivity.class);
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
