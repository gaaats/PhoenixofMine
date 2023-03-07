package com.xgamesgroup.puzz.adreffr

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal

class AppapapapapaClas : Application() {
    companion object {
        var gtjtgjogtjigt: HashMap<String, String> = HashMap()
        var deepConst = "toto"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        rfgjgtjiigtgtjigtijgti()
        val gtkogtkogtkogt = MyTracker.getTrackerConfig()
        gtkogtkogtkogt.isTrackingLaunchEnabled = true
        MyTracker.initTracker("07960621958582898678", this)
    }

    private fun rfgjgtjiigtgtjigtijgti() {
        OneSignal.setAppId("be4c56c8-2f9a-49a2-b9de-3b01a8f3d520")
    }
}