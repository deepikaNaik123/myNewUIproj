package com.jio.spinner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by kaushik.shingne on 26-08-2015.
 */
public class IcoMoonTextView extends TextView
{
    public IcoMoonTextView(Context context)
    {
        super(context);
        init();
    }

    public IcoMoonTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public IcoMoonTextView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        setTypeface(JMFontUtil.getFontInstance().getIcomoonFont(getContext().getApplicationContext()));
    }
}
