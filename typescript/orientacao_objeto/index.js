var Cumprimento = /** @class */ (function () {
    //método construtor
    function Cumprimento(_nome, _idade) {
        if (_nome === void 0) { _nome = ""; }
        if (_idade === void 0) { _idade = 0; }
        this.nome = _nome;
        this.idade = _idade;
    }
    //outro método
    Cumprimento.prototype.mostrarNomeIdade = function (nome, idade) {
        return ("A pessoa " + nome + " tem " + idade + " anos.");
    };
    return Cumprimento;
}());
//fim da definição da classe
//invocando a função e armazenando o resultado na variavel de memória chamada resposta
var resposta = new Cumprimento(); // server para criar o objeto que inicializamos vazios
console.log(resposta.mostrarNomeIdade("Ivan", 29)); //utilizando um método do objeto resposta
