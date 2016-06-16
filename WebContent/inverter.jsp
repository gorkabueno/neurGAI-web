<%@ page language="java" %>
<%@ page import = "dl.Inverter"%> 
<%@ page import = "bl.ConsultaBBDD"%> 
<%@ page import = "java.util.LinkedList"%> 
<html>
<head>
<title>Inverter</title>
<link href="resources/css/bootstrap-theme.css" rel="stylesheet">
<!-- <link href="/resources/css/bootstrap.min.css" rel="stylesheet"> -->
<link href="resources/css/bootstrap.css" rel="stylesheet">
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
<td>Energia del d�a</td>
<td>Power</td>
<td>Status</td>
<td>Total Energy</td>
<td>Year Energy</td>
</tr>
<%
LinkedList<Inverter> lista = ConsultaBBDD.getDatosInverter();
for (int i=0;i<lista.size();i++)
{
   out.println("<tr>");
   out.println("<td>"+lista.get(i).getIdInverter()+"</td>");
   out.println("<td>"+lista.get(i).getDay_Energy()+"</td>");
   out.println("<td>"+lista.get(i).getPower()+"</td>");
   out.println("<td>"+lista.get(i).getStatus()+"</td>");
   out.println("<td>"+lista.get(i).getTOTAL_ENERGY()+"</td>");
   out.println("<td>"+lista.get(i).getYear_Energy()+"</td>");
   out.println("</tr>");
}
%>
</table>
<form name="botones" action="" method="post">
<input type="button" value="Principal" onClick="enviar('index.jsp')">
<input type="button" value="Historico" onClick="enviar('historico.jsp')">
<input type="button" value="Sensor" onClick="enviar('sensor.jsp')">
</form>
</body>
</html>
