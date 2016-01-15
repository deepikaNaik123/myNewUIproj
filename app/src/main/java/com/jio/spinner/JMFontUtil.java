package com.jio.spinner;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/**
 * An implementation for applying CustomFonts dynamically to the TextViews.
 */
public class JMFontUtil
{
    private static JMFontUtil mFontInstance;
    private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();

    public static final JMFontUtil getFontInstance()
    {

        if (mFontInstance == null)
        {
            mFontInstance = new JMFontUtil();
        }

        return mFontInstance;
    }

    public static Typeface get(String name, Context context)
    {
        Typeface tf = fontCache.get(name);
        if (tf == null)
        {
            try
            {
                tf = Typeface.createFromAsset(context.getApplicationContext().getAssets(), name);
            }
            catch (Exception e)
            {
                return null;
            }
            fontCache.put(name, tf);
        }
        return tf;
    }

    public Typeface getIcomoonFont(Context context)
    {
        return JMFontUtil.get("icomoon.ttf", context);
    }

    public Typeface getOmnesBoldItalicFont(Context context)
    {
        return JMFontUtil.get("omnesbolditalic.otf", context);
    }

    public Typeface getHelveticaFont(Context context)
    {
        return JMFontUtil.get("helvetica-light.ttf", context);
    }

    public Typeface getHelveticaFont(Context context, String fontttf)
    {
        return JMFontUtil.get(fontttf+".ttf", context);
    }
}
