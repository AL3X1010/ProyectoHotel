<%-- 
    Document   : agregaHabitacion
    Created on : 12-06-2015, 02:56:20 PM
    Author     : allan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DBA"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<title>Agrega Una Habitacion</title>
    
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <br>
     <div class="container">
    <div class="panel panel-primary">
          <div class="panel-heading">Agrega Una Habitacion</div>
          <div class="panel-body">     
    <div>   
        <form method="post" action="agregaHabitacion.jsp">
            <br><br>
    <%
    try{
        DBA db = new DBA ("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
        db.conectar();
        String quer ="SELECT id_hotel, nombre FROM hotel;";
            db.query.execute(quer);
            ResultSet rs = db.query.getResultSet();   
        if(rs.next()){
        %>
        <br><br><select class="form-control" name="nombrehotel">
            <option value="<%=rs.getString(1) %>"><%=rs.getString(2) %></option>
            <%
            while(rs.next()){
            %>
             <option value="<%=rs.getString(1) %>"><%=rs.getString(2) %></option>
            <%
            }
            %>
        </select> 
    <br><br><select class="form-control" name="tipohabitacion">
        <option value="Normal">Normal</option>
        <option value="Ejecutiva">Ejecutiva</option>
        <option value="VIP">VIP</option>
        </select>    
    <br><br><input name="precio" type="number" step="any" min="1" class="form-control" placeholder="Precio   " id="precio"> 
    <br><br><input name="descuento" type="number" step="any" min="0" max="100" class="form-control" placeholder="Descuento   " id="descuento">    
        
        <br><div  class="panel-footer">
     <button data-toggle="modal" data-target="#myModal"  id="btnCancelar" type="button" class="btn btn-danger" >Cancelar</button>        
     <button name="btnHabitacion" type="submit" id="btnHabitacion" class="btn btn-primary" data-toggle="tooltip" data-placement="right" title="Click aquí para guardar la información">Guardar</button>      
        <%
        }    
    }catch(Exception e){
    }
    %>       
            
        
    </div>      
        </form>
            <%
    if (request.getParameter("btnHabitacion")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
        PreparedStatement a = db.conexion.prepareStatement("{call agregahabitacion(?,?,?,?)}");    
        a.setString(1, request.getParameter("nombrehotel"));  
        a.setString(2, request.getParameter("precio"));
        a.setString(3, request.getParameter("tipohabitacion"));
        a.setString(4, request.getParameter("descuento"));
        
       int aservicio = a.executeUpdate();
       if (aservicio >0){
           db.desconectar();
       session.setAttribute("alerta", "2");
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
