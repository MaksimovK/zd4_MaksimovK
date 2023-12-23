package com.criminal_intent.android.pract_19_1

//import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class CrimeDatailModel(): ViewModel() {
    private val repository=CrimeRepository.get()

    suspend fun getCrimeByTitle(title: String): Crime? {
        return repository.getCrimeByTitle(title)
    }

    fun save(crime: Crime) {
        repository.updateCrime(crime)
    }
    fun add(crime: Crime){
        repository.addCrime(crime)
    }
}