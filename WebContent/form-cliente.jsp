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

    <title>Hello, world!</title>
  </head>

<body>

<jsp:include page="includes/menu.jsp"></jsp:include>

<div class="container">
<h1> Cadastro de Cliente</h1>

<form method="post" action="CadastrarCliente">
            <h1>Cadastro</h1>
			<hr></hr>
			

            <div class="boxName form-group">
                <label>Nome</label>
                <input class="form-control" type="text" placeholder="Insira seu nome completo"  name="nome">
            </div>
        
            <div class="boxCpf form-group">
                <label>CPF</label>
                <input class="form-control" type="text" name="cpf" placeholder="Insira seu cpf" maxlength="14"  onkeypress="this.value = FormatarCpf(event)" onpaste="return false;" required="" >   
            </div>
			<div class="boxNasc form-group">
                <label>Nascimento</label>
                <input class="form-control" type="text" name="nascimento" placeholder="Insira a data de nascimento" maxlength="10"  onkeypress="this.value = FormatarNasc(event)" onpaste="return false;" required="" >   
            </div>
                        <div class=" form-group">
                <label>Idade</label>
                <input class="form-control" type="text" placeholder="Insira seu nome completo"  name="idade">
            </div>
				<div class="row">
    <div class="col-md-2 boxTelefone">
		<label>DDD</label>
      <input class="form-control" type="text" name="ddd" placeholder="DDD" maxlength="3"  onkeypress="this.value = FormatarDDD(event)" onpaste="return false;" required="" >
    </div>
    <div class="col-md-10">
     		<label>Telefone</label>
      <input class="form-control" type="text" name="telefone" placeholder="Insira seu Telefone" maxlength="15"  onkeypress="this.value = FormatarTele(event)" onpaste="return false;" required="" >
    </div>

  </div>

			<div class="boxCep form-group">
                <label>Cep</label>
                <input class="form-control" type="text" name="cep" placeholder="Insira seu cep" maxlength="9"  onkeypress="this.value = FormatarCep(event)" onpaste="return false;" required="" >   
            </div>
							<div class="boxEmail form-group">
                <label>Email</label>
                <input name="email" class="form-control" type="email" placeholder="Insira o seu email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" >
            </div>
			<script>
                function verificarNumero(e){
					if(e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57 )){
						return false;
					}
				}
				$(document).ready(function(){
					$("#cep").keypress(verificarNumero);
				});

				function FormatarCep(evt){
					vr = (navigator.appName == 'Netascape') ?evt.target.value : evt.srcElement.value;
						if(vr.length == 5) vr = vr +"-";
                       
                        
                        
                                                    

						return vr;
				}
            
            </script>
            <script>
                function verificarNumero(e){
					if(e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57 )){
						return false;
					}
				}
				$(document).ready(function(){
					$("#cpf").keypress(verificarNumero);
				});

				function FormatarNasc(evt){
					vr = (navigator.appName == 'Netascape') ?evt.target.value : evt.srcElement.value;
						if(vr.length == 2) vr = vr +"/";
                        if(vr.length == 5) vr = vr +"/";
                        
                        
                                                    

						return vr;
				}
            
            </script>
            <script>
                function verificarNumero(e){
					if(e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57 )){
						return false;
					}
				}
				$(document).ready(function(){
					$("#cpf").keypress(verificarNumero);
				});

				function FormatarCpf(evt){
					vr = (navigator.appName == 'Netascape') ?evt.target.value : evt.srcElement.value;
						if(vr.length == 3) vr = vr +".";
                        if(vr.length == 7) vr = vr +".";
                        if(vr.length == 11) vr = vr +"-";
                        
                                                    

						return vr;
				}
            
            </script>
			<script>
                function verificarNumero(e){
					if(e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57 )){
						return false;
					}
				}
				$(document).ready(function(){
					$("#tele").keypress(verificarNumero);
				});

				function FormatarTele(evt){
					vr = (navigator.appName == 'Netascape') ?evt.target.value : evt.srcElement.value;
					
						if(vr.length == 0) vr = vr +"(";
                       if(vr.length == 3) vr = vr +")";
					if(vr.length == 4) vr = vr +" ";
					if(vr.length == 10) vr = vr +"-";
                      
                        
                                                    

						return vr;
				}
								function FormatarDDD(evt){
					vr = (navigator.appName == 'Netascape') ?evt.target.value : evt.srcElement.value;
					
						if(vr.length == 0) vr = vr +"+";
            
                      
                        
                                                    

						return vr;
				}
				
				

            
            </script>
            
           

				
				<div class="row">
    <div class="col-md-3">
		 <div class=" form-group">
                <label>Login</label>
                <input class="form-control" type="text" placeholder="Insira seu Login"  name="login">
            </div>

    </div>
    <div class="col-md-3">
   <div class=" form-group">
                <label>Senha</label>
                <input class="form-control" type="text" placeholder="Insira sua Senha"  name="senha">
            </div>
    </div>

  </div>
	           

				

                <input type="submit"  class="btn btn-primary float-right" name="cadastrar" value="enviar">
			

        </form>
${servMensagem}

</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>