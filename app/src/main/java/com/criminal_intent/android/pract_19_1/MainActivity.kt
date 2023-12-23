package com.criminal_intent.android.pract_19_1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var nav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav = findViewById(R.id.bottomNavigationView)
        nav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.addCrime -> {
                    loadFragment(CrimeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.listCrimes -> {
//                    val selectedValue = "action"
//                    val fragment = MoviesByGenreFragment.newInstance(selectedValue)
                    loadFragment(CrimeListFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
        loadFragment(CrimeFragment())
//        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
//        if (currentFragment == null){
//            val fragment = CrimeFragment()
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.fragment_container, fragment)
//                .commit()
//        }

    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}