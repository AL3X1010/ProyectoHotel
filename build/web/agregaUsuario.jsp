<%-- 
    Document   : agregaUsuario
    Created on : 12-06-2015, 04:03:21 PM
    Author     : allan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="mpq.EnviadorMail"%>
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
          <div class="panel-heading">Registro Usuario, Favor Llene TODOS Los Campos</div>
          <div class="panel-body">     
      
    
        <form method="post" action="agregaUsuario.jsp">
       <div>      
        <br><br><input name="nombre" type="text" class="form-control" placeholder="Nombre" id="nombre">
    <br><br><input name="apellido" type="text" class="form-control" placeholder="Apellido" id="apellido"> 
    <br><input name="email" type="text" class="form-control" placeholder="Email" id="email">   
    <br><br><textarea  name="descripcion" class="form-control" placeholder="Direccion" id="descripcion"></textarea>    
    <br><br><input name="fechanaci" type="date" class="form-control" placeholder="Fecha De Nacimiento Año/Mes/Dia" id="fechanaci">
    <br><br><input name="pais" type="text" class="form-control" placeholder="Pais" id="pais">
        <div  class="panel-footer">
     <button data-toggle="modal" data-target="#myModal"  id="btnCancelar" type="button" class="btn btn-danger" >Cancelar</button>        
    <button name="btnUsuario" type="submit" id="btnGuardar" class="btn btn-primary" data-toggle="tooltip" data-placement="right" title="Click aquí para guardar la información">Guardar</button>    
    </div>    
        </div>    
        </form>
              
           <%
    if (request.getParameter("btnUsuario")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
        PreparedStatement a = db.conexion.prepareStatement("{call registronormal(?,?,?,?,?,?,?)}");    
        a.setString(1, request.getParameter("nombre"));
        a.setString(2, request.getParameter("apellido"));
        a.setString(3, request.getParameter("email"));
        a.setString(4, request.getParameter("apellido")+ ""+(int)(1+ Math.random()*1000) );
        a.setString(5, request.getParameter("descripcion"));
        a.setString(6, request.getParameter("fechanaci"));
        a.setString(7, request.getParameter("pais"));
        
       int aservicio = a.executeUpdate();
       if (aservicio >0){
       String infomail ="SELECT  ussername, pass from usuarionormal where email='"+request.getParameter("email")+"'";
            db.query.execute(infomail);
            ResultSet rsmail = db.query.getResultSet(); 
        if(rsmail.next()){    
       EnviadorMail EnviadorMail = new EnviadorMail(request.getParameter("email"),"Bienvenido", "gracias '"+rsmail.getString(1)+"' por registrarte en nuestra pagina tu contraseña es'"+rsmail.getString(2)+"'\nClick en el siguiente enlace para loguearte\nhttp://localhost:8080/PHotel/index.jsp");
        } 
        response.sendRedirect("index.jsp");
       }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    %>     
     
    </div>  
     </div>  
    </div>    
    </body>
    
    
</html>
