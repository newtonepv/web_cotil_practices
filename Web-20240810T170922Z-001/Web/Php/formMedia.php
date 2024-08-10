<?= 


$msgN1="";
$msgN1=""; 
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Cálculo de Média</title>
</head>
<body>
	<h1>Cálculo de Média</h1>

	<form method="post">
		Nota 1:<br>
		<input type="text" name="nota1"><br>
		<span id="warning"><small><?= $msgN1; ?></small></span>

		<br><br>

		Nota 2:<br>
		<input type="text" name="nota2">
		<span id="warning"><small><?= $msgN2; ?></small></span>

		<br><br>

		<input type="submit" value="calcular">
		
	</form>
</body>
</html>

<?php
  if ($_SERVER["REQUEST_METHOD"] === 'POST'){

	function calcMedia($n1, $n2){
		$media = ($n1+$n2)/2;
		return $media;
	$n1 = $_POST["nota1"];
	$n2 = $_POST["nota2"];

	if ((trim($n1) == "" ) || (trim($n2) =="" )){
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
	}
}else(){
	function calcMedia($n1, $n2){
		$media = ($n1+$n2)/2;
		return $media;
	$n1 = $_GET["nota1"];
	$n2 = $_GET["nota2"];

	if ((trim($n1) == "" ) || (trim($n2) =="" )){
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
}
}
?>

