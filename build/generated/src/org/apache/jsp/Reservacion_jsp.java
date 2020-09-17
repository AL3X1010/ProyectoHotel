package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import database.DBA;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Reservacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>Proyecto Hotelero</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/PersonalCss.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).on(\"ready\", function(){\n");
      out.write("          $('#fechaini').on('change',function(){\n");
      out.write("        $('#fechafin').val($(this).val());     \n");
      out.write("        $('#fechafin').attr('min', $(this).val());     \n");
      out.write("          });  \n");
      out.write("        $('table a').on('click', function(){\n");
      out.write("        $('#id_habitacion').val( $(this).attr('id') );\n");
      out.write("        $(\"td a\").text(\"Seleccionar\");\n");
      out.write("        $(\"#\"+ $(this).attr('id')).text(\"SELECCIONADO\");\n");
      out.write("    });       \n");
      out.write("        \n");
      out.write("        $('#btnGuardar').on('click', function(event){\n");
      out.write("        if($('#id_habitacion').val().length==0){\n");
      out.write("            alert('Seleccione Una Habitacion');\n");
      out.write("            event.preventDefault();\n");
      out.write("        }\n");
      out.write("        });\n");
      out.write("        });    \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <div class=\"container\">\n");
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
      out.write("</div>\n");
      out.write("            </div> \n");
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
      out.write("        <center>\n");
      out.write("    <h1>Hotel Manchester</h1>\n");
      out.write("        </center>\n");
      out.write("    </div>   \n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"jumbotron\"  >     \n");
      out.write("    <div class=\"container marketing\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form method=\"post\" action=\"HaceReservacion.jsp\" >\n");
      out.write("                   <div class=\"col-xs-4\">\n");
      out.write("                <label style=\"color:black;\">Fecha Inicio</label>\n");
      out.write("                <input required=\"true\" name=\"fechaini\" type=\"date\"  class=\"form-control\" min=\"");

                    SimpleDateFormat minDate= new SimpleDateFormat("yyyy-MM-dd");
                    Date now= new Date();
                    out.print(minDate.format(now));
                
      out.write("\" placeholder=\"Fecha De Ingreso\" id=\"fechaini\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("           <label style=\"color:black;\">Fecha Fin</label>\n");
      out.write("           <input required=\"true\" name=\"fechafin\" type=\"date\" class=\"form-control\" placeholder=\"Fecha De Salida\" id=\"fechafin\"> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("                <br><button type=\"submit\" name=\"btnBuscar\" id=\"btnGuardar\" class=\"btn btn-primary\">Buscar</button>\n");
      out.write("               <input required=\"true\" name=\"id_habitacion\" type=\"text\" class=\"form-control\" placeholder=\"id habitacion\" id=\"id_habitacion\" readonly=\"true\"> \n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div> \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <table class=\"table\" style=\"color:black;\" >\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>\n");
      out.write("                               Numero De Habitacion\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                               Tipo De Habitacion\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                               Precio\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                             Descuento\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                                Estado\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                                Reservacion\n");
      out.write("                            </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                        
        DBA db = new DBA ("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
        db.conectar();
        String quer ="SELECT id_habitacion, precio, tipo, descuento, estado FROM Ahabitacion;";
            db.query.execute(quer);
            ResultSet rs = db.query.getResultSet(); 
            while(rs.next()){
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( rs.getString(1) );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( rs.getString(3) );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( rs.getString(2) );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( rs.getString(4) );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");

                    if(rs.getString(5).equals("1") ){
                    out.print("Libre");
                    }else{
                    out.print("Ocupado");
                    }
                    
                    
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>       \n");
      out.write("                    <a href=\"#\" id='");
      out.print( rs.getString(1) );
      out.write("'>Seleccionar</a>  \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("     \n");
      out.write("      </div>\n");
      out.write("     </div>  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>");
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
