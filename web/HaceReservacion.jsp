<%-- 
    Document   : Reservacion
    Created on : 12-11-2015, 02:32:46 PM
    Author     : allan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="database.DBA"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/Imagenes/city-hotel-icon.png"/>
<title>Agrega Tu Reservacion</title>
    
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
         <%
             session.setAttribute("id_usuarionormal", "1");
         try{
             String id_reservacion="";
        DBA db = new DBA ("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
        db.conectar();
        String quer ="SELECT ah.id_habitacion, r.id_reservacion FROM Ahabitacion ah, reservacion r,"+
			"Areservacion_habitacion ar "+
                "WHERE  ((r.inifecha BETWEEN '"+request.getParameter("fechaini")+"' AND '"+request.getParameter("fechafin") +"') AND "+
		"(r.id_reservacion = ar.id_reservacion AND "+
			"ar.id_habitacion = ah.id_habitacion) AND ah.estado = 0 AND ah.id_habitacion="+request.getParameter("id_habitacion")+") "+
	  "OR ((r.finfecha BETWEEN '"+request.getParameter("fechaini")+"' AND '"+request.getParameter("fechafin") +"') AND "+
		"(r.id_reservacion = ar.id_reservacion AND "+
			"ar.id_habitacion = ah.id_habitacion) AND ah.estado = 0 AND ah.id_habitacion="+request.getParameter("id_habitacion")+") ;";
            db.query.execute(quer);
            ResultSet rs = db.query.getResultSet();
             if(rs.next()){
             out.print("<script>alert('Reservacion no creada, habitacion reservada');"
                     + "window.location.href='Reservacion.jsp'"
                     + "</script>");
             }else{
             quer = "INSERT INTO reservacion (inifecha, finfecha, id_usuarionormal) values ('"+request.getParameter("fechaini")+"','"+request.getParameter("fechafin")+"',"+session.getAttribute("id_usuarionormal")+")";
             int devuelve = db.query.executeUpdate(quer);
             if(devuelve>0){
                 ResultSet nrs = db.query.executeQuery("select @@identity");
                 if(nrs.next()){
                id_reservacion= nrs.getString(1);
                 quer = "INSERT INTO Areservacion_habitacion values ("+request.getParameter("id_habitacion")+", "+id_reservacion+")"; 
                 db.query.execute(quer);
                 //out.print("<script>alert('Codigo Reservacion : "+nrs.getString(1)+"');</script>");
                 ResultSet tablefull = db.query.getResultSet();
                 if(tablefull.next()){
                 quer="SELECT ah.precio, ah.tipo, re.inifecha, re.finfecha, ah.descuento FROM Ahabitacion ah, reservacion re, "
                         + "Areservacion_habitacion arh WHERE re.id_reservacion = arh.id_reservacion and arh.id_habitacion="
                         + "ah.id_habitacion and re.id_reservacion="+id_reservacion+";";
                 ResultSet rfull = db.query.executeQuery(quer);
                 if(rfull.next()){
                 %>
                 
    <div class="container">
    <div class="jumbotron"  >     
    <div class="container marketing">
        <div class="row">
       
            <table class="table" style="color:black;" >
               <thead>
                        <tr>
                            <th>
                               Numero De Reservacion
                            </th>
                            <th>
                               Numero De Habitacion
                            </th>
                            <th>
                               Tipo De Habitacion
                            </th>
                            <th>
                               Fecha Inicial
                            </th>
                            <th>
                               Fecha Final
                            </th>
                            <th>
                             Precio
                            </th>
                            <th>
                             Descuento
                            </th>
                            
                        </tr>
                    </thead>   
                    <tbody>
                        <tr>
                            <td><%= id_reservacion %></td> 
                            <td><%=request.getParameter("id_habitacion")%></td>      
                            <td><%= rfull.getString(2) %></td> 
                            <td><%= rfull.getString(3) %></td> 
                            <td><%= rfull.getString(4) %></td> 
                            <td><%= rfull.getString(1) %></td> 
                            <td><%= rfull.getString(5) %></td> 
                        </tr>
                        
                    </tbody>
            </table> 
        </div>
      </div>
     </div>  
    </div>
                 <%
                 }
                 
                 }
                          }
             }
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         %>
         
      <div class="container">
          
          <nav class="navbar navbar-inverse navbar-fixed-top">
        <br>
      
      <div class="container">
      <%
      if(session.getAttribute("id_usuarionormal")!=null){
      
      %>
      <div class="container">   
        <br>
          <center>  
    <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-home"></span>
        <a href="indexUsuario.jsp" >Inicio</a>
    </button>    
    <button  type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-th-large"></span>
     <a href="Reservacion.jsp">Hacer Reservacion</a>    
    </button>           
       
    <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-map-marker"></span>
        <a href="Ubicanos.jsp" >Ubicanos</a>
    </button>
     
    <button  type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-user"></span>
        <a href="editaUsuario.jsp" >Editar Usuario</a>
    </button>
              
     <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-off"></span>
        <a href="index.jsp" >Cerrar Sesion</a>
    </button>     
             </center> 
  </div>
      <%
      }
      if(session.getAttribute("id_usuarioadmin")!=null){    
      %>
      <div class="container">
          
    <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-home"></span>
        <a href="indexUsuario.jsp" >Inicio</a>
    </button>    
 
    <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-cog"></span>
        <a href="EditarInfoHotel.jsp">Configuracion De Hotel</a>
    </button>
    
    <button  type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-th-large"></span>
     <a href="Reservacion.jsp">Hacer Reservacion</a>    
    </button>    
 
    <button  type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-ok-circle"></span>
        <a>Aceptar Reservacion</a>
    </button>
        
 
    <button  type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-plus"></span>
        <a href="agregaHabitacion.jsp">Agregar Habitacion</a>
    </button>
        
    <button  type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-star"></span>
        <a href="agregaServicio.jsp" >Agregar Servicio</a>
    </button>    
     
    <button  type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-user"></span>
        <a href="agregaAdmin.jsp" >Agrega Admin</a>
    </button> 
        
    <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-map-marker"></span>
        <a href="Ubicanos.jsp" >Ubicanos</a>
    </button>
        
     <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-off"></span>
        <a href="index.jsp" >Cerrar Sesion</a>
    </button>
      </div>
      <%    
      }
      
      if(session.getAttribute("id_gerente")!=null){
      %>
      <div class="container">
      <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-stats"></span>
        <a>Reporteria</a>
    </button>
 
     <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-off"></span>
        <a href="index.jsp" >Cerrar Sesion</a>
    </button>
          </div>
      <%
      }
      %> 
      
</div>                  
          </button>
        </div>
    <!--/.navbar-collapse -->
      </div>
    <br>
            
    </nav>
      </div>
      
      
    <hr class="featurette-divider">
    
    <div class="page-header">
        <br>
        <center>
    <h1>Hotel Manchester</h1>
        </center>
    </div>  



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>   
</html>
