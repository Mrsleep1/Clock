package io.hawk.clock.interfaces.impl;

import android.content.Context;

import io.hawk.clock.interfaces.StringFetcher;


/**
 * Created by lan on 2016/4/25.
 */
public class AndroidStringFetcher implements StringFetcher {

    private final Context mContext;

    public AndroidStringFetcher(Context context) {
        mContext = context;
    }

    @Override
    public int getDrawableId(String imgName) {
        return mContext.getResources().getIdentifier(imgName, "drawable", mContext.getPackageName());
    }

    @Override
    public String getStringRes(int strId) {
        return mContext.getString(strId);
    }

    @Override
    public int getColorRes(int colorId) {
        return mContext.getResources().getColor(colorId);
    }

    @Override
    public float getDimensionRes(int dimenId) {
        return mContext.getResources().getDimension(dimenId);
    }
}
