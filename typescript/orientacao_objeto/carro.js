var carro = /** @class */ (function () {
    //método construtor
    function carro(_velocidadeAtual, _velocidadeMaxima, _velociadadeMinima) {
        this.velocidadeAtual = _velocidadeAtual || 0;
        this.velocidadeMaxima = _velocidadeMaxima;
        this.velociadadeMinima = _velociadadeMinima;
    }
    carro.prototype.aceleraCarro = function () {
        if (this.velocidadeAtual >= this.velociadadeMinima &&
            this.velocidadeAtual < this.velocidadeMaxima) {
            this.velocidadeAtual++;
            console.log(this.velocidadeAtual);
        }
        else {
            console.log("Imposs\u00EDvel acelerar");
        }
    };
    carro.prototype.frearCarro = function () {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual--;
            console.log(this.velocidadeAtual);
        }
        else {
            console.log("O carro j\u00E1 esta parado");
        }
    };
    return carro;
}());
var carro1 = new carro(10, 100, 0);
carro1.aceleraCarro();
carro1.aceleraCarro();
carro1.aceleraCarro();
carro1.frearCarro();
carro1.frearCarro();
carro1.frearCarro();
carro1.frearCarro();
carro1.frearCarro();
carro1.frearCarro();
