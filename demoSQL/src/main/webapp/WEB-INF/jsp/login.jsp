<html>
<head>
<title>Login ou creation du compte</title>
</head>
	<h1>Login</h1>
    <font color="red">${errorMessage}</font>
    <form method="post">
        Name : <input type="text" name="id" />
        Password : <input type="password" name="password" /> 
        <input type="submit" />
        <button type="submit" id="btn-login">Login</button>
        <a href="creerCompte" class="btn btn-default">Creer un compte</a>
    </form>
</body>

</html>