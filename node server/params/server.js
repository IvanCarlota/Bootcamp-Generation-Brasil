const express = require('express');

const app = express();

app.get('/users', (req, res) => {
    const {nome} =req.query; //capturando dados através da query no browser exemplo: ?nome=IvanJuniorCarlota .
    res.json({mensagem: `${nome}  `})
});
app.get('/contato/:id', (req, res) =>{
    const {id} =req.params; ////capturando dados através de parametros na url do browser exemplo: http://localhost:3000/contato/10 onde pegamos o id de número 10 .
    res.json({id: `${id}  `})
});

app.listen(3000);