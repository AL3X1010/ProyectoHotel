package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reporteria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("      <div class=\"container\">        \n");
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
      out.write("    <div class=\"btn-group\"> \n");
      out.write("     <button onclick=\"window.open('index.jsp')\" type=\"button\" class=\"btn btn-default\">\n");
      out.write("      <span class=\"glyphicon glyphicon-off\"></span>\n");
      out.write("        <a>Cerrar Sesion</a>\n");
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
      out.write("  </body>\n");
      out.write("</html>>\n");
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
