package com.criminal_intent.android.pract_19_1

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    /*val crimes = mutableListOf<Crime>()
    init {
        for (i in 0..100){
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crime.requiresPolice = i % 7 == 0
            crimes.add(crime)
        }

    }*/
    val crimeRepository=CrimeRepository.get()
    val crimeListLiveData=crimeRepository.getCrimes()
}