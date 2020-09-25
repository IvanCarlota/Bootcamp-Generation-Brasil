function mostrar() {
    var nome = document.getElementById("nome").value
    var idade = document.getElementById("idade").value
    var nascimento = document.getElementById("nascimento").value
    var observacao = document.getElementById("observacao").value
    var estados = document.getElementById("estados").value
    var senha = document.getElementById("senha").value
    // document.querySelector('input[name="q1"]:checked').value;
    var sexo = document.querySelector('input[name="sexo"]:checked').value
    console.log("aqui esta a minha variavel " + sexo)

    var almoco = document.getElementById("almoco").checked
    if (almoco == true) {
    almoco = "sim"} 
        else {
            almoco = "não"
            }

   var valetransporte = document.getElementById("valetransporte").checked
    if (valetransporte == true) {
        valetransporte = "sim"} 
        else { 
            valetransporte = "não" 
    }



    alert("Nome: " + nome + "\nIdade: " + idade + " \n Data de nascimento: "
        + nascimento + "\n Oberservação: " + observacao + "\n Estado de origem: "
        + estados + "\n Senha: " + senha + "\n Sexo: " + sexo + "\n Benefícios: " + almoco + "\n Transporte: " + valetransporte)
}