//função paa mudar texto para maiusculo
function maiusculo(nome) {
    return nome.toUpperCase()
}

//função paa mudar texto para minusculo
function minusculo(nome) {
    return nome.toLowerCase()
}

//função paa contar caracteres

function contadorDePalavras(palava) {
    var total = palava.length
    return "Total de letras: " + total
}


//para que estas fiquem acessíveis para outro código
//teremos que exportar as funções

module.exports = {
    maiusculo, 
    minusculo, 
    contadorDePalavras
}