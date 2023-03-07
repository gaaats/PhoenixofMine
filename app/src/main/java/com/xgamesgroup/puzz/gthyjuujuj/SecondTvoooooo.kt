package com.xgamesgroup.puzz.gthyjuujuj

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.xgamesgroup.puzz.R
import com.xgamesgroup.puzz.adreffr.AppapapapapaClas
import com.xgamesgroup.puzz.bgnhujjuju.Fjirjfjijgitjgtijigttg
import com.xgamesgroup.puzz.deffrfrgtgtgt.MainActivity
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SecondTvoooooo : AppCompatActivity() {

    private fun onFailure(t: Throwable) {
        Toast.makeText(this, t.message, Toast.LENGTH_SHORT).show()
    }

    private fun onResponse(response: Fjirjfjijgitjgtijigttg.JIfjijrf) {
        AppapapapapaClas.gtjtgjogtjigt.put("GEO", response.countryCode)
//        Toast.makeText(this, AppapapapapaClas.pampam["GEO"], Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, MainActivity::class.java))
    }

    private var frirfrfgtgt: CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_tvoooooo)

        frirfrfgtgt = CompositeDisposable()


        val frnjgtugtgtuihugt = Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(Fjirjfjijgitjgtijigttg.Jjfrijjjrf::class.java)


        frirfrfgtgt?.add(
            frnjgtugtgtuihugt.gtoigtogtj()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
        )
    }


}