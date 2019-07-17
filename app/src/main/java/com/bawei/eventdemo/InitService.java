package com.bawei.eventdemo;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class InitService extends IntentService {

    public InitService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        Intent intent1 = new Intent(this,MainActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent1);
    }
}
