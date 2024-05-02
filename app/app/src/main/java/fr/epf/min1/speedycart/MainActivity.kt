package fr.epf.min1.speedycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lastname_userinfo_textview = findViewById<TextView>(R.id.lastname_userinfo_textview)

        MainScope().launch(Dispatchers.Main){
            val response = ApiClient.apiService.getClient()

            if(response.isSuccessful && response.body() != null){
                lastname_userinfo_textview.text = response.body()!!.lastname
            }
        }
    }
}