<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Atualiza��o</title>
  </head>

<body>

<jsp:include page="includes/menu.jsp"></jsp:include>

<div class="container">
<h1> Atualiza��o de Funcionario</h1>


<form method="post" action ="VisualizarFuncionario">
 
 <div class="form-group">
 <label>Nome:</label>
 <input name="nome" value="${f.nomeFuncionario}" type="text" class="form-control" /> 
 </div>
 
 <div class="form-group">
 <label>Idade:</label>
 <input name="email" value="${f.idadeFuncionario}" type="text" class="form-control" /> 
 </div>
 
 <div class="form-group">
 <label>Data Admiss�o:</label>
 <input name="email" value="${f.Dtadmissao}" type="text" class="form-control" /> 
 </div>
 
  <div class="form-group">
 <label>Salario:</label>
 <input name="car" value="${f.Salario}" type="text" class="form-control" /> 
 </div>
 
 <input type="submit" value="Atualizar" />

</form>
${servMensagem}

</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>