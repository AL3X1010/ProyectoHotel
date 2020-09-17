package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mpq.EnviadorMail;
import java.sql.PreparedStatement;
import database.DBA;

public final class agregaUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Registro De Usuario</title>\n");
      out.write("    \n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("     <div class=\"container\">\n");
      out.write("    <div class=\"panel panel-primary\">\n");
      out.write("          <div class=\"panel-heading\">Registro Usuario, Favor Llene TODOS Los Campos</div>\n");
      out.write("          <div class=\"panel-body\">     \n");
      out.write("      \n");
      out.write("    \n");
      out.write("        <form method=\"post\" action=\"agregaUsuario.jsp\">\n");
      out.write("       <div>      \n");
      out.write("        <br><br><input name=\"nombre\" type=\"text\" class=\"form-control\" placeholder=\"Nombre\" id=\"nombre\">\n");
      out.write("    <br><br><input name=\"apellido\" type=\"text\" class=\"form-control\" placeholder=\"Apellido\" id=\"apellido\"> \n");
      out.write("    <br><input name=\"email\" type=\"text\" class=\"form-control\" placeholder=\"Email\" id=\"email\">   \n");
      out.write("    <br><br><textarea  name=\"descripcion\" class=\"form-control\" placeholder=\"Direccion\" id=\"descripcion\"></textarea>    \n");
      out.write("    <br><br><input name=\"fechanaci\" type=\"date\" class=\"form-control\" placeholder=\"Fecha De Nacimiento Año/Mes/Dia\" id=\"fechanaci\">\n");
      out.write("    <br><br><input name=\"pais\" type=\"text\" class=\"form-control\" placeholder=\"Pais\" id=\"pais\">\n");
      out.write("        <div  class=\"panel-footer\">\n");
      out.write("     <button data-toggle=\"modal\" data-target=\"#myModal\"  id=\"btnCancelar\" type=\"button\" class=\"btn btn-danger\" >Cancelar</button>        \n");
      out.write("    <button name=\"btnUsuario\" type=\"submit\" id=\"btnGuardar\" class=\"btn btn-primary\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Click aquí para guardar la información\">Guardar</button>    \n");
      out.write("    </div>    \n");
      out.write("        </div>    \n");
      out.write("        </form>\n");
      out.write("              \n");
      out.write("           ");

    if (request.getParameter("btnUsuario")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
        PreparedStatement a = db.conexion.prepareStatement("{call registronormal(?,?,?,?,?,?,?)}");    
        a.setString(1, request.getParameter("nombre"));
        a.setString(2, request.getParameter("apellido"));
        a.setString(3, request.getParameter("email"));
        a.setString(4, request.getParameter("apellido")+ ""+(int)(1+ Math.random()*1000) );
        a.setString(5, request.getParameter("descripcion"));
        a.setString(6, request.getParameter("fechanaci"));
        a.setString(7, request.getParameter("pais"));
        
       int aservicio = a.executeUpdate();
       if (aservicio >0){
       String infomail ="SELECT  ussername, pass from usuarionormal where email='"+request.getParameter("email")+"'";
            db.query.execute(infomail);
            ResultSet rsmail = db.query.getResultSet(); 
        if(rsmail.next()){    
       EnviadorMail EnviadorMail = new EnviadorMail(request.getParameter("email"),"Bienvenido", "gracias '"+rsmail.getString(1)+"' por registrarte en nuestra pagina tu contraseña es'"+rsmail.getString(2)+"'\nClick en el siguiente enlace para loguearte\nhttp://localhost:8080/PHotel/index.jsp");
        } 
        response.sendRedirect("index.jsp");
       }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
      out.write("     \n");
      out.write("     \n");
      out.write("    </div>  \n");
      out.write("     </div>  \n");
      out.write("    </div>    \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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
