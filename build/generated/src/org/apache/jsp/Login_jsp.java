package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Login V4</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login/util.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login/main.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form class=\"form-signin\" action=\"Login\" method=\"post\">\r\n");
      out.write("            <div class=\"limiter\">\r\n");
      out.write("                <div class=\"container-login100\" style=\"background-image: url('images/bg-01.jpg');\">\r\n");
      out.write("                    <div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\r\n");
      out.write("                        <form class=\"login100-form validate-form\">\r\n");
      out.write("                            <span class=\"login100-form-title p-b-49\">\r\n");
      out.write("                                Login\r\n");
      out.write("                            </span>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"wrap-input100 validate-input m-b-23\" data-validate = \"Username is reauired\">\r\n");
      out.write("                                <span class=\"label-input100\">Username</span>\r\n");
      out.write("                                <input class=\"input100\" type=\"text\" name=\"user\" placeholder=\"Type your username\">\r\n");
      out.write("                                <span class=\"focus-input100\" data-symbol=\"&#xf206;\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"wrap-input100 validate-input\" data-validate=\"Password is required\">\r\n");
      out.write("                                <span class=\"label-input100\">Password</span>\r\n");
      out.write("                                <input class=\"input100\" type=\"password\" name=\"pass\" placeholder=\"Type your password\">\r\n");
      out.write("                                <span class=\"focus-input100\" data-symbol=\"&#xf190;\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"checkbox\" name=\"remember\"> Remember me\r\n");
      out.write("                            <div class=\"text-right p-t-8 p-b-31\">\r\n");
      out.write("                                <a href=\"reset-password.jsp\">\r\n");
      out.write("                                    Forgot password?\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"container-login100-form-btn\">\r\n");
      out.write("                                <div class=\"wrap-login100-form-btn\">\r\n");
      out.write("                                    <div class=\"login100-form-bgbtn\"></div>\r\n");
      out.write("                                    <button class=\"login100-form-btn\">\r\n");
      out.write("                                        Login\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"txt1 text-center p-t-54 p-b-20\">\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    Or Sign Up Using\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"flex-c-m\">\r\n");
      out.write("                                <a href=\"#\" class=\"login100-social-item bg1\">\r\n");
      out.write("                                    <i class=\"fa fa-facebook\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#\" class=\"login100-social-item bg2\">\r\n");
      out.write("                                    <i class=\"fa fa-twitter\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#\" class=\"login100-social-item bg3\">\r\n");
      out.write("                                    <i class=\"fa fa-google\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"flex-col-c p-t-155\">\r\n");
      out.write("                                <span class=\"txt1 p-b-17\">\r\n");
      out.write("                                    Or Sign Up Using\r\n");
      out.write("                                </span>\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"Signup.jsp\" class=\"txt2\">\r\n");
      out.write("                                    Sign Up\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"dropDownSelect1\"></div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"vendor/animsition/js/animsition.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"vendor/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"vendor/countdowntime/countdowntime.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"js/login/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
