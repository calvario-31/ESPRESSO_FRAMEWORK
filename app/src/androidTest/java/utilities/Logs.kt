package utilities

import android.util.Log

object Logs {

    private var TAG = "Espresso Run"

    fun startTest(testName: String) {
        println()
        info("------------------------------------------------------------------------------------------")
        info("Test: $testName")
        info("------------------------------------------------------------------------------------------")
    }

    fun writeStatus(status: String, testName: String) {
        info("------------------------------------------------------------------------------------------")
        info("$status $testName")
    }

    fun finishedTest(methodName: String?) {
        info("------------------------------------------------------------------------------------------")
        println()
    }

    fun info(text: String){
        Log.i(TAG, text)
    }

    fun debug(text: String){
        Log.d(TAG, text)
    }

    fun warn(text: String){
        Log.d(TAG, text)
    }

    fun error(text: String){
        Log.e(TAG, text)
    }
}
