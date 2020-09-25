class Cumprimento {
    // atributo nome do atributo: tipo

    nome: string;
    idade: number;

    //método construtor

    constructor(_nome: string="", _idade: number=0) {
        this.nome = _nome;
        this.idade = _idade;
    }

    //outro método

    mostrarNomeIdade(nome: string, idade: number) {
        return (`A pessoa ${nome} tem ${idade} anos.`)
    }

}

//fim da definição da classe

//invocando a função e armazenando o resultado na variavel de memória chamada resposta

let resposta = new Cumprimento() // server para criar o objeto que inicializamos vazios

console.log(resposta.mostrarNomeIdade("Ivan", 29)) //utilizando um método do objeto resposta