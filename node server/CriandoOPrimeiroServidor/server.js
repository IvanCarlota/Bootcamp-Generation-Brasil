const express = require('express');

const app = express();

app.get('/',(req, res)=>{
    res.send('Hello World');
});

app.get('/contato',(req, res)=>{
    res.send('Bem vindo à página de Contato');
});

app.listen(3000);