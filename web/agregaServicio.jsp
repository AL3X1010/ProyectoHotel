<%-- 
    Document   : agregaServicio
    Created on : 12-06-2015, 02:12:43 PM
    Author     : allan
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DBA"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<title>Agrega Un Servicio</title>
    
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <br>
     <div class="container">
    <div class="panel panel-primary">
          <div class="panel-heading">Agrega Un Servicio</div>
          <div class="panel-body">     
    <div> 
        
        <form method="post" action="agregaServicio.jsp">
            <br><br><input name="nombre" type="text" class="form-control" placeholder="Nombre Del Servicio   " id="nombre">     
        <br><br><input name="descripcion" type="text" class="form-control" placeholder="Descripcion   " id="descripcion"> 
        <br><br><input name="precio" type="number" step="any" min="1" class="form-control" placeholder="Precio   " id="precio">    
        
        <br><div  class="panel-footer">
        <button data-toggle="modal" data-target="#myModal"  id="btnCancelar" type="button" class="btn btn-danger" >Cancelar</button>        
        <button name="btnServicio" type="submit" id="btnGuardar" class="btn btn-primary" data-toggle="tooltip" data-placement="right" title="Click aquí para guardar la información">Guardar</button>    
        </div>
        </form>
    <%
    if (request.getParameter("btnServicio")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
        PreparedStatement a = db.conexion.prepareStatement("{call agregaservicio(?,?,?)}");    
        a.setString(1, request.getParameter("nombre"));
        a.setString(2, request.getParameter("descripcion"));
        a.setString(3, request.getParameter("precio"));
        
       int aservicio = a.executeUpdate();
       if (aservicio >0){
       session.setAttribute("alerta", "1");
       response.sendRedirect("index2.jsp");
       }
    }catch(Exception e){
    }
    }
    %>
        </div>
    </div>  
     </div>  
    </div>    
    </body>
    
    
</html>
