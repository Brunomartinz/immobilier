function alterarStatus(){
    
    console.log("até aqui ok")
    console.log(arguments[0]);
    if(arguments[5] == "ativo"){
        var prod = {
            id: arguments[0],
            nome: arguments[1],
            descricao: arguments[2],
            price: arguments[3],
            imgUrl: arguments[4],
            status: "inativo",
            avaliacao: arguments[6],
            qtd: arguments[7],
            categorias: []

        }
    }else{
        var prod = {
            id: arguments[0],
            nome: arguments[1],
            descricao: arguments[2],
            price: arguments[3],
            imgUrl: arguments[4],
            status: "ativo",
            avaliacao: arguments[6],
            qtd: arguments[7],
            categorias: []


        }
    }
    console.log(prod);
    $.ajax({
        url: 'http://localhost:8082/produto/editar',
        type: 'post',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {
            $('#target').html(data.msg);
            
        },
        data: JSON.stringify(prod)
    });
    window.location.reload();
}

