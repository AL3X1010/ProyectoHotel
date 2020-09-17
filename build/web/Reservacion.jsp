<%-- 
    Document   : Reservacion
    Created on : 12-11-2015, 02:44:16 PM
    Author     : allan
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="database.DBA"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <script>
        $(document).on("ready", function(){
          $('#fechaini').on('change',function(){
        $('#fechafin').val($(this).val());     
        $('#fechafin').attr('min', $(this).val());     
          });  
        $('table a').on('click', function(){
        $('#id_habitacion').val( $(this).attr('id') );
        $("td a").text("Seleccionar");
        $("#"+ $(this).attr('id')).text("SELECCIONADO");
    });       
        
        $('#btnGuardar').on('click', function(event){
        if($('#id_habitacion').val().length==0){
            alert('Seleccione Una Habitacion');
            event.preventDefault();
        }
        });
        });    
    </script>
    
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
        <center>
    <h1>Hotel Manchester</h1>
        </center>
    </div>   
    <div class="container">
    <div class="jumbotron"  >     
    <div class="container marketing">
        <div class="row">
            <form method="post" action="HaceReservacion.jsp" >
                   <div class="col-xs-4">
                <label style="color:black;">Fecha Inicio</label>
                <input required="true" name="fechaini" type="date"  class="form-control" min="<%
                    SimpleDateFormat minDate= new SimpleDateFormat("yyyy-MM-dd");
                    Date now= new Date();
                    out.print(minDate.format(now));
                %>" placeholder="Fecha De Ingreso" id="fechaini">
            </div>
            <div class="col-xs-4">
           <label style="color:black;">Fecha Fin</label>
           <input required="true" name="fechafin" type="date" class="form-control" placeholder="Fecha De Salida" id="fechafin"> 
            </div>
            <div class="col-xs-4">
                <br><button type="submit" name="btnBuscar" id="btnGuardar" class="btn btn-primary">Buscar</button>
               <input required="true" name="id_habitacion" type="text" class="form-control" placeholder="id habitacion" id="id_habitacion" readonly="true"> 
    
            </div>
            </form>
        </div> 
            <br>
            <br>
            
            <div class="row">
                <table class="table" style="color:black;" >
                    <thead>
                        <tr>
                            <th>
                               Numero De Habitacion
                            </th>
                            <th>
                               Tipo De Habitacion
                            </th>
                            <th>
                               Precio
                            </th>
                            <th>
                             Descuento
                            </th>
                            <th>
                                Estado
                            </th>
                            <th>
                                Reservacion
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        
        DBA db = new DBA ("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
        db.conectar();
        String quer ="SELECT id_habitacion, precio, tipo, descuento, estado FROM Ahabitacion;";
            db.query.execute(quer);
            ResultSet rs = db.query.getResultSet(); 
            while(rs.next()){
            %>
            <tr>
                <td>
                    <%= rs.getString(1) %>
                </td>
                <td>
                    <%= rs.getString(3) %>
                </td>
                <td>
                    <%= rs.getString(2) %>
                </td>
                <td>
                    <%= rs.getString(4) %>
                </td>
                <td>
                    <%
                    if(rs.getString(5).equals("1") ){
                    out.print("Libre");
                    }else{
                    out.print("Ocupado");
                    }
                    
                    %>
                </td>
                <td>       
                    <a href="#" id='<%= rs.getString(1) %>'>Seleccionar</a>  
                </td>
            </tr>
            <%
            }
                        %>
                    </tbody>
                </table>
            </div>
     
      </div>
     </div>  
    </div>


    
  </body>
</html>