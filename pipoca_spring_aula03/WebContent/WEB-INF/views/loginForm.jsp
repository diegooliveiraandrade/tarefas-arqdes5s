<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="">
		

		<div class="container">
			<label for="usuario"><b>Usuario</b></label> <input type="text"
				placeholder="USUARIO" name="usuario" required> <label
				for="senha"><b>Senha</b></label> <input type="password"
				placeholder="SENHA" name="senha" required>

			<button type="submit">ENTRAR</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>

</body>
</html>