package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\r\n");
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Latest compiled JavaScript -->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\r\n");
      out.write("\"></script>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\r\n");
      out.write("\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Core theme JS-->\r\n");
      out.write("        <script src=\"js/scripts_home.js\"></script>\r\n");
      out.write("        <link href=\"css/styles_home.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\r\n");
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Font Awesome icons (free version)-->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\r\n");
      out.write("\"></script>\r\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v6.1.0/js/all.js\r\n");
      out.write("\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Google fonts-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\r\n");
      out.write("\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700\r\n");
      out.write("\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("        <!-- Navigation-->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\" id=\"mainNav\" style=\"padding: 5px !important;\">\r\n");
      out.write("            <div class=\"container\" style=\"margin-left: 40px; margin-right: 30px\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"home\"><img src=\"images/Logo/Logo_Black.png\" style=\"height: 50px\" alt=\"...\" /></a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    Menu\r\n");
      out.write("                    <i class=\"fas fa-bars ms-1\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("                    <ul class=\"navbar-nav text-uppercase ms-auto py-4 py-lg-0\">                            \r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#sliders\">Sliders</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#subjects\">Subjects</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#posts\">Posts</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#team\">Team</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"Login.jsp\">Login</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- Masthead-->\r\n");
      out.write("        <!--        <header class=\"masthead\" style=\"background-image: url('images/bg-header.jpg')\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"masthead-subheading\">Welcome To Quiz Question!</div>\r\n");
      out.write("                        <div class=\"masthead-heading text-uppercase\">It's Nice To Meet You</div>\r\n");
      out.write("                        <a class=\"btn btn-primary btn-xl text-uppercase\" href=\"#subjects\">Tell Me More</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header>-->\r\n");
      out.write("\r\n");
      out.write("        <!-- Slider --!>\r\n");
      out.write("        <!-- Carousel -->\r\n");
      out.write("        <section class=\"page-section bg-light\" id=\"sliders\" style=\"padding-top: 5px\">\r\n");
      out.write("            <div id=\"demo\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Indicators/dots -->\r\n");
      out.write("                <div class=\"carousel-indicators\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- The slideshow/carousel -->\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Left and right controls/icons -->\r\n");
      out.write("                <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"prev\">\r\n");
      out.write("                    <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"next\">\r\n");
      out.write("                    <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Subjects-->\r\n");
      out.write("        <section class=\"page-section bg-light\" id=\"subjects\" style=\"padding-top: 0px\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"text-center\">\r\n");
      out.write("                    <h2 class=\"section-heading text-uppercase\">Subjects</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Post-->\r\n");
      out.write("        <section class=\"page-section\" id=\"posts\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"text-center\">\r\n");
      out.write("                    <h2 class=\"section-heading text-uppercase\">Post</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"timeline\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"timeline-inverted\">\r\n");
      out.write("                        <div class=\"timeline-image\">\r\n");
      out.write("                            <h4>\r\n");
      out.write("                                Be Part\r\n");
      out.write("                                <br />\r\n");
      out.write("                                Of Our\r\n");
      out.write("                                <br />\r\n");
      out.write("                                Story!\r\n");
      out.write("                            </h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Clients-->\r\n");
      out.write("        <div class=\"py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-6 my-3\">\r\n");
      out.write("                        <a href=\"#!\"><img class=\"img-fluid img-brand d-block mx-auto\" src=\"assets/img_home/logos/microsoft.svg\" alt=\"...\" aria-label=\"Microsoft Logo\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-6 my-3\">\r\n");
      out.write("                        <a href=\"#!\"><img class=\"img-fluid img-brand d-block mx-auto\" src=\"assets/img_home/logos/google.svg\" alt=\"...\" aria-label=\"Google Logo\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-6 my-3\">\r\n");
      out.write("                        <a href=\"#!\"><img class=\"img-fluid img-brand d-block mx-auto\" src=\"assets/img_home/logos/facebook.svg\" alt=\"...\" aria-label=\"Facebook Logo\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-6 my-3\">\r\n");
      out.write("                        <a href=\"#!\"><img class=\"img-fluid img-brand d-block mx-auto\" src=\"assets/img_home/logos/ibm.svg\" alt=\"...\" aria-label=\"IBM Logo\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer-->\r\n");
      out.write("        <footer class=\"footer py-4\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                    <div class=\"col-lg-4 text-lg-start\">Copyright &copy; Your Website 2022</div>\r\n");
      out.write("                    <div class=\"col-lg-4 my-3 my-lg-0\">\r\n");
      out.write("                        <a class=\"btn btn-dark btn-social mx-2\" href=\"#!\" aria-label=\"Twitter\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-dark btn-social mx-2\" href=\"#!\" aria-label=\"Facebook\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-dark btn-social mx-2\" href=\"#!\" aria-label=\"LinkedIn\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 text-lg-end\">\r\n");
      out.write("                        <a class=\"link-dark text-decoration-none me-3\" href=\"#!\">Privacy Policy</a>\r\n");
      out.write("                        <a class=\"link-dark text-decoration-none\" href=\"#!\">Terms of Use</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <style>\r\n");
      out.write("        #mainNav .navbar-nav .nav-item .nav-link.active, #mainNav .navbar-nav .nav-item .nav-link:hover {\r\n");
      out.write("            color: #9e8a41 !important;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(0);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.totalSliderShow - 1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_0.setVar("sl");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl == 0?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></button>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listSlider}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("sl");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"carousel-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl.sliderId == sessionScope.minSliderId?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <a href=\"subject-detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl.subId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img src=\"uploads/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl.sliderUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"d-block w-100\"></a>\r\n");
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSubjects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("S");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-lg-4 col-sm-6 mb-4\">\r\n");
          out.write("                            <!-- Portfolio item 1-->\r\n");
          out.write("                            <div class=\"subjects-item\">\r\n");
          out.write("                                <a class=\"subjects-link\" data-bs-toggle=\"modal\" href=\"#S");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    <div class=\"subjects-hover\">\r\n");
          out.write("                                        <div class=\"subjects-hover-content\"><i class=\"fas fa-plus fa-3x\"></i></div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <img class=\"img-fluid mx-auto d-block\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"...\" />\r\n");
          out.write("                                </a>\r\n");
          out.write("                                <div class=\"subjects-caption\">\r\n");
          out.write("                                    <div class=\"subjects-caption-heading\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"subjects-modal modal fade\" id=\"S");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
          out.write("                            <div class=\"modal-dialog\">\r\n");
          out.write("                                <div class=\"modal-content\">\r\n");
          out.write("                                    <div class=\"close-modal\" data-bs-dismiss=\"modal\"><img src=\"assets/img_home/close-icon.svg\" alt=\"Close modal\" /></div>\r\n");
          out.write("                                    <div class=\"container\">\r\n");
          out.write("                                        <div class=\"row justify-content-center\">\r\n");
          out.write("                                            <div class=\"col-lg-8\">\r\n");
          out.write("                                                <div class=\"modal-body\">\r\n");
          out.write("                                                    <!-- Project details-->\r\n");
          out.write("                                                    <h2 class=\"text-uppercase\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\r\n");
          out.write("                                                    <img class=\"img-fluid d-block mx-auto\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"...\" />\r\n");
          out.write("                                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                                    <button class=\"btn btn-primary btn-xl text-uppercase\" data-bs-dismiss=\"modal\" type=\"button\">\r\n");
          out.write("                                                        <i class=\"fas fa-xmark me-1\"></i>\r\n");
          out.write("                                                        Close ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                    </button>\r\n");
          out.write("                                                    <a href=\"subject-detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.getSubjectId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary btn-xl text-uppercase\">\r\n");
          out.write("                                                        Detail of ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                    </a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list3FirstPosts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("P");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.postId % 2 == 1?\"timeline-inverted\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <div class=\"timeline-image\"><img class=\"rounded-circle img-fluid\" src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"...\" /></div>\r\n");
          out.write("                            <div class=\"timeline-panel\">\r\n");
          out.write("                                <div class=\"timeline-heading\">\r\n");
          out.write("                                    <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.created_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                    <h4 class=\"subheading\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"timeline-body\"><p class=\"text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </li>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
