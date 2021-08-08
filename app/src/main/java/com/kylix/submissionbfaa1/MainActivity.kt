package com.kylix.submissionbfaa1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kylix.submissionbfaa1.data.DataDummy
import com.kylix.submissionbfaa1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //TODO 1: Buat view binding di Main Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO 2: Ubah setContentView menjadi view binding

        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val homeFragment = HomeFragment()

        mFragmentManager
            .beginTransaction()
            .add(R.id.frame_container, homeFragment, HomeFragment::class.java.simpleName)
            .commit()

    }
}