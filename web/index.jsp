<%-- 
    Document   : index
    Created on : 12-06-2015, 02:03:44 PM
    Author     : allan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="database.DBA"%>
<!DOCTYPE html>
<html lang="en">
  <head>
      <link rel="shortcut icon" href="Imagenes/favicon.ico">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Proyecto Hotelero</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/PersonalCss.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="encriptar/md5.js" type="text/javascript"></script>
    <script>
            function modificarPASS(){
            var sinCifrar =document.getElementById('pass').value;           
            document.getElementById('pass').value=hex_md5(sinCifrar);                    
            f1.submit();            
        }

    </script>
 
  </head>
  <%
      if(request.getParameter("btnLogin")!= null){
      try{
          
           DBA db = new DBA ("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
           db.conectar();
           String quer ="SELECT id_usuarionormal FROM usuarionormal where email='"+request.getParameter("email")+"' and passc='0x"+request.getParameter("password")+"';";
            db.query.execute(quer);
            ResultSet rs = db.query.getResultSet(); 
            if(rs.next() ){
             session.setAttribute("id_usuarionormal", rs.getString(1));
             session.setAttribute("id_gerente", "0");
             session.setAttribute("id_usuarioadmin", "0");
             out.print("<script>alert('Ingreso');</script>");
             response.sendRedirect("indexUsuario.jsp");
            }else{
           
            String queradmin ="SELECT id_usuarioadmin FROM usuarioadmin where email='"+request.getParameter("email")+"' and passc='0x"+request.getParameter("password")+"';";
            db.query.execute(queradmin);
            ResultSet rsadmin = db.query.getResultSet();
            if(rsadmin.next()){
            session.setAttribute("id_usuarioadmin", rsadmin.getString(1));
            session.setAttribute("id_usuarionormal", "0");
            session.setAttribute("id_gerente", "0");
            out.print("<script>alert('Ingreso');</script>");
            response.sendRedirect("indexUsuario.jsp");
            }else{
            
            String quergerente ="SELECT id_gerente FROM usuariogerente where email='"+request.getParameter("email")+"' and passc='0x"+request.getParameter("password")+"';";
            db.query.execute(quergerente);
            ResultSet rsgerente = db.query.getResultSet();
             if(rsgerente.next()){
            session.setAttribute("id_gerente", rsgerente.getString(1));
            session.setAttribute("id_usuarionormal", "0");
            session.setAttribute("id_usuarioadmin", "0");

            out.print("<script>alert('Ingreso');</script>");
            response.sendRedirect("indexUsuario.jsp");
            }else{
             out.print("<script>alert('Usuario no encontrado');</script>");
             }
            }
            }
        db.desconectar();
          }catch(Exception e){  
          }  
      }
  %>
  
  
  <body>
      <div class="container">
          <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form  name="f1" id="f1" class="navbar-form navbar-right">
            <div class="form-group">
                <input name="email" type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
                <input id="pass" name="password" type="password" placeholder="Password" class="form-control">
            </div>
                <button onclick="modificarPASS();" name="btnLogin" type="submit" class="btn btn-success">Inicia Sesion</button>
             <button type="button"class="btn btn-primary" data-toggle="tooltip" data-placement="right" >Registrate</button>   
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
      </div>
      
      
    <hr class="featurette-divider">
    <div class="page-header">
        <br>
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
      <div class="row">
        <div class="color1 col-xs-12 col-sm-12 col-md-4">
          <br>
          <img class="img-rounded" src="Imagenes/mision.png" alt="Generic placeholder image" width="150" height="150">
            <h3 style="color:#666;">Mision</h3>
            <p style="color:#666;">Recibe nuestro contenido unico y extra y obten todo el acceso de usuario con tan solo reguistrarte,!!!!REGISTRATE YA¡¡¡¡</p>
          
        </div>
          
        <div class="color3 col-xs-12 col-sm-12 col-md-4">
           <br>
          <img class="img-rounded" src="Imagenes/vision.png" alt="Generic placeholder image" width="150" height="150">
          <h3 style="color:#666;">Vision</h3>
          <p style="color:#666;">En esta seccion tenemos un catalogo con las peliculas top de varios genereos de gusto personal, seleccionados cuidadosamente tomando en cuenta generalidades y puntualidades de referencia de cada pelicula.
              Esperamos sea de tu agrado y disfrutes de esta nueva experiencia cineasta.            
            </p>
        </div>
          
        <div  class="color1 col-xs-12 col-sm-12 col-md-4">
           <br>
          <img class="img-rounded" src="Imagenes/valores.png" alt="Generic placeholder image" width="150" height="150">
          <h3 style="color:#666;">Valores</h3>
          <p style="color:#666;">pagina confiable que nos proporciona informacion de los proximos estrenos disfrunten al ver las nuevas aventuras y experiencias que vamos a tener.</p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->
    </div>
     </div>  
    </div>
   
  </body>
</html>
