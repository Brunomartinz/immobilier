window.onload = function () {
	// adding data to localstorage
	const attToCartBtn = document.getElementsByClassName('attToCart');
	let produtos = [];
	for(let i=0; i<attToCartBtn.length; i++){
		attToCartBtn[i].addEventListener("click", function (e) {
			if (typeof (Storage) !== 'undefined') {
				const idBanco = document.getElementById("idBanco").textContent;
				const nomeBanco = document.getElementById("nomeBanco").textContent;
				const descricaoBanco = document.getElementById("descricaoBanco").textContent;
				const precoBanco = document.getElementById("precoBanco").textContent;
				const imgURLBanco = document.getElementById("imgURLBanco").textContent;
				const statusBanco = document.getElementById("statusBanco").textContent;
				const avaliacaoBanco = document.getElementById("avaliacaoBanco").textContent;
				let produto = {
					id: idBanco,
					nome: nomeBanco,
					descricao: descricaoBanco,
					preco: precoBanco,
					imgUrl: imgURLBanco,
					status: statusBanco,
					avaliacao: avaliacaoBanco,
					qtd: 1
				};

				if (JSON.parse(localStorage.getItem('produtos')) === null) {
					produtos.push(produto);
					localStorage.setItem("produtos", JSON.stringify(produtos));
					window.location.reload();
				} else {
					const localItems = JSON.parse(localStorage.getItem("produtos"));
					localItems.map(data => {
						if (produto.id == data.id) {
							produto.qtd = data.qtd + 1;
						} else {
							produtos.push(data);
						}
					});
					produtos.push(produto);
					localStorage.setItem('produtos', JSON.stringify(produtos));
					window.location.reload();
				}
			} else {
				alert('local storage is not working on your browser');
			}
		});
	}
	// adding data to shopping cart 
	let qtd = 0;
	

	//adding cartbox data in table
	const cardBoxTable = document.querySelector('#div-produtos');
	let tableData = '';

	let spanTotal = document.getElementById('total')
	let spanSubtotal = document.getElementById('subtotal')
	let totalGeral = 0
	if (JSON.parse(localStorage.getItem('produtos')) === null) {
		console.log("vazio")
		tableData += '<div>Você não tem produtos no carrinho</div>'
	} else {
		JSON.parse(localStorage.getItem('produtos')).map(data => {

			JSON.parse(localStorage.getItem('produtos')).map(data => {
				qtd = qtd + data.qtd;
				if(qtd == 0){
					
					
				}
			});
			let total = Number(data.qtd) * Number(data.preco)
			totalGeral += Number(data.qtd) * Number(data.preco)
			tableData += '<div class="flex items-center justify-between hover:bg-gray-100 -mx-8 px-6 py-5"><span class="hidden">' + data.id + '</span><div class="hidden"><span class="hidden">' + data.nome + '</span></div><div class="flex w-2/5"><div class="w-20"><img class="h-24" src="'+data.imgUrl+'" alt=""><div></div></div><div class="flex flex-col justify-between ml-4 flex-grow"><span class="font-bold text-sm">' + data.nome + '</span><span class="text-red-500 text-xs">' + data.avaliacao + '</span><a onclick="Delete(this)" class="cursor-pointer font-semibold hover:text-red-500 text-gray-500 text-xs">Remove</a></div></div><div class="flex justify-center w-1/5"><span onclick="reduzir(this)" class="cursor-pointer mt-1.5"><svg class="fill-current text-gray-600 w-3" viewBox="0 0 448 512"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z" /></svg></span><input class="mx-2 border text-center w-8" type="text" value="' + data.qtd + '"><span onclick="aumentar(this)" class="cursor-pointer mt-1.5"><svg class="fill-current text-gray-600 w-3" viewBox="0 0 448 512"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z" /></svg></span></div><span class="text-center w-1/5 font-semibold text-sm hidden lg:inline-block">' + data.preco + '</span><span class="text-center w-1/5 font-semibold text-sm">' + total + '</span></div>'
		});
	}
	spanSubtotal.innerHTML = 'R$ ' + totalGeral
	spanTotal.innerHTML = 'R$ ' + totalGeral
	localStorage.setItem('total', totalGeral)
	cardBoxTable.innerHTML = tableData;
}