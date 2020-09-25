document.getElementById('botao').addEventListener('click', function (e) {
    var nome = document.getElementById("nome").value;

    if (nome.length < 3) {
        /* Tem erro - preventDefault() vai cancelar a ação de subumit, ele previne o acontencimento do evento submit */
        e.preventDefault();
        document.getElementById("nome").style.backgroundColor="red";
    }else{
        document.getElementById("nome").style.backgroundColor="red";
    }

    //FIM DA VALIDAÇÃO DO NOME

    //VALIDAÇÃO DO EMAIL

    var email=document.getElementById("email").value;
    /* o campo email precisa conter: "@" e "." e não pode estar vazio  */
    
    if(email.indexOf("@")==-1 || 
    email.indexOf(".")==-1 || 
    email.length==""){

        e.preventDefault()
        document.getElementById("email").style.borderColor="red"
    }else{
        document.getElementById("email").style.borderColor="green"
    }





})