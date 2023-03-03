package com.seunggyu.stitch

import android.app.Application
import android.content.Context
import android.util.Log
import com.kakao.sdk.common.KakaoSdk

class SocketApplication : Application() {
    companion object {
        var appContext : Context? = null
    }
    override fun onCreate() {
        super.onCreate()
        appContext = this
        KakaoSdk.init(this,getString(R.string.kakao_app_key))
    }
}