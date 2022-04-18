package com.example.cleanarchitectureexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// app 모듈: 의존성 주입을 위한 hilt를 설정하는 곳 Application 모듈이 여러 개라면 각각에 모듈에 의존성을 넣는다.
@HiltAndroidApp
class App: Application()