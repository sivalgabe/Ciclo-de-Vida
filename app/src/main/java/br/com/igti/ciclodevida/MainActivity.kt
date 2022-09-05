package br.com.igti.ciclodevida

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configListeners()
    }
    private fun configListeners(){
        configListenersBtnResultado()
    }

    private fun configListenersBtnResultado() {
        val button =findViewById<Button>(R.id.btnMainAction)
        button.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            startActivity(intent)
        }
    }

}