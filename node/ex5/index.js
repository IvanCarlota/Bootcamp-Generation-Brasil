//importando as funções

var funcoes =  require("./funcoes")
var n1 = 2
var n2 = 5

let express = require('express') // importando o módulo express
let app = express() // instanciou o express
let port = 3000 //porta em que ele subirá
app.get('/', (req, res) => {
    res.send('<h1>Calculadora</h1>' + "Soma = "+funcoes.soma(n1, n2))
})

//rota principal
//send = função do express
//end = função do http

app.listen(port, () => {
  console.log(`Servidor rodando em http://localhost:${port}`)
  console.log('Para derrubar o servidor: ctrl + c');
})




// var soma =funcoes.soma(2 , 5)
// console.log("A soma é: "+soma) 

// var subtracao =funcoes.subtracao(2 , 5)
// console.log("A subtração é: " +subtracao)

// var multiplicacao =funcoes.multiplicacao(2 , 5)
// console.log("A multiplicação é: " +multiplicacao)

// var divisao =funcoes.divisao(2 , 5)
// console.log("A multiplicação é: " +divisao)