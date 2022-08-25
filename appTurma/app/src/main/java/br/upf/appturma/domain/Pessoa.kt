package br.upf.appturma.domain

import java.io.Serializable

class Pessoa  (var id:Int?, var nome:String, var idade:Int): Serializable {
    fun getDadosPessoa(): String {
        var res:String = "$nome tem $idade anos. Viveu aproximadamente "+
                (idade*365)+" dias."
        return res
    }
}