package br.com.igti.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        button = findViewById(R.id.btnResultadoActivity)
        configListeners()
    }

    private fun configListeners() {
        acaoBotaoVoltar()
        acaoBotaoNovo()
    }

    private fun acaoBotaoNovo() {
        findViewById<Button>(R.id.btnNovo).setOnClickListener {
            button.visibility = View.VISIBLE
        }
    }


    private fun acaoBotaoVoltar() {
        button.setOnClickListener {
            finish()
    }
    }
}