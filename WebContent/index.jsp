<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>neurGai</title>
<script type="text/javascript">
function enviar(pagina){
	document.botones.action = pagina;
	document.botones.submit();

	}
</script>
</head>
<body>
<h1>Ongi etorri</h1>
<br>
<h3>Hemen dituzu ikusgai dauden sentsoreen datuak:</h3>
<br>
<form name="botones" action="" method="post">
<input type="button" value="Historico" onClick="enviar('historico.jsp')">
<input type="button" value="Inverter" onClick="enviar('inverter.jsp')">
<input type="button" value="Sensor" onClick="enviar('sensor.jsp')">
</form>
</body>
</html>