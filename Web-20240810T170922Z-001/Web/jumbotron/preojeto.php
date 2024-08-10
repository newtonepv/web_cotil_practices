<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>CAMAVINGA (yeah cama oh cama oh)</title>

	<style>
		#xpto {
			height: 30vh;
			width: 3px;
			background-color: lightblue;
			border-radius: 50%;
			display: flex;
			flex-direction: row;
			justify-content: center;
			align-items: center;
		}

	</style>
	<script>
		
		function altera_tamanho() {
			h = document.getElementById("xpto");
			var laltura = h.style.height.length;
			vh = h.style.height.substring(0, laltura-2);
			console.log(vh);
			if (parseInt(vh) != 30){ 
				h.style.width = 30 + 'vh';
				h.style.height = 30 + 'vh';
			}
			else{ 
				h.style.width = 60 + 'vh';
				h.style.height = 60 + 'vh';
			}
		
		}

		const intervalo = setInterval(altera_tamanho, 1000);

	</script>
</head>
<body>
	<div style="height:10vh;"></div>
	<div style="display: flex;">
		<span style="width:10vw;"></span>
		<div id="xpto">
			<div style="align-self: center;">a</div>
		</div>
	</div>
</body>
</html>
