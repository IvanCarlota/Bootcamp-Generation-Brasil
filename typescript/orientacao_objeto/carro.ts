class carro {
    //atributos do carro

    velocidadeAtual: number;
    velocidadeMaxima: number;
    velociadadeMinima: number;

    //método construtor

    constructor(_velocidadeAtual: number, 
                _velocidadeMaxima: number, 
                _velociadadeMinima: number) {

        this.velocidadeAtual = _velocidadeAtual || 0;
        this.velocidadeMaxima = _velocidadeMaxima;
        this.velociadadeMinima = _velociadadeMinima;
    }

    aceleraCarro() {
        if (this.velocidadeAtual >= this.velociadadeMinima && 
            this.velocidadeAtual < this.velocidadeMaxima) {
            this.velocidadeAtual++
            console.log(this.velocidadeAtual)
        } else {
            console.log(`Impossível acelerar`)
        }
    }

    frearCarro() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual--
            console.log(this.velocidadeAtual)
        } else {
            console.log(`O carro já esta parado`)
        }
    }



}


let carro1 = new carro(10, 100, 0)

carro1.aceleraCarro()
carro1.aceleraCarro()
carro1.aceleraCarro()
carro1.frearCarro()
carro1.frearCarro()
carro1.frearCarro()
carro1.frearCarro()
carro1.frearCarro()
carro1.frearCarro()