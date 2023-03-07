package com.xgamesgroup.puzz.bgnhujjuju

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.facebook.applinks.AppLinkData
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas.Companion.gtjtgjogtjigt
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

class Fjirjfjijgitjgtijigttg() {
    fun getttdepapappde(context: Context) {

        Log.d("lolo", "deepL start loading")
        Toast.makeText(context, "deepL start loading", Toast.LENGTH_SHORT).show()


        AppLinkData.fetchDeferredAppLinkData(
            context
        ) {
            // Process app link

            if (it == null){
                Toast.makeText(context, "deep NUULLAA", Toast.LENGTH_SHORT).show()
                Log.d("lolo", "deepL: NUULLAA")

            }
            if (it!!.targetUri == null){
                Log.d("lolo", "it!!.targetUri == null")

            }
            val deeepapapappa = it!!.targetUri?.host.toString()
            Log.d("FB_TAG", "deepL: I'm alive")
            Log.d("lolo", "deepL: I'm alive")
            Log.d("lolo", "deepL: $deeepapapappa")
            Toast.makeText(context, "deep ${deeepapapappa}", Toast.LENGTH_SHORT).show()
            gtjtgjogtjigt["FBData"] = deeepapapappa
            AppapapapapaClas.deepConst = deeepapapappa
            Log.d("lolo", "appaclass $AppapapapapaClas")

        }
    }
    data class Nfrjfrjijjjrf(val pheonixapps : String, val pheonixlink : String, val pheonixgeo : String)

    interface OIJfjjrfojfjrf {

        @GET("pheonix.json")
        fun gogogtadatata() : Observable<Nfrjfrjijjjrf>
    }
    data class JIfjijrf(val countryCode : String)

    interface Jjfrijjjrf {

        @GET("json/?key=KXgMIA7HSEcn0SV")
        fun gtoigtogtj() : Observable<JIfjijrf>
    }
}