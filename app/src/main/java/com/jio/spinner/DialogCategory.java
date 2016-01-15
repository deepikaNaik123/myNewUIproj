package com.jio.spinner;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Deepika.Naik on 23-12-2015.
 */
public class DialogCategory extends Dialog
{
    public DialogCategory(Context context)
    {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
        setContentView(R.layout.category_dialog);

    }
}