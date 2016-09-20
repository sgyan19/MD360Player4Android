package com.asha.vrlib.common;

import android.content.Context;
import android.content.res.Resources;

import java.io.InputStream;

/**
 * Created by ajaxzhang on 16/8/10.
 */

public class PluginResource {

    private static PluginResource spluginResource;

    private Context mContext;
    private Resources mRes;

    PluginResource(Resources res){
        mRes = res;
    }

    public static PluginResource getInstance(Resources res){
        if (spluginResource == null){
            spluginResource = new PluginResource(res);
        }
        return spluginResource;
    }

    public InputStream getRawInputStream(int id){
        InputStream result = null;
        try {
            result = mRes.openRawResource(id);
        }catch (Resources.NotFoundException e) {

        }

        return result;
    }
}
