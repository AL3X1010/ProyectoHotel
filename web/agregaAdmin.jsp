<%-- 
    Document   : agregaAdmin
    Created on : 12-06-2015, 06:49:03 PM
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
    <title>Registro De Usuario</title>
    
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    

    </head>
    <body>
        <br>
     <div class="container">
    <div class="panel panel-primary">
          <div class="panel-heading">Registro Usuario Administrador</div>
          <div class="panel-body">     
      
    
        <form method="post" action="agregaAdmin.jsp">
       <div>      
        <br><br><input name="nombre" type="text" class="form-control" placeholder="Nombre" id="nombre">
    <br><br><input name="apellido" type="text" class="form-control" placeholder="Apellido" id="apellido"> 
    <br><input name="email" type="text" class="form-control" placeholder="Email" id="email">   
    <br><br><textarea  name="descripcion" class="form-control" placeholder="Direccion" id="descripcion"></textarea>    
    <br><br><input name="fechanaci" type="date" class="form-control" placeholder="Fecha De Nacimiento A�o/Mes/Dia" id="fechanaci">
    <br><br><input name="pais" type="text" class="form-control" placeholder="Pais" id="pais">
        <div  class="panel-footer">
     <button data-toggle="modal" data-target="#myModal"  id="btnCancelar" type="button" class="btn btn-danger" >Cancelar</button>        
    <button name="btnAdmin" type="submit" id="btnGuardar" class="btn btn-primary" data-toggle="tooltip" data-placement="right" title="Click aqu� para guardar la informaci�n">Guardar</button>    
    </div>    
        </div>    
        </form>
              
           <%
    if (request.getParameter("btnAdmin")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
        PreparedStatement a = db.conexion.prepareStatement("{call registroadmin(?,?,?,?,?,?,?)}");    
        a.setString(1, request.getParameter("nombre"));
        a.setString(2, request.getParameter("apellido"));
        a.setString(3, request.getParameter("email"));
        a.setString(4, request.getParameter("apellido")+ ""+(int)(1+ Math.random()*1000) );
        a.setString(5, request.getParameter("descripcion"));
        a.setString(6, request.getParameter("fechanaci"));
        a.setString(7, request.getParameter("pais"));
        
       int aservicio = a.executeUpdate();
       if (aservicio >0){
       session.setAttribute("alerta", "4");
       response.sendRedirect("index2.jsp");
       }
    }catch(Exception e){
    }
    }
    %>     
     
    </div>  
     </div>  
    </div>    
    </body>
    
    
</html>
