package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import database.DBA;

public final class agregaHabitacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<title>Agrega Una Habitacion</title>\n");
      out.write("    \n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("     <div class=\"container\">\n");
      out.write("    <div class=\"panel panel-primary\">\n");
      out.write("          <div class=\"panel-heading\">Agrega Una Habitacion</div>\n");
      out.write("          <div class=\"panel-body\">     \n");
      out.write("    <div>   \n");
      out.write("        <form method=\"post\" action=\"agregaHabitacion.jsp\">\n");
      out.write("            <br><br>\n");
      out.write("    ");

    try{
        DBA db = new DBA ("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
        db.conectar();
        String quer ="SELECT id_hotel, nombre FROM hotel;";
            db.query.execute(quer);
            ResultSet rs = db.query.getResultSet();   
        if(rs.next()){
        
      out.write("\n");
      out.write("        <br><br><select class=\"form-control\" name=\"nombrehotel\">\n");
      out.write("            <option value=\"");
      out.print(rs.getString(1) );
      out.write('"');
      out.write('>');
      out.print(rs.getString(2) );
      out.write("</option>\n");
      out.write("            ");

            while(rs.next()){
            
      out.write("\n");
      out.write("             <option value=\"");
      out.print(rs.getString(1) );
      out.write('"');
      out.write('>');
      out.print(rs.getString(2) );
      out.write("</option>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("        </select> \n");
      out.write("    <br><br><select class=\"form-control\" name=\"tipohabitacion\">\n");
      out.write("        <option value=\"Normal\">Normal</option>\n");
      out.write("        <option value=\"Ejecutiva\">Ejecutiva</option>\n");
      out.write("        <option value=\"VIP\">VIP</option>\n");
      out.write("        </select>    \n");
      out.write("    <br><br><input name=\"precio\" type=\"number\" step=\"any\" min=\"1\" class=\"form-control\" placeholder=\"Precio   \" id=\"precio\"> \n");
      out.write("    <br><br><input name=\"descuento\" type=\"number\" step=\"any\" min=\"0\" max=\"100\" class=\"form-control\" placeholder=\"Descuento   \" id=\"descuento\">    \n");
      out.write("        \n");
      out.write("        <br><div  class=\"panel-footer\">\n");
      out.write("     <button data-toggle=\"modal\" data-target=\"#myModal\"  id=\"btnCancelar\" type=\"button\" class=\"btn btn-danger\" >Cancelar</button>        \n");
      out.write("     <button name=\"btnHabitacion\" type=\"button\" id=\"btnGuardar\" class=\"btn btn-primary\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Click aquí para guardar la información\">Guardar</button>      \n");
      out.write("        ");

        }    
    }catch(Exception e){
    }
    
      out.write("       \n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </div>      \n");
      out.write("        </form>\n");
      out.write("            ");

    if (request.getParameter("btnHabitacion")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
        PreparedStatement a = db.conexion.prepareStatement("{call agregahabitacion(?,?,?, ?)}");    
        a.setString(1, request.getParameter("nombrehotel"));  
        a.setString(2, request.getParameter("precio"));
        a.setString(3, request.getParameter("tipo"));
        a.setString(4, request.getParameter("descuento"));
        
       int aservicio = a.executeUpdate();
       if (aservicio >0){
       session.setAttribute("alerta", "1");
       response.sendRedirect("index.jsp");
       }
    }catch(Exception e){
    }
    }
    
      out.write("\n");
      out.write("   \n");
      out.write("        </div>\n");
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
