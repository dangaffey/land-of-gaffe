package com.technoburgh.landofgaffe.views;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

import com.technoburgh.landofgaffe.presenters.CharacterSelectPresenter;

/**
 * Created by dgaffey on 11/4/14.
 */
public class CharacterSelectView extends CardView
{
    private CharacterSelectPresenter presenter;

    public CharacterSelectView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.presenter = new CharacterSelectPresenter(this);
    }


}
