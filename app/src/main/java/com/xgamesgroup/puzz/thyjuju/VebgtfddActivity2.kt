package com.xgamesgroup.puzz.thyjuju

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.webkit.*
import android.widget.Toast

class VebgtfddActivity2 : AppCompatActivity() {


    private fun hy59hy5999j59uj5ju() {

        val hn2ju5uj955ik = Intent(Intent.ACTION_GET_CONTENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "image/*"
        }
        val nh22uj59uj = Intent(Intent.ACTION_CHOOSER).apply {
            putExtra(Intent.EXTRA_INTENT, hn2ju5uj955ik)
            putExtra(Intent.EXTRA_TITLE, "Image Chooser")
        }
        startActivityForResult(Intent.createChooser(nh22uj59uj, "File Chooser"), gtjigtjigtgtjgtjigt);
    }

    private fun h2j5uj5uj(): String {
        val hn2juuj59ki5ikik5ik = getSharedPreferences("NEWPR",
            Context.MODE_PRIVATE)

        val nhhy5uj95ki5ki5ik = hn2juuj59ki5ikik5ik.getString("link", null)
        Log.d("Lololol", nhhy5uj95ki5ki5ik.toString())

        return nhhy5uj95ki5ki5ik.toString()

    }

    private val gtjigtjigtgtjgtjigt = 1
    protected var gtjgtjitgjigtigt: Int = gtjigtjigtgtjgtjigt
    var grvnghugthgthug: ValueCallback<Array<Uri>>? = null

    lateinit var fgfghgthgthuigthu: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fgfghgthgthuigthu = WebView(this)
        vffrgtgthyhyhy()
        setContentView(fgfghgthgthuigthu)

        fgfghgthgthuigthu.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {

                val gthyujujujju = applicationContext.packageManager
                val hy5hy59ju9uj = bgyjujuuj9uj5("org.telegram.messenger", gthyujujujju)

                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hy5hy59ju9uj) {
                        val vfcddsdeded = Intent(Intent.ACTION_VIEW)
                        vfcddsdeded.data = Uri.parse(url)
                        this@VebgtfddActivity2.startActivity(vfcddsdeded)
                    } else {
                        Toast.makeText(
                            this@VebgtfddActivity2,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@VebgtfddActivity2, description, Toast.LENGTH_SHORT).show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }
        }

        fgfghgthgthuigthu.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams
            ):Boolean {

                grvnghugthgthug?.onReceiveValue(null)
                grvnghugthgthug = filePathCallback

                try {
                    hy59hy5999j59uj5ju()
                } catch (e: java.lang.Exception) {
                    Toast.makeText(this@VebgtfddActivity2, e.toString(), Toast.LENGTH_LONG).show()
                }
                return true
            }
        }
        fgfghgthgthuigthu.loadUrl(h2j5uj5uj())
    }

    fun vffrgtgthyhyhy() {
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies( fgfghgthgthuigthu, true)
        val vftghyhyu = fgfghgthgthuigthu.settings
        vftghyhyu.javaScriptEnabled = true
        vftghyhyu.useWideViewPort = true
        vftghyhyu.loadWithOverviewMode = true
        vftghyhyu.allowFileAccess = true
        vftghyhyu.domStorageEnabled = true
        vftghyhyu.userAgentString = vftghyhyu.userAgentString.replace("; wv", "")
        vftghyhyu.javaScriptCanOpenWindowsAutomatically = true
        vftghyhyu.setSupportMultipleWindows(false)
        vftghyhyu.displayZoomControls = false
        vftghyhyu.builtInZoomControls = true
        vftghyhyu.allowFileAccess = true
        vftghyhyu.allowContentAccess = true
        vftghyhyu.setSupportZoom(true)
        vftghyhyu.pluginState = WebSettings.PluginState.ON
        vftghyhyu.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        vftghyhyu.cacheMode = WebSettings.LOAD_DEFAULT
        vftghyhyu.allowContentAccess = true
        vftghyhyu.mediaPlaybackRequiresUserGesture = false
    }

    private fun bgyjujuuj9uj5(packageName: String, packageManager: PackageManager): Boolean {
        return try {
            packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

    var h59hy5uj5juuj5uj = false
    var nh2ju2ju59uj59uj = ""


    override fun onBackPressed() {
        if (fgfghgthgthuigthu.canGoBack()) {
            if (h59hy5uj5juuj5uj) {
                fgfghgthgthuigthu.stopLoading()
                fgfghgthgthuigthu.loadUrl(nh2ju2ju59uj59uj)
            }
            this.h59hy5uj5juuj5uj = true
            fgfghgthgthuigthu.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                h59hy5uj5juuj5uj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == gtjigtjigtgtjgtjigt && (resultCode == RESULT_OK)) {

            if ((null == grvnghugthgthug )) {
                return;
            } else {
                val dataString: String? = data?.dataString

                if (dataString != null) {
                    val result = arrayOf(Uri.parse(dataString))
                    grvnghugthgthug?.onReceiveValue(result)
                    grvnghugthgthug = null
                }
            }
        }
    }

}