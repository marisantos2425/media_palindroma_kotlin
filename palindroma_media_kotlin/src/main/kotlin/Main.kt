import java.util.*


fun main() {
    val menu = Scanner(System.`in`)
    print("##--Teste Estrutura de Menu--##\n\n")
    print("|-----------------------------|\n")
    print("| Opção 1 - Média     |\n")
    print("| Opção 2 - Palíndromo         |\n")
    print("| Opção 4 - Sair              |\n")
    print("|-----------------------------|\n")
    print("Digite uma opção: ")
    val opcao = menu.nextInt()
    when (opcao) {
        1 -> print("\nOpção calculo de media selecionado\n"+media())
        2 -> print("\nOpção veja se é palindroma\n"+palindromo())
        4 -> {
            print("\nAté logo!")
            menu.close()
        }
        else -> print("\nOpção Inválida!")
    }
}











fun palindromo() {


    println("Digite Uma Palavra")
    var input = Scanner(System.`in`)
    //conversão do que foi lido do teclado para uma String
    var palavra = input.next()
    //pegando o tamanho da palavra passada, decrementando 1 para ficar dentro do limite da indexação
    var tam : Int = palavra.length-1

    //variavel para percorrer a palavra da esquerda para a direita
    var aux: Int = 0
    var msg: String = "é palindromo"


    while(aux < tam)
    {
        if(palavra[aux] != palavra[tam-aux])
        {
            msg = "errou"
            break
        }
        aux++
    }
    println(msg)
}

fun media()
{
var input= Scanner(System.`in`)
    println("Digite o primeiro valor")
  var n1 : Float =input.nextFloat()
    println("Digite o segundo valor")
      var n2: Float=input.nextFloat()

    println((n1+n2)/2)


}


