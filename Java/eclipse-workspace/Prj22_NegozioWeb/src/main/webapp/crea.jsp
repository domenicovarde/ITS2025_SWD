<!DOCTYPE html>
<%@page import="model.Taglia"%>
<%@page import="model.Colore"%>
<html>
<head>
<meta charset="UTF-8">
<title>Mia Maglietta</title>
<link
  rel="stylesheet"
  href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
>
</head>
<body>

	<div class="container">
	
		<h1>Mia Maglietta web</h1>
		<p>Crea la tua tshirt personalizzata in pochi semplici passaggi</p>
	
		<form action="" method="post">
		
			<select name="colore">
				<option>Scegli il colore</option>
				<% for (Colore colore : (Colore[]) request.getAttribute("colori")){ %>
						
						<option><%= colore %></option>
						
				<% } %>
			</select>

			<select name="taglia">
				<option>Scegli la taglia</option>
				<% for (Taglia taglia : (Taglia[]) request.getAttribute("taglie")){ %>
						
						<option><%= taglia %></option>
						
				<% } %>
			</select>
			
			<input type="text" name="logoName" placeholder="Scrivi nome logo">

			<input type="file" name="imgLogo">
			
			<button>Crea</button>
		
		</form>
	
	
	</div>

</body>
</html>