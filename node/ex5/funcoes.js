//função para soma
function soma(n1, n2) {
    return n1 + n2
}

//função para msubtração
function subtracao(n1, n2) {
    return n1 - n2
}

//função para multiplicação
function multiplicacao(n1, n2) {
    return n1 * n2
}

//função para divisão
function divisao(n1, n2) {

    if(b!=0){
        return n1 / n2
    }else{
        return "Impossível dividir por zero."
    }
    
}


module.exports = {
    soma, 
    subtracao, 
    multiplicacao,
    divisao
}