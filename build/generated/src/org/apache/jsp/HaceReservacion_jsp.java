package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import database.DBA;

public final class HaceReservacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"/Imagenes/city-hotel-icon.png\"/>\n");
      out.write("<title>Agrega Tu Reservacion</title>\n");
      out.write("    \n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

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
                 
      out.write("\n");
      out.write("                 \n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"jumbotron\"  >     \n");
      out.write("    <div class=\"container marketing\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("       \n");
      out.write("            <table class=\"table\" style=\"color:black;\" >\n");
      out.write("               <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>\n");
      out.write("                               Numero De Reservacion\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                               Numero De Habitacion\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                               Tipo De Habitacion\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                               Fecha Inicial\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                               Fecha Final\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                             Precio\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                             Descuento\n");
      out.write("                            </th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>   \n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( id_reservacion );
      out.write("</td> \n");
      out.write("                            <td>");
      out.print(request.getParameter("id_habitacion"));
      out.write("</td>      \n");
      out.write("                            <td>");
      out.print( rfull.getString(2) );
      out.write("</td> \n");
      out.write("                            <td>");
      out.print( rfull.getString(3) );
      out.write("</td> \n");
      out.write("                            <td>");
      out.print( rfull.getString(4) );
      out.write("</td> \n");
      out.write("                            <td>");
      out.print( rfull.getString(1) );
      out.write("</td> \n");
      out.write("                            <td>");
      out.print( rfull.getString(5) );
      out.write("</td> \n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("            </table> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     </div>  \n");
      out.write("    </div>\n");
      out.write("                 ");

                 }
                 
                 }
                          }
             }
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         
      out.write("\n");
      out.write("         \n");
      out.write("      <div class=\"container\">\n");
      out.write("          \n");
      out.write("          <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <br>\n");
      out.write("      \n");
      out.write("      <div class=\"container\">\n");
      out.write("      ");

      if(session.getAttribute("id_usuarionormal")!=null){
      
      
      out.write("\n");
      out.write("      <div class=\"container\">   \n");
      out.write("        <br>\n");
      out.write("          <center>  \n");
      out.write("    <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-home\"></span>\n");
      out.write("        <a href=\"indexUsuario.jsp\" >Inicio</a>\n");
      out.write("    </button>    \n");
      out.write("    <button  type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-th-large\"></span>\n");
      out.write("     <a href=\"Reservacion.jsp\">Hacer Reservacion</a>    \n");
      out.write("    </button>           \n");
      out.write("       \n");
      out.write("    <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-map-marker\"></span>\n");
      out.write("        <a href=\"Ubicanos.jsp\" >Ubicanos</a>\n");
      out.write("    </button>\n");
      out.write("     \n");
      out.write("    <button  type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("        <a href=\"editaUsuario.jsp\" >Editar Usuario</a>\n");
      out.write("    </button>\n");
      out.write("              \n");
      out.write("     <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-off\"></span>\n");
      out.write("        <a href=\"index.jsp\" >Cerrar Sesion</a>\n");
      out.write("    </button>     \n");
      out.write("             </center> \n");
      out.write("  </div>\n");
      out.write("      ");

      }
      if(session.getAttribute("id_usuarioadmin")!=null){    
      
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("          \n");
      out.write("    <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-home\"></span>\n");
      out.write("        <a href=\"indexUsuario.jsp\" >Inicio</a>\n");
      out.write("    </button>    \n");
      out.write(" \n");
      out.write("    <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-cog\"></span>\n");
      out.write("        <a href=\"EditarInfoHotel.jsp\">Configuracion De Hotel</a>\n");
      out.write("    </button>\n");
      out.write("    \n");
      out.write("    <button  type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-th-large\"></span>\n");
      out.write("     <a href=\"Reservacion.jsp\">Hacer Reservacion</a>    \n");
      out.write("    </button>    \n");
      out.write(" \n");
      out.write("    <button  type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-ok-circle\"></span>\n");
      out.write("        <a>Aceptar Reservacion</a>\n");
      out.write("    </button>\n");
      out.write("        \n");
      out.write(" \n");
      out.write("    <button  type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-plus\"></span>\n");
      out.write("        <a href=\"agregaHabitacion.jsp\">Agregar Habitacion</a>\n");
      out.write("    </button>\n");
      out.write("        \n");
      out.write("    <button  type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("        <a href=\"agregaServicio.jsp\" >Agregar Servicio</a>\n");
      out.write("    </button>    \n");
      out.write("     \n");
      out.write("    <button  type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("        <a href=\"agregaAdmin.jsp\" >Agrega Admin</a>\n");
      out.write("    </button> \n");
      out.write("        \n");
      out.write("    <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-map-marker\"></span>\n");
      out.write("        <a href=\"Ubicanos.jsp\" >Ubicanos</a>\n");
      out.write("    </button>\n");
      out.write("        \n");
      out.write("     <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-off\"></span>\n");
      out.write("        <a href=\"index.jsp\" >Cerrar Sesion</a>\n");
      out.write("    </button>\n");
      out.write("      </div>\n");
      out.write("      ");
    
      }
      
      if(session.getAttribute("id_gerente")!=null){
      
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("      <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-stats\"></span>\n");
      out.write("        <a>Reporteria</a>\n");
      out.write("    </button>\n");
      out.write(" \n");
      out.write("     <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-off\"></span>\n");
      out.write("        <a href=\"index.jsp\" >Cerrar Sesion</a>\n");
      out.write("    </button>\n");
      out.write("          </div>\n");
      out.write("      ");

      }
      
      out.write(" \n");
      out.write("      \n");
      out.write("</div>                  \n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("    <!--/.navbar-collapse -->\n");
      out.write("      </div>\n");
      out.write("    <br>\n");
      out.write("            \n");
      out.write("    </nav>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <hr class=\"featurette-divider\">\n");
      out.write("    \n");
      out.write("    <div class=\"page-header\">\n");
      out.write("        <br>\n");
      out.write("        <center>\n");
      out.write("    <h1>Hotel Manchester</h1>\n");
      out.write("        </center>\n");
      out.write("    </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>   \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
