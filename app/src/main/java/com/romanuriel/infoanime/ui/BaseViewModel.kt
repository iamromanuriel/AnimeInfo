package com.romanuriel.infoanime.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

abstract class BaseViewModel: ViewModel(){
    var ioThread = CoroutineScope(Dispatchers.IO)
    val ioMain = CoroutineScope(Dispatchers.Main)


}