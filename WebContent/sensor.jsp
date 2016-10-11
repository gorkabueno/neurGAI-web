<%@ page language="java" %>
<%@ page import = "dl.Sensor"%> 
<%@ page import = "bl.ConsultaBBDD"%> 
<%@ page import = "java.util.LinkedList"%> 
<html>
<head>
<title>Sensor</title>
<link href="/resources/css/bootstrap-theme.css" rel="stylesheet">
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap.css" rel="stylesheet">
<script type="text/javascript">
function enviar(pagina){
	document.botones.action = pagina;
	document.botones.submit();

	}
</script>

</head>
<body>
<h1>Sensor de Fronius</h1>
<table border="1">
<tr>
<td>id</td>
<td>Radiación solar</td>
<td>Temperatura Ambiente</td>
<td>Temperatura módulo</td>
<td>Viento</td>
</tr>
<%
LinkedList<Sensor> lista = ConsultaBBDD.getDatosSensor();
for (int i=0;i<lista.size();i++)
{
   out.println("<tr>");
   out.println("<td>"+lista.get(i).getIdSensor()+"</td>");
   out.println("<td>"+lista.get(i).getRadiacion_solar()+"</td>");
   out.println("<td>"+lista.get(i).getTemperatura_ambiente()+"</td>");
   out.println("<td>"+lista.get(i).getTemperatura_modulo()+"</td>");
   out.println("<td>"+lista.get(i).getViento()+"</td>");
   out.println("</tr>");
}
%>
</table>
<form name="botones" action="" method="post">
<input type="button" value="Principal" onClick="enviar('index.jsp')">
<input type="button" value="Inverter" onClick="enviar('inverter.jsp')">
<input type="button" value="Sensor" onClick="enviar('sensor.jsp')">
</form>
<form action="${pageContext.request.contextPath}/ServletPeticion" method="get" >
<input type="submit" name="button1" value="REFRESH" onclick="window.location.reload()" />
</form>
</body>
</html>
