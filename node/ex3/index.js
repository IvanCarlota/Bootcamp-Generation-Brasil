//criando um servidor

var http=require("http") // carregando o módulo http do node

http.createServer(function(requisicao, resposta){
    resposta.end("<h1 style='color: blue'> Bem vindo ao meu site! </h1>")
}).listen(3000);

// com isso eu crio um servidor

console.log("Meu servidor esta rodando!")

//posso subir este código para um servidor e todo mundo poderia executar este código