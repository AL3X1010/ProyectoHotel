<%-- 
    Document   : indexUsuario
    Created on : 12-17-2015, 10:31:52 PM
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
      <%
      if(session.getAttribute("id_usuarionormal")!=null){
      if(!session.getAttribute("id_usuarionormal").equals("0")){
      
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
      }
      if(session.getAttribute("id_usuarioadmin")!=null){  
      if(!session.getAttribute("id_usuarioadmin").equals("0")){    
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
      }
      if(session.getAttribute("id_gerente")!=null){
      if(!session.getAttribute("id_gerente").equals("0")){     
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
      }
      %> 
      
</div>                   
  
     <hr class="featurette-divider">
    
    <div class="page-header">
        
        <center>
    <h1>Hotel Manchester</h1>
        </center>
    </div>  

        
    <div  id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="4000">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
        <li data-target="#myCarousel" data-slide-to="4"></li>
        <li data-target="#myCarousel" data-slide-to="5"></li>
      </ol>
      <div class="carousel-inner" role="listbox">   
        <div class="item active">
          <img class="first-slide" src="Imagenes/1.jpg" alt="First slide">
        </div>
          
        <div class="item">
          <img class="second-slide" src="Imagenes/2.jpg" alt="Second slide">
        </div>
         
        <div class="item">
          <img class="third-slide" src="Imagenes/3.jpg" alt="Third slide">
      </div>
          
          <div class="item">
               <img class="fourd-slide" src="Imagenes/4.jpg" alt="Fourd slide">
          </div>
        
            <div class="item">
               <img class="five-slide" src="Imagenes/5.jpg" alt="Five slide">
          </div>
              <div class="item">
               <img class="six-slide" src="Imagenes/6.jpg" alt="Six slide">
          </div>
           </div>
          
           <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
     
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
    
    <%
    if(session.getAttribute("alerta" )!= null){
    String alerta = session.getAttribute("alerta").toString();
    if(alerta.equals("1")){
    session.setAttribute("alerta", "0");
    out.println("<script>alert('Servicio Agregado Satisfactoriamente')</script>");
    }
    if(alerta.equals("2")){
    session.setAttribute("alerta", "0");
    out.println("<script>alert('Habitacion Agregada Satisfactoriamente')</script>");
    }
    if(alerta.equals("3")){
    session.setAttribute("alerta", "0");
    out.println("<script>alert('Usuario Agregado')</script>");
    }
    
    if(alerta.equals("4")){
    session.setAttribute("alerta", "0");
    out.println("<script>alert('Usuario Administrativo Agregado')</script>");
    }
   
    if(alerta.equals("5")){
    session.setAttribute("alerta", "0");
    out.println("<script>alert('Hotel Agregado Exitosamente')</script>");
    }
    
    }
    %>
  </body>
</html>
