package com.jio.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener, View.OnClickListener
{  private Spinner _spinCategory;
   private TextView tv;
private  String result;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinCategory= (Spinner)findViewById(R.id.spinner);
        _spinCategory.setPrompt("Select Category");
        _spinCategory.setOnItemSelectedListener(MainActivity.this);

         tv =(TextView)findViewById(R.id.text);
        tv.setOnClickListener(MainActivity.this);
        //_spinCategory.performClick();


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.feedback_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        _spinCategory.setAdapter(adapter);
         tv =(TextView)findViewById(R.id.text);
        tv.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        result = (String) _spinCategory.getSelectedItem();

        tv.setText(result);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }

    @Override
    public void onClick(View v)
    {
        _spinCategory.performClick();
    }
}
