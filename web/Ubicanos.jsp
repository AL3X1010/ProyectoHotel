<%-- 
    Document   : Ubicanos
    Created on : 12-15-2015, 03:43:07 PM
    Author     : allan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Proyecto Hotelero</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/PersonalCss.css" rel="stylesheet">

  </head>
  <body>
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

    <div class="container">
    <div class="jumbotron"  >     
    <div class="container marketing">

      <!-- Three columns of text below the carousel (row1) -->
      </div>
     </div>  
    </div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>