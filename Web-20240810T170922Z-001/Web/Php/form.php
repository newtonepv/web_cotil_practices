<?php
	function calcMedia($n1, $n2){
		$media = ($n1+$n2)/2;
		return $media;
	}

	$n1 = $_GET["nota1"];
	$n2 = $_GET["nota2"];

	if (trim($n1 == "") ) || (trim($n2 =="") ){
		echo "<span id='warning'>Informe as duas notas!</span>";
	} else{
		$media = calcMedia($n1,$n2);

		echo "Média = " . $media . "<br>";

		if ($media >= 6.0){
			echo "<span id='aprovado'>APROVADO!</span>";
		} else{
			echo "<span id='reprovado'>REPROVADO!</span>";
		}
	}
?>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Média</title>
	<style type="text/css"></style>
</head>
<body>

</body>
</html>