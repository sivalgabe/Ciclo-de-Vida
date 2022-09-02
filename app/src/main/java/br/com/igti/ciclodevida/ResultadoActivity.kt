package br.com.igti.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        acaoBotaoVoltar()
    }

    private fun acaoBotaoVoltar() {
                val button = findViewById<Button>(R.id.btnResultadoActivity)
        button.setOnClickListener { finish()
    }
    }
}