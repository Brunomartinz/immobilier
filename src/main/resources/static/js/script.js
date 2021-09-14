async function getContent() {
	try {
	const response  = await fetch('http://localhost:8082/categorias')
	}
	catch (error) {
		console.error(error)
}
}

getContent()