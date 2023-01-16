<%@page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="./css/style.css" media="all" />
</head>
<body>
	<section class="section-login">
		<form action="/webapp-cookie/login" class="section-login__form" method="POST">
			<fieldset class="section-login__fielset">
				<h2 class="section-login__title"></h2>
				<div class="section-login__row">
					<label for="username" class="section-login__label"></label>
					<input type="text" class="section-login__input" name="username" />
				</div>
				<div class="section-login__row">
					<label for="password" class="section-login__label"></label>
					<input type="password" class="section-login__input" name="password"/>
				</div>
				<div class="section-login__buttons">
					<button class="section-login__send" type="submit">Ingresar</button>
				</div>
			</fieldset>
		</form>
	</section>
	<script src="./js/script.js" type="module" ></script>
</body>
</html>