package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import database.DBA;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("      <link rel=\"shortcut icon\" href=\"Imagenes/favicon.ico\">\n");
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
      out.write("    <script src=\"encriptar/md5.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script>\n");
      out.write("            function modificarPASS(){\n");
      out.write("            var sinCifrar =document.getElementById('pass').value;           \n");
      out.write("            document.getElementById('pass').value=hex_md5(sinCifrar);                    \n");
      out.write("            f1.submit();            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write(" \n");
      out.write("  </head>\n");
      out.write("  ");

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
  
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <form  name=\"f1\" id=\"f1\" class=\"navbar-form navbar-right\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"email\" type=\"text\" placeholder=\"Email\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input id=\"pass\" name=\"password\" type=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("                <button onclick=\"modificarPASS();\" name=\"btnLogin\" type=\"submit\" class=\"btn btn-success\">Inicia Sesion</button>\n");
      out.write("             <button type=\"button\"class=\"btn btn-primary\" data-toggle=\"tooltip\" data-placement=\"right\" >Registrate</button>   \n");
      out.write("          </form>\n");
      out.write("        </div><!--/.navbar-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <hr class=\"featurette-divider\">\n");
      out.write("    <div class=\"page-header\">\n");
      out.write("        <br>\n");
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
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"color1 col-xs-12 col-sm-12 col-md-4\">\n");
      out.write("          <br>\n");
      out.write("          <img class=\"img-rounded\" src=\"Imagenes/mision.png\" alt=\"Generic placeholder image\" width=\"150\" height=\"150\">\n");
      out.write("            <h3 style=\"color:#666;\">Mision</h3>\n");
      out.write("            <p style=\"color:#666;\">Recibe nuestro contenido unico y extra y obten todo el acceso de usuario con tan solo reguistrarte,!!!!REGISTRATE YA¡¡¡¡</p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div class=\"color3 col-xs-12 col-sm-12 col-md-4\">\n");
      out.write("           <br>\n");
      out.write("          <img class=\"img-rounded\" src=\"Imagenes/vision.png\" alt=\"Generic placeholder image\" width=\"150\" height=\"150\">\n");
      out.write("          <h3 style=\"color:#666;\">Vision</h3>\n");
      out.write("          <p style=\"color:#666;\">En esta seccion tenemos un catalogo con las peliculas top de varios genereos de gusto personal, seleccionados cuidadosamente tomando en cuenta generalidades y puntualidades de referencia de cada pelicula.\n");
      out.write("              Esperamos sea de tu agrado y disfrutes de esta nueva experiencia cineasta.            \n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div  class=\"color1 col-xs-12 col-sm-12 col-md-4\">\n");
      out.write("           <br>\n");
      out.write("          <img class=\"img-rounded\" src=\"Imagenes/valores.png\" alt=\"Generic placeholder image\" width=\"150\" height=\"150\">\n");
      out.write("          <h3 style=\"color:#666;\">Valores</h3>\n");
      out.write("          <p style=\"color:#666;\">pagina confiable que nos proporciona informacion de los proximos estrenos disfrunten al ver las nuevas aventuras y experiencias que vamos a tener.</p>\n");
      out.write("        </div><!-- /.col-lg-4 -->\n");
      out.write("      </div><!-- /.row -->\n");
      out.write("    </div>\n");
      out.write("     </div>  \n");
      out.write("    </div>\n");
      out.write("   \n");
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
