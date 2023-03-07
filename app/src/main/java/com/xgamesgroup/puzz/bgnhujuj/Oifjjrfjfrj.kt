package com.xgamesgroup.puzz.bgnhujuj

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.xgamesgroup.puzz.bhhyyhjuju.GamymumumumumActivity2
import com.xgamesgroup.puzz.R
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas
import com.xgamesgroup.puzz.thyjuju.VebgtfddActivity2
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas.Companion.gtjtgjogtjigt
import org.json.JSONException
import org.json.JSONObject

class Oifjjrfjfrj : AppCompatActivity() {

    fun gthigthigthgthugt() {

        Log.d("lolo", "Filter data $gtjtgjogtjigt")

        val deeppppdata = AppapapapapaClas.deepConst

        Log.d("lolo", "appaclass Filter $AppapapapapaClas")

        Log.d("lolo", "Filter deeepapapappa $deeppppdata")


        val appsDatafrgtgtgt = gtjtgjogtjigt["AppsData"]
        val depapapapa = gtjtgjogtjigt["FBData"]
        val gaidieifrrf = gtjtgjogtjigt["GAID"]
        val linkakakokofefr = gtjtgjogtjigt["View"]
        val geogotgthisosoyoy = gtjtgjogtjigt["GeoHose"]
        val onlygeoeo = gtjtgjogtjigt["GEO"]
        val numerroroor = gtjtgjogtjigt["AppsCh"]
        val gtpktgtkkg = MyTracker.getTrackerParams()

        gtpktgtkkg.setCustomUserId(gaidieifrrf)
        gtjigtgthugu(gaidieifrrf.toString())


        val gtjoitgjoigtjogt = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)

        val gtkgtojigtjigt = MyTracker.getInstanceId(applicationContext)

        val nhyjihyjihy = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val gtjogtjogtjogti = Build.VERSION.RELEASE


        val hhyujuj59 = "sub_id_1="
        val hyhy5hy9 = "ad_id="
        val hy59hy59 = "deviceID="
        val bhjuuj2 = "sub_id_4="
        val hy9uj = "sub_id_5="
        val juy5j9ju = "naming"
        val hy5ju95ju9uj = "orgdeep"
        val hy5hy559j5ju = "organika"
        val ghh555 = "deep"

        var hy5uj5uj5j9 = ""

        Log.d("lolo", "apps ${appsDatafrgtgtgt}")
        Log.d("lolo", "depapapapa in FIlter ${depapapapa}")
        Log.d("lolo", "numerroroor  ${numerroroor}")

        when (numerroroor) {
            "1" ->
                if (appsDatafrgtgtgt != "null") {
                    hy5uj5uj5j9 =
                        "$linkakakokofefr$hhyujuj59$appsDatafrgtgtgt&$hy59hy59$nhyjihyjihy&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$juy5j9ju"

                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()
                    Toast.makeText(this, "Naming", Toast.LENGTH_LONG).show()
                    Toast.makeText(this, "link ${hy5uj5uj5j9}", Toast.LENGTH_LONG).show()

                    startActivity(Intent(this, VebgtfddActivity2::class.java))
                    fgriojgtojgtjigtj()
                } else if (depapapapa != null || geogotgthisosoyoy!!.contains(onlygeoeo.toString())) {
                    hy5uj5uj5j9 =
                        "$linkakakokofefr$hhyujuj59$depapapapa&$hy59hy59$nhyjihyjihy&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$hy5ju95ju9uj"
                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()
                    Toast.makeText(this, "DeepOrg", Toast.LENGTH_SHORT).show()
                    Toast.makeText(this, "link ${hy5uj5uj5j9}", Toast.LENGTH_LONG).show()

                    startActivity(Intent(this, VebgtfddActivity2::class.java))
                    fgriojgtojgtjigtj()
                } else {

                    startActivity(Intent(this, GamymumumumumActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
            "0" ->
                if (depapapapa != null) {
                    hy5uj5uj5j9 =
                        "$linkakakokofefr$hhyujuj59$depapapapa&$hy59hy59$gtkgtojigtjigt&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$ghh555"
                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "depData ${depapapapa}", Toast.LENGTH_LONG).show()
                    Toast.makeText(this, "link ${hy5uj5uj5j9}", Toast.LENGTH_LONG).show()

                    startActivity(Intent(this, VebgtfddActivity2::class.java))
                    fgriojgtojgtjigtj()

                    Toast.makeText(this, "Null FB", Toast.LENGTH_LONG).show()
                } else if (geogotgthisosoyoy!!.contains(onlygeoeo.toString())) {
                    hy5uj5uj5j9 = "$linkakakokofefr$hy59hy59$gtkgtojigtjigt&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$hy5hy559j5ju"
                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "Null MT", Toast.LENGTH_LONG).show()
                    Toast.makeText(this, "link ${hy5uj5uj5j9}", Toast.LENGTH_LONG).show()

                    startActivity(Intent(this, VebgtfddActivity2::class.java))
                    fgriojgtojgtjigtj()
                } else {
                    Toast.makeText(this, "Go to game", Toast.LENGTH_LONG).show()

                    startActivity(Intent(this, GamymumumumumActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
        }
    }

    private fun fgriojgtojgtjigtj() {
        finish()
    }

    fun gtjigtgthugu(frjifrjirfjigt: String) {
//        Toast.makeText(this, "PushExpressed", Toast.LENGTH_SHORT).show()
        OneSignal.setExternalUserId(
            frjifrjirfjigt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val ujujgtrfrfrfrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ujujgtrfrfrfrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gtgthyhyhyhy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gtgthyhyhyhy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val dderffgrgtgtgt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $dderffgrgtgtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filer_filer_filer_filer)
        gthigthigthgthugt()
    }

}