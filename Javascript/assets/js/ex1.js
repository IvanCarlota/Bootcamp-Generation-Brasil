// Pegar elemento pelo id

var textoH1 = document.getElementById("titulo")
alert(textoH1.textContent)
textoH1.className="vermelho"
textoH1.textContent= "Texto alterado pelo JS"

// Pegar elemento pelo nome com indice

var conteudoH2 = document.getElementsByTagName("h2")[0]
alert(conteudoH2.textContent)

// Pegar elemento pelo nome com indice

var conteudoLi = document.getElementsByTagName("li")[3]
alert(conteudoLi.textContent)


var textoClasseVerde = document.getElementsByClassName("verde")

// cria-se um array 
// o array tem um tamanho -> propriedade length

for (var posicao=0; posicao<textoClasseVerde.length; posicao++)
{
    alert(textoClasseVerde[posicao].textContent)
}

var textoLiVerde = document.querySelectorAll("li.verde")
for (var posicao=0; posicao<textoLiVerde.length; posicao++)
{
    alert("Conteúdo pego querySelector:  " + textoLiVerde[posicao].textContent)
}