<%-- 
    Document   : agregaHotel
    Created on : 12-06-2015, 11:39:56 PM
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
    <link rel="icon" type="image/png" href="/Imagenes/city-hotel-icon.png"/>
<title>Agrega Un Hotel</title>
    
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <br>
     <div class="container">
    <div class="panel panel-primary">
          <div class="panel-heading">Agrega Un Hotel</div>
          <div class="panel-body">               
     <form>
     <div>       
        <br><br><input name="nombre" type="text" class="form-control" placeholder="Nombre Del Hotel   " id="nombre">
    <br><br><input name="longitud" type="text" class="form-control" placeholder="Longitud" id="longitud">
    <br><br><input name="latitud" type="text" class="form-control" placeholder="Latitud" id="latitud">    
    <br><br><textarea name="mision"  class="form-control" placeholder="Mision" id="mision"></textarea>    
    <br><br><textarea name="vision"  class="form-control" placeholder="Vision" id="vision"></textarea>
    <br><br><textarea name="valores"  class="form-control" placeholder="Valores" id="valores"></textarea>        
    <br><div  class="panel-footer">
     <button data-toggle="modal" data-target="#myModal"  id="btnCancelar" type="button" class="btn btn-danger" >Cancelar</button>        
     <button name="btnHotel" type="submit" id="btnGuardar" class="btn btn-primary" data-toggle="tooltip" data-placement="right" title="Click aquí para guardar la información">Guardar</button>    
    </div>
        </div>       
     </form>
      
    <%
    if (request.getParameter("btnHotel")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
        PreparedStatement a = db.conexion.prepareStatement("{call agregahotel(?,?,?,?,?,?)}");    
        a.setString(1, request.getParameter("nombre"));
        a.setString(2, request.getParameter("longitud"));
        a.setString(3, request.getParameter("latitud"));
        a.setString(4, request.getParameter("mision"));
        a.setString(5, request.getParameter("vision"));
        a.setString(6, request.getParameter("valores"));
       int aservicio = a.executeUpdate();
       if (aservicio >0){
       session.setAttribute("alerta", "5");
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
