package br.upf.appturma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.upf.appturma.domain.Pessoa

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
    }

    fun irParaTerceiraActivity(v:View)
    {
        val Tela = Intent(this, TerceiraActivity::class.java)
        Tela.putExtra("descricao", "Teste")
        Tela.putExtra("editar", true)
        Tela.putExtra("id", 1)
        val objeto = Pessoa(1, "Fulano", 20)
        Tela.putExtra("objeto", objeto)
        startActivity(Tela);

    }}