package com.example.customview;

import android.app.Application;

/**
 * @author - qqz
 * @date - 2019/11/12/14:27
 * @note -
 * ---------------------------------------------------------------------------------------------------------------------------------
 * @modified -
 * @date -
 * @note -
 */
public class App extends Application {
    static App mApp;

    public static App getInstance() {
        return mApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = new App();
        Utils.init(this);
    }
}
