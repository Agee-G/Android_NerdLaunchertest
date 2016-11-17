package com.nerdlaunchertest.android.nerdlaunchertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NerdLaunchertestActivity extends SingleFragmentActivity {
    @Override
    protected Frgment createFtagment(){
        return NerdLauncherFragment.newInstance();
    }

}
