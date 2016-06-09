<%@ page language="java" %>
<%@ page import = "dl.Historico"%> 
<%@ page import = "bl.ConsultaBBDD"%> 
<%@ page import = "java.util.LinkedList"%> 
<html>
<head>
<title>Historico</title>
<script type="text/javascript">
function enviar(pagina){
	document.botones.action = pagina;
	document.botones.submit();

	}
</script>
</head>
<body>
<h1>Historico de Fronius</h1>
<table border="1">
<tr>
<td>id</td>
<td>Energia del día</td>
<td>Frecuencia</td>
<td>I AC</td>
<td>I DC</td>
<td>Temperatura del módulo</td>
<td>V AC</td>
<td>V DC</td>
</tr>
<%
LinkedList<Historico> lista = ConsultaBBDD.getDatosHistorico();
for (int i=0;i<lista.size();i++)
{
   out.println("<tr>");
   out.println("<td>"+lista.get(i).getIdHistorico()+"</td>");
   out.println("<td>"+lista.get(i).getDay_Energy()+"</td>");
   out.println("<td>"+lista.get(i).getFrecuencia()+"</td>");
   out.println("<td>"+lista.get(i).getIAc()+"</td>");
   out.println("<td>"+lista.get(i).getIDc()+"</td>");
   out.println("<td>"+lista.get(i).getTemperatura_modulo()+"</td>");
   out.println("<td>"+lista.get(i).getVAc()+"</td>");
   out.println("<td>"+lista.get(i).getVDc()+"</td>");
   out.println("</tr>");
}
%>
</table>
<form name="botones" action="" method="post">
<input type="button" value="Principal" onClick="enviar('index.jsp')">
<input type="button" value="Inverter" onClick="enviar('inverter.jsp')">
<input type="button" value="Sensor" onClick="enviar('sensor.jsp')">
</form>
</body>
</html>
