package com.example.actionview

import android.net.wifi.p2p.WifiP2pManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.search_menu,menu)

        var expandListener = ActionView_expand()
        var menuItem1 = menu?.findItem(R.id.search_item)
        menuItem1?.setOnActionExpandListener(expandListener)

        return true
    }

    inner class ActionView_expand : MenuItem.OnActionExpandListener{
        override fun onMenuItemActionExpand(item: MenuItem?): Boolean {
            Log.d("확인","함수호출")
            expand_TextView.text = "펼쳐졌습니다."

            return true
        }

        override fun onMenuItemActionCollapse(item: MenuItem?): Boolean {
            Log.d("확인","함수호출")
            expand_TextView.text="접혔습니다."
            return true
        }


    }

}
