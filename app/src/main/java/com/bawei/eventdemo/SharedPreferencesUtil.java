package com.bawei.eventdemo;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesUtil {
    private final static String KEY = "news_data";

    public static SharedPreferences getPreferences() {
        return MyApp.context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
    }


    public static void putPreferences(String key, String value) {
        SharedPreferences.Editor mEditor = getPreferences().edit();
        mEditor.putString(key, value);
        mEditor.commit();
    }

    public static String getPreferencesValue(String key) {
        return getPreferences().getString(key, "");
    }

    /**
     * 清除指定数据
     */
    public static void clearPreferences(String key) {

        SharedPreferences.Editor mEditor = getPreferences().edit();
        mEditor.remove(key);
        mEditor.commit();
    }

    /**
     * 清空数据
     */
    public static void clearPreferences() {

        SharedPreferences.Editor mEditor = getPreferences().edit();
        mEditor.clear();
        mEditor.commit();
    }

}
