package com.csdn.realm;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Administrator on 2017/2/28.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
     //   Realm myOtherRealm = Realm.getInstance(new RealmConfiguration.Builder(this).name("myOtherRealm.realm").build());
    }
}
