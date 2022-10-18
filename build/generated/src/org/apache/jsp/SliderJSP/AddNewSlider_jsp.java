package org.apache.jsp.SliderJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddNewSlider_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/SliderJSP/../components/navBarComponent.jsp");
    _jspx_dependants.add("/SliderJSP/../components/catgoryComponent_1.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/dashboard.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!--        <script src=\"js/scripts.js\"></script>-->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <link rel=\"icon\" href=\"img/mdb-favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <!-- Google Fonts Roboto -->\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\"\r\n");
      out.write("            />\r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dashboard.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/mdb.min.css\" />\r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/navbarCategory.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\r\n");
      out.write("        <!-- Custom scripts -->\r\n");
      out.write("        <script type=\"text/javascript\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body class=\"sb-sidenav-toggled\">\r\n");
      out.write("        ");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<header class=\"sb-nav-fixed\">\r\n");
      out.write("    <nav class=\"sb-topnav navbar navbar-expand navbar-light py-3\" style=\" background-image: url(''); background-color: #FFC533; height: 70px\">\r\n");
      out.write("        <!-- Navbar Brand-->\r\n");
      out.write("        <div class=\"container-fluid px-4 px-lg-5\">\r\n");
      out.write("            <!-- Navbar Search-->\r\n");
      out.write("            <img src=\"images/Logo/Logo_Black.png\" style=\"height: 40px;\" alt=\"\"></a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <button class=\"btn btn-link btn-sm order-1 order-lg-0 me-5 me-lg-0 mx-4 mt-2\" id=\"sidebarToggle\" href=\"#!\"><i class=\"fas fa-bars\" style=\"font-size: 20px\"></i></button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                    <li></li>\r\n");
      out.write("                    <li class=\"nav-item me-5\">\r\n");
      out.write("                        <a class=\"nav-link active mt-2\" style=\"padding-left: 30px\" aria-current=\"page\" href=\"home\">HOME</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item me-5\">\r\n");
      out.write("                        <a class=\"nav-link text-dark mt-2\" href=\"subject-list\">SUBJECT</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item me-5\">\r\n");
      out.write("                        <a class=\"nav-link text-dark mt-2\" href=\"post-list?blogAction=get\">BLOG</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<style>\r\n");
      out.write("    .account-div{\r\n");
      out.write("        position: relative;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .account-table{\r\n");
      out.write("        display: none;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        top: 34px;\r\n");
      out.write("        right: 0;\r\n");
      out.write("        width: 160px;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .account-div:hover .account-table{\r\n");
      out.write("        display: block;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"layoutSidenav\" class=\"mb-4\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("<div id=\"layoutSidenav_nav\">\r\n");
      out.write("    <nav class=\"sb-sidenav accordion sb-sidenav-light\" id=\"sidenavAccordion\" style=\"background-color: #f1d692 !important; margin-top: 70px\">\r\n");
      out.write("        <div class=\"sb-sidenav-menu\">\r\n");
      out.write("            <div class=\"nav\">\r\n");
      out.write("                <div class=\"sb-sidenav-menu-heading\">Quiz Question</div>\r\n");
      out.write("                <a class=\"nav-link\" href=\"\">\r\n");
      out.write("                    <div class=\"sb-nav-link-icon\"><i class=\"bi bi-question-circle-fill\"></i></div>\r\n");
      out.write("                    Quiz Question\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"sb-sidenav-menu-heading\">Subject</div>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseSub\" aria-expanded=\"false\" aria-controls=\"collapsePages\">\r\n");
      out.write("                    <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\r\n");
      out.write("                    Subject\r\n");
      out.write("                    <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                </a>\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--                <div class=\"sb-sidenav-menu-heading\">Marketing</div>\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"slider-list\">\r\n");
      out.write("                    <div class=\"sb-nav-link-icon\"><i class=\"bi bi-file-earmark-ppt-fill\"></i></div>\r\n");
      out.write("                    Slider\r\n");
      out.write("                    <div class=\"sb-sidenav-collapse-arrow\"></div>\r\n");
      out.write("                </a>-->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"sb-sidenav-menu-heading\">Course Content</div>\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"subject-lesson\">\r\n");
      out.write("                    <div class=\"sb-nav-link-icon\"><i class=\"bi bi-file-earmark-ppt-fill\"></i></div>\r\n");
      out.write("                    Subject Lesson\r\n");
      out.write("                    <div class=\"sb-sidenav-collapse-arrow\"></div>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"sb-sidenav-menu-heading\">Customer</div>\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"practice-list\">\r\n");
      out.write("                    <div class=\"sb-nav-link-icon\"><i class=\"bi bi-file-earmark-ppt-fill\"></i></div>\r\n");
      out.write("                    Practice List\r\n");
      out.write("                    <div class=\"sb-sidenav-collapse-arrow\"></div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"MyRegistrationServlet\">\r\n");
      out.write("                    <div class=\"sb-nav-link-icon\"><i class=\"bi bi-file-earmark-ppt-fill\"></i></div>\r\n");
      out.write("                    My Registration\r\n");
      out.write("                    <div class=\"sb-sidenav-collapse-arrow\"></div>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"layoutSidenav_content\">\r\n");
      out.write("                <div class=\"container-fluid px-4 px-lg-5 mb-5\" style=\"margin-top: 91px\">\r\n");
      out.write("                    <h1>Edit Slider</h1>\r\n");
      out.write("                    <div class =\"row mt-5\">\r\n");
      out.write("                        <div class=\"mb-3 mx-auto d-block shadow p-3 mb-5 bg-white rounded\" style=\"padding: 10px 0px 10px 10px; border-radius: 8px; width: 32%; margin-left: 10px; width: 100% !important\">\r\n");
      out.write("\r\n");
      out.write("                            <form action=\"add-slider\" enctype=\"multipart/form-data\" method=\"post\" class=\"container row mx-auto\">\r\n");
      out.write("                                <!--<img class=\"mx-auto d-block img-fluid\" src=\"images/\"/>-->\r\n");
      out.write("                                <div class=\"my-3 col-2\">\r\n");
      out.write("                                    <b>Sub Name</b>\r\n");
      out.write("                                    <select name=\"subId\" class=\"form-control\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"my-3 col-7\">\r\n");
      out.write("                                    <b>Title: <input type=\"text\" class=\"form-control\" id=\"title\" name=\"title\" placeholder=\"Slider Title\"></b>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3 col-3 ps-5\">                                \r\n");
      out.write("                                    <br><br>\r\n");
      out.write("                                    <b>Status: <input type=\"radio\" name=\"status\" value=\"1\" class=\"mx-2 my-1\"/>Active\r\n");
      out.write("                                        <input type=\"radio\" name=\"status\" value=\"0\" class=\"mx-2 my-1\"/>Inactive</b>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!--                            <div class=\"mb-3\">\r\n");
      out.write("                                                                <b>Slider_url: <input type=\"text\" class=\"form-control\" id=\"slider_url\" name=\"slider_url\" placeholder=\"Slider Img_url\"></b>\r\n");
      out.write("                                                            </div>-->\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <b>Slider Image: <input type=\"file\" class=\"form-control\" id=\"slider_url\" name=\"image\" placeholder=\"Slider Image\"></b>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3 col-6\">\r\n");
      out.write("                                    <b>Content: <br><textarea name=\"content\" rows=\"3\" style=\"width: 100%\" placeholder=\"Slider Content\"></textarea></b>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"mb-3 col-6\">                                \r\n");
      out.write("                                    <b>Notes: <br><textarea name=\"notes\" rows=\"3\" style=\"width: 100%\" placeholder=\"Slider Notes\"></textarea></b>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-center mt-5\">\r\n");
      out.write("                                    <button class=\"btn btn-success\"/>Add</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div><br>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group col-md-12\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.backlink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-danger\" style=\"float: right !important\">Back</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role eq 'ADMIN'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <a href=\"DashboardServlet?year=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.currentYear}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn ms-1 me-2 pb-1\">\r\n");
        out.write("                    <i class=\"bi bi-speedometer2\"></i><span class=\"text-white\">DashBoard</span>\r\n");
        out.write("                </a>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <a class=\"btn ms-1 pb-1 account-div\">\r\n");
        out.write("                        <i class=\"bi bi-person-circle text-white me-2 py-5\"></i><span class=\"text-white\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                        <table class=\"text-dark cart-table row account-table bg-white\" style=\"border: 1px solid gray;\">\r\n");
        out.write("                            <tr>\r\n");
        out.write("                                <td><a href=\"profile\" \r\n");
        out.write("                                       class=\"btn btn-outline-secondary ms-lg-2 mt-2\" style=\"padding: 6px 17px 6px 17px !important\">\r\n");
        out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>Information</a></td>   \r\n");
        out.write("                            </tr>\r\n");
        out.write("                            <tr>\r\n");
        out.write("                                <td><a href=\"Logout\" class=\"btn btn-outline-danger ms-lg-2 mt-2\"\r\n");
        out.write("                                       style=\"padding: 6px 34px 6px 34px !important\">\r\n");
        out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>Logout</a></td>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                        </table>\r\n");
        out.write("                    </a>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listSubjects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("S");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"collapse\" id=\"collapseSub\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n");
          out.write("\r\n");
          out.write("                        <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\r\n");
          out.write("\r\n");
          out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#listLessonId");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" aria-expanded=\"false\" aria-controls=\"pagesCollapseAuth\">\r\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
          out.write("                            </a>\r\n");
          out.write("                            ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                        </nav>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listLessons}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("L");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("                            ");
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

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectId == L.subId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"collapse\" id=\"listLessonId");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${L.subId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordionPages\">\r\n");
        out.write("                                            <nav class=\"sb-sidenav-menu-nested nav\">\r\n");
        out.write("                                                <a class=\"nav-link\" href=\"lesson-quiz?lessonId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${L.lessonId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&subId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${L.subId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&action=post\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${L.lessonName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(':');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${L.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                                            </nav>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
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
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listSubjects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("S");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${S.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                        ");
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
}
