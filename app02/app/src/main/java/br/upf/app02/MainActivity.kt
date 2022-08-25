package br.upf.app02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.upf.app02.domain.Pessoa

class MainActivity : AppCompatActivity() {
    var editNome:EditText? = null;
    var editIdade:EditText? = null;
    var textResultado:TextView? = null;
    var editLog:EditText? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editNome= findViewById<EditText>(R.id.editNome)
        editIdade= findViewById<EditText>(R.id.editIdade)
        textResultado= findViewById<TextView>(R.id.textResultado)
        editLog= findViewById<EditText>(R.id.editLog)
        val buttonLimpar = findViewById<Button>(R.id.buttonLimpar)
        buttonLimpar.setOnClickListener{
            editNome?.text?.clear()
            editIdade?.text?.clear()
            textResultado?.text = ""
            editLog?.text?.clear()


        }



    }
    fun ProcessarClick(v:View?){
       /// var calc = editIdade?.text.toString().toInt()* 365
       /// var res = editNome?.text.toString()+" você viveu aproximadamente $calc dias"
        ////textResultado?.text = res
        val pes = Pessoa(id = 0, editNome?.text.toString(), editIdade?.text.toString().toInt())
        textResultado?.text = pes.getDadosPessoa()
        editLog?.text?.append(pes.getDadosPessoa() + " \n")

        // teste para detectar botão clicado
        botaoClicado(v)


        Toast.makeText(getApplicationContext(), "Processou com sucesso", Toast.LENGTH_LONG).show();

    }
    fun botaoClicado(v:View?) {
        when(v?.id){
            R.id.buttonProcessar -> println("Pressionou Processar")
            R.id.buttonLimpar -> println("Pressionou limpar")
        }
        println ((v as Button).text.toString())    }
}

