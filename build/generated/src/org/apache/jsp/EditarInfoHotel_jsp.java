package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import database.DBA;

public final class EditarInfoHotel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"/Imagenes/city-hotel-icon.png\"/>\n");
      out.write("<title>Agrega Un Hotel</title>\n");
      out.write("    \n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("     <div class=\"container\">\n");
      out.write("    <div class=\"panel panel-primary\">\n");
      out.write("          <div class=\"panel-heading\">Agrega Un Hotel</div>\n");
      out.write("          <div class=\"panel-body\">               \n");
      out.write("     <form>\n");
      out.write("     <div>       \n");
      out.write("        <br><br><input name=\"nombre\" type=\"text\" class=\"form-control\" placeholder=\"Nombre Del Hotel   \" id=\"nombre\">\n");
      out.write("    <br><br><input name=\"longitud\" type=\"text\" class=\"form-control\" placeholder=\"Longitud\" id=\"longitud\">\n");
      out.write("    <br><br><input name=\"latitud\" type=\"text\" class=\"form-control\" placeholder=\"Latitud\" id=\"latitud\">    \n");
      out.write("    <br><br><textarea name=\"mision\"  class=\"form-control\" placeholder=\"Mision\" id=\"mision\"></textarea>    \n");
      out.write("    <br><br><textarea name=\"vision\"  class=\"form-control\" placeholder=\"Vision\" id=\"vision\"></textarea>\n");
      out.write("    <br><br><textarea name=\"valores\"  class=\"form-control\" placeholder=\"Valores\" id=\"valores\"></textarea>        \n");
      out.write("    <br><div  class=\"panel-footer\">\n");
      out.write("     <button data-toggle=\"modal\" data-target=\"#myModal\"  id=\"btnCancelar\" type=\"button\" class=\"btn btn-danger\" >Cancelar</button>        \n");
      out.write("     <button name=\"btnHotel\" type=\"submit\" id=\"btnGuardar\" class=\"btn btn-primary\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Click aquí para guardar la información\">Guardar</button>    \n");
      out.write("    </div>\n");
      out.write("        </div>       \n");
      out.write("     </form>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("      \n");
      out.write("    ");

        try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();
            String quer = "SELECT nombre,longitud,latitud,mision,vision,valores FROM hotel";
           db.query.execute(quer);
           ResultSet rs = db.query.getResultSet();
           while(rs.next()){
               
      out.write("\n");
      out.write("               <script>\n");
      out.write("                   document.getElementById(\"nombre\").value = \"");
      out.print( rs.getString(1) );
      out.write("\";\n");
      out.write("                   document.getElementById(\"longitud\").value = \"");
      out.print( rs.getString(2) );
      out.write("\";\n");
      out.write("                   document.getElementById(\"latitud\").value = \"");
      out.print( rs.getString(3) );
      out.write("\";\n");
      out.write("                   document.getElementById(\"mision\").value = \"");
      out.print( rs.getString(4) );
      out.write("\";\n");
      out.write("                   document.getElementById(\"vision\").value = \"");
      out.print( rs.getString(5) );
      out.write("\";\n");
      out.write("                   document.getElementById(\"valores\").value = \"");
      out.print( rs.getString(6) );
      out.write("\";\n");
      out.write("                   \n");
      out.write("               </script> \n");
      out.write("               \n");
      out.write("              ");

           }
        }catch(Exception e){
        e.printStackTrace();
        }
          
        
    if (request.getParameter("btnHotel")!= null){
    try{
        DBA db = new DBA("DESKTOP-MTCLJC6\\SQLEXPRESS","HotelWebProyecto", "prueba","hola1");
            db.conectar();    
        String quer = "UPDATE hotel set nombre='"+request.getParameter("nombre")+"',longitud="+request.getParameter("longitud")+",latitud="+request.getParameter("latitud")+", mision='"+request.getParameter("mision")+"', vision='"+request.getParameter("vision")+"', valores='"+request.getParameter("valores")+"' where id_hotel = 1";    
      int deb= db.query.executeUpdate(quer);
      if(deb>0){
      out.print("'<script> alert('Informacion Modificada')</script>'");
      }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
      out.write("          \n");
      out.write("              \n");
      out.write("    </div>  \n");
      out.write("     </div>  \n");
      out.write("    </div>    \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
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
