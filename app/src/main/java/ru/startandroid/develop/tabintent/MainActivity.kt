package ru.startandroid.develop.tabintent

import android.app.TabActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost
import android.widget.TabHost.TabSpec

class MainActivity : TabActivity() {
    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabHost = tabHost

        var tabSpec: TabSpec
        tabSpec = tabHost.newTabSpec("tag1")
        tabSpec.setIndicator("Вкладка 1")
        tabSpec.setContent(Intent(this, OneActivity::class.java))
        tabHost.addTab(tabSpec)
        tabSpec = tabHost.newTabSpec("tag2")
        tabSpec.setIndicator("Вкладка 2")
        tabSpec.setContent(Intent(this, TwoActivity::class.java))
        tabHost.addTab(tabSpec)
    }
}