<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRUD - Controle de alunos</title>

    <style>
        #sucess {
            color: green;
            font-weight: bold;
        }

        #error {
            color: red;
            font-weight: bold;
        }

        #warning {
            color: orange;
            font-weight: bold;
        }

    </style>

</head>

<body>

<a href="index.html">Home</a>
<hr>

<h2>Cadastro de Alunos</h2>
<div>
    <form method="POST" enctype="multipart/form-data">

        RA:<br>
        <input type="text" size="10" name="ra"><br><br>

        Nome:<br>
        <input type="text" size="30" name="nome"><br><br>

        Curso:<br>
        <select name="curso">
            <option></option>
            <option value="Edificações">Edificações</option>
            <option value="Enfermagem">Enfermagem</option>
            <option value="GeoCart">Geodésia e Cartografia</option>
            <option value="Informática">Informática</option>
            <option value="Mecânica">Mecânica</option>
            <option value="Qualidade">Qualidade</option>
        </select><br><br>

        Foto:<br>
        <input type="file" name="foto" accept="image/gif, image/png, image/jpg, image/jpeg"><br><br>

        <input type="submit" value="Cadastrar">

        <hr>

    </form>
</div>

</body>
</html>

<?php

    DEFINE('TAMANHO_MAXIMO', (2 * 1024 * 1024));


	if ($_SERVER["REQUEST_METHOD"] === 'POST') {

        include("conexaoBD.php");

		try {
			$ra = $_POST['ra'];
			$nome = $_POST['nome'];
			$curso = $_POST['curso'];

            $foto = $_FILES['foto'];
            $nomeFoto = $foto['name'];
            $tipoFoto = $foto['type'];
            $tamanhoFoto = $foto['size'];

			if ((trim($ra) == "") || (trim($nome == ""))) {
				echo "<span id='warning'>RA e nome são obrigatórios!</span>";

		} else if(($nomeFoto != "")&&(!preg_match('/^image\/(jpeg|png|jpg|gif)$/', $tipoFoto))){
            echo "<span id='error'>Não é uma imagem válida!</span>";
        


        } else if ($tamanhoFoto > TAMANHO_MAXIMO){
            echo "<span id='error'>A imagem deve possuir no máximo 2 MB</span>";
        }

        else {
			include("conexaoBD.php");
			$stmt = $pdo->prepare("select * from cadastroAluno where ra = :ra");
			$stmt->bindParam(':ra', $ra);
			$stmt->execute();

			$rows = $stmt->rowCount();

			// ... (previous code)

if ($rows <= 0) {
    if ($nomeFoto == "") {
        $fotoBinario = null;
    } else {
        $fotoBinario = file_get_contents($foto['tmp_name']);
    }
    $stmt = $pdo->prepare("insert into cadastroAluno (ra, nome, curso, foto) values(:ra, :nome, :curso, :foto)");
    $stmt->bindParam(':ra', $ra);
    $stmt->bindParam(':curso', $curso);
    $stmt->bindParam(':nome', $nome);
    $stmt->bindParam(':foto', $fotoBinario); // Corrected binding
    $stmt->execute();

    echo "<span id='sucess'>Aluno Cadastrado!</span>";
}

// ... (rest of the code)


		}
	}catch(PDOException $e) {
        echo "Erro ", $e->getMessage();
    }
}

?>