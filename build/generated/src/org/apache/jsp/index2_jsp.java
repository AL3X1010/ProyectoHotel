package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <div class=\"container\">\n");
      out.write("          \n");
      out.write("          <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <br>\n");
      out.write("      <div class=\"container\">   \n");
      out.write("          \n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("              \n");
      out.write("        <div class=\"btn-toolbar\" role=\"toolbar\">  \n");
      out.write("    <div class=\"btn-group\">\n");
      out.write("     \n");
      out.write("    <button type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-home\"></span>\n");
      out.write("        <a href=\"index2.jsp\" >Inicio</a>\n");
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
      out.write("    </button>     \n");
      out.write("  </div>\n");
      out.write("</div>                   \n");
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
      out.write("    </div>  \n");
      out.write("\n");
      out.write("        \n");
      out.write("    <div  id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"4000\">\n");
      out.write("      <!-- Indicators -->\n");
      out.write("      <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("      </ol>\n");
      out.write("      <div class=\"carousel-inner\" role=\"listbox\">   \n");
      out.write("        <div class=\"item active\">\n");
      out.write("          <img class=\"first-slide\" src=\"Imagenes/1.jpg\" alt=\"First slide\">\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div class=\"item\">\n");
      out.write("          <img class=\"second-slide\" src=\"Imagenes/2.jpg\" alt=\"Second slide\">\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"item\">\n");
      out.write("          <img class=\"third-slide\" src=\"Imagenes/3.jpg\" alt=\"Third slide\">\n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("          <div class=\"item\">\n");
      out.write("               <img class=\"fourd-slide\" src=\"Imagenes/4.jpg\" alt=\"Fourd slide\">\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("            <div class=\"item\">\n");
      out.write("               <img class=\"five-slide\" src=\"Imagenes/5.jpg\" alt=\"Five slide\">\n");
      out.write("          </div>\n");
      out.write("              <div class=\"item\">\n");
      out.write("               <img class=\"six-slide\" src=\"Imagenes/6.jpg\" alt=\"Six slide\">\n");
      out.write("          </div>\n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("           <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Previous</span>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Next</span>\n");
      out.write("      </a>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"jumbotron\"  >     \n");
      out.write("    <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("      <!-- Three columns of text below the carousel (row1) -->\n");
      out.write("      </div>\n");
      out.write("     </div>  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("  </body>\n");
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
