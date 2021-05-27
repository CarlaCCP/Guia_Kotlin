interface Autenticavel {
    // é implicita abstrata, não precisa colocar

    //val senha : Int // property abstrata
    // se é uma informação sensivel, não coloque na interface
    // é obrigatório ser public
    fun autentica(senha: Int): Boolean

}