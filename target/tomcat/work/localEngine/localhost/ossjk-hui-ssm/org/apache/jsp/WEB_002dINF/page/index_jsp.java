package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/inc/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjk_005fmenu;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fjk_005fmenu = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fjk_005fmenu.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--_meta 作为公共模版分离出去-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"Bookmark\" href=\"favicon.ico\">\n");
      out.write("<link rel=\"Shortcut Icon\" href=\"favicon.ico\" />\n");
      out.write("<title>OSSJK管理后台 v1.1</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/inc/common.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_jk_005fmenu_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<div class=\"Hui-admin-aside-mask\"></div>\n");
      out.write("\t<div class=\"Hui-admin-dislpayArrow\">\n");
      out.write("\t\t<a href=\"javascript:void(0);\" onClick=\"displaynavbar(this)\"> <i class=\"Hui-iconfont Hui-iconfont-left\">&#xe6d4;</i> <i class=\"Hui-iconfont Hui-iconfont-right\">&#xe6d7;</i>\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("\t<section class=\"Hui-admin-article-wrapper\">\n");
      out.write("\t\t<!--_header 作为公共模版分离出去-->\n");
      out.write("\t\t<header class=\"Hui-navbar\">\n");
      out.write("\t\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid clearfix\">\n");
      out.write("\t\t\t\t\t<nav id=\"Hui-userbar\" class=\"nav navbar-nav navbar-userbar\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<li>超级管理员</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropDown dropDown_hover\"><a href=\"#\" class=\"dropDown_A\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" <i class=\"Hui-iconfont\">&#xe6d5;</i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropDown-menu menu radius box-shadow\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\" onClick=\"myselfinfo()\">个人信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- \t<li><a href=\"#\">切换账户</a></li> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" onClick=\"logout()\">退出</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t\t<!-- <li id=\"Hui-msg\"><a href=\"#\" title=\"消息\"><span class=\"badge badge-danger\">1</span><i class=\"Hui-iconfont\" style=\"font-size: 18px\">&#xe68a;</i></a></li> -->\n");
      out.write("\t\t\t\t\t\t\t<li id=\"Hui-skin\" class=\"dropDown dropDown_hover right\"><a href=\"javascript:;\" class=\"dropDown_A\" title=\"换肤\"><i class=\"Hui-iconfont\" style=\"font-size: 18px\">&#xe62a;</i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropDown-menu menu radius box-shadow\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"default\" title=\"默认（蓝色）\">默认（深蓝）</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"black\" title=\"黑色\">黑色</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"green\" title=\"绿色\">绿色</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"red\" title=\"红色\">红色</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"yellow\" title=\"黄色\">黄色</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"orange\" title=\"橙色\">橙色</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t<div id=\"Hui-admin-tabNav\" class=\"Hui-admin-tabNav\">\n");
      out.write("\t\t\t<div class=\"Hui-admin-tabNav-wp\">\n");
      out.write("\t\t\t\t<ul id=\"min_title_list\" class=\"acrossTab clearfix\" style=\"width: 241px; left: 0px;\">\n");
      out.write("\t\t\t\t\t<li class=\"\"><span title=\"我的桌面\" data-href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/system/toDesktop.do\">我的桌面</span><em></em></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"Hui-admin-tabNav-more btn-group\" style=\"display: none;\">\n");
      out.write("\t\t\t\t<a id=\"js-tabNav-prev\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d4;</i></a> <a id=\"js-tabNav-next\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d7;</i></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"iframe_box\" class=\"Hui-admin-article\">\n");
      out.write("\t\t\t<div class=\"show_iframe\">\n");
      out.write("\t\t\t\t<iframe id=\"iframe-welcome\" data-scrolltop=\"0\" scrolling=\"yes\" frameborder=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/system/toDesktop.do\"></iframe>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<div class=\"contextMenu\" id=\"Huiadminmenu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li id=\"closethis\">关闭当前</li>\n");
      out.write("\t\t\t<li id=\"closeall\">关闭全部</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/jquery.contextmenu/jquery.contextmenu.r2.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$(\"body\").Huitab({\n");
      out.write("\t\t\ttabBar : \".navbar-wrapper .navbar-levelone\",\n");
      out.write("\t\t\ttabCon : \".Hui-aside .menu_dropdown\",\n");
      out.write("\t\t\tclassName : \"current\",\n");
      out.write("\t\t\tindex : 0,\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t/*登出*/\n");
      out.write("\tfunction logout() {\n");
      out.write("\t\tlayer.confirm('确认要退出吗？', function(index) {\n");
      out.write("\t\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/system/logout.do\";\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t/*个人信息*/\n");
      out.write("\tfunction myselfinfo() {\n");
      out.write("\t\tlayer_show(\"个人信息\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/system/user/toUpdate.do?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\", 800, 500);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tif (self != top) {\n");
      out.write("\t\twindow.top.location.replace(self.location); //打开自己网站的页面\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_jk_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jk:menu
    com.ossjk.core.tag.MenuTag _jspx_th_jk_005fmenu_005f0 = (com.ossjk.core.tag.MenuTag) _005fjspx_005ftagPool_005fjk_005fmenu.get(com.ossjk.core.tag.MenuTag.class);
    _jspx_th_jk_005fmenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jk_005fmenu_005f0.setParent(null);
    int _jspx_eval_jk_005fmenu_005f0 = _jspx_th_jk_005fmenu_005f0.doStartTag();
    if (_jspx_eval_jk_005fmenu_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_jk_005fmenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_jk_005fmenu_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_jk_005fmenu_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t[{\n");
        out.write("\t\t\t\t\"name\": \"系统管理\",\n");
        out.write("\t\t\t\t\"icon\": \"&#xe62e;\",\n");
        out.write("\t\t\t\t\"child\": [\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"用户管理\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/system/user/list.do\"\n");
        out.write("\t\t\t\t\t\t}\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"角色管理\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/system/role/list.do\"\n");
        out.write("\t\t\t\t\t\t}\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"部门管理\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/system/organization/list.do\"\n");
        out.write("\t\t\t\t\t\t}\n");
        out.write("\t\t\t\t]\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t},\n");
        out.write("\t\t\t{\n");
        out.write("\t\t\t\"name\": \"设备管理\",\n");
        out.write("\t\t\t\t\"icon\": \"&#xe62e;\",\n");
        out.write("\t\t\t\t\"child\": [\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"设备等级入库\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/device/device/list.do\"\n");
        out.write("\t\t\t\t\t\t},\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"设备分类管理\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/device/devicetype/list.do\"\n");
        out.write("\t\t\t\t\t\t},\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"设备领用归还\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/device/devicereceive/list.do\"\n");
        out.write("\t\t\t\t\t\t},\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"设备报废\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/device/devicesout/list.do\"\n");
        out.write("\t\t\t\t\t\t},\n");
        out.write("\t\t\t\t\t\t{\n");
        out.write("\t\t\t\t\t\t\t\"name\": \"设备报修\",\n");
        out.write("\t\t\t\t\t\t\t\"href\": \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/device/devicerepair/list.do\"\n");
        out.write("\t\t\t\t\t\t}]\n");
        out.write("\t\t\t}\n");
        out.write("\t\t\t]\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_jk_005fmenu_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_jk_005fmenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_jk_005fmenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjk_005fmenu.reuse(_jspx_th_jk_005fmenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjk_005fmenu.reuse(_jspx_th_jk_005fmenu_005f0);
    return false;
  }
}
