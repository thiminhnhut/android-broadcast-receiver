package io.github.dynamicbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class ExampleBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION == intent.action) {
            Toast.makeText(context, "CONNECTIVITY_ACTION", Toast.LENGTH_SHORT).show()
        }
    }
}