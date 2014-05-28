package org.apache.jsp.tag.web.map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class load_tagx
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);

    try {
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("<link type=\"text/css\" href=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${leaflet_url}", java.lang.String.class, (PageContext)this.getJspContext(), null) + "\" rel=\"stylesheet\" />");
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${leaflet_script}", java.lang.String.class, (PageContext)this.getJspContext(), null) + "\">");
      out.write("</script>");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t// Init javascript manually - put full program into init() function\n");
      out.write("\t\tfunction init(){\n");
      out.write("\t\t\t// LEAFLET MAP //\n");
      out.write("\t\t\t// Default tutorial map//\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar map = L.map('map').setView([51.505, -0.09], 13);\n");
      out.write("\t\t\n");
      out.write("\t\t\tL.tileLayer('https://{s}.tiles.mapbox.com/v3/{id}/{z}/{x}/{y}.png', {\n");
      out.write("\t\t\t\tmaxZoom: 18,\n");
      out.write("\t\t\t\tattribution: 'Map data ");
      out.write("<a href=\"http://openstreetmap.org\">");
      out.write("OpenStreetMap");
      out.write("</a>");
      out.write(" contributors, ' +\n");
      out.write("\t\t\t\t\t'");
      out.write("<a href=\"http://creativecommons.org/licenses/by-sa/2.0/\">");
      out.write("CC-BY-SA");
      out.write("</a>");
      out.write(", ' +\n");
      out.write("\t\t\t\t\t'Imagery ");
      out.write("<a href=\"http://mapbox.com\">");
      out.write("Mapbox");
      out.write("</a>");
      out.write("',\n");
      out.write("\t\t\t\tid: 'examples.map-i86knfo3'\n");
      out.write("\t\t\t}).addTo(map);\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\tL.marker([51.5, -0.09]).addTo(map)\n");
      out.write("\t\t\t\t.bindPopup(\"");
      out.write("<b>");
      out.write("Hello world!");
      out.write("</b>");
      out.write("<br />");
      out.write("I am a popup.\").openPopup();\n");
      out.write("\t\t\n");
      out.write("\t\t\tL.circle([51.508, -0.11], 500, {\n");
      out.write("\t\t\t\tcolor: 'red',\n");
      out.write("\t\t\t\tfillColor: '#f03',\n");
      out.write("\t\t\t\tfillOpacity: 0.5\n");
      out.write("\t\t\t}).addTo(map).bindPopup(\"I am a circle.\");\n");
      out.write("\t\t\n");
      out.write("\t\t\tL.polygon([\n");
      out.write("\t\t\t\t[51.509, -0.08],\n");
      out.write("\t\t\t\t[51.503, -0.06],\n");
      out.write("\t\t\t\t[51.51, -0.047]\n");
      out.write("\t\t\t]).addTo(map).bindPopup(\"I am a polygon.\");\n");
      out.write("\t\t\n");
      out.write("\t\t\tvar popup = L.popup();\n");
      out.write("\t\t\n");
      out.write("\t\t\tfunction onMapClick(e) {\n");
      out.write("\t\t\t\tpopup\n");
      out.write("\t\t\t\t\t.setLatLng(e.latlng)\n");
      out.write("\t\t\t\t\t.setContent(\"You clicked the map at \" + e.latlng.toString())\n");
      out.write("\t\t\t\t\t.openOn(map);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\tmap.on('click', onMapClick);\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// Event listener catches when the DOM content is fully loaded; then launches the map script\n");
      out.write("\t\tdocument.addEventListener(\"DOMContentLoaded\", function()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tinit();\n");
      out.write("\t\t}, false);\n");
      out.write("\t\t\n");
      out.write("\t");
      out.write("</script>");
      out.write("<div style=\"width: 540px; height: 480px\" id=\"map\">");
      out.write("</div>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setVar("leaflet_url");
    _jspx_th_spring_url_0.setValue("/resources/styles/leaflet.css");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setVar("leaflet_script");
    _jspx_th_spring_url_1.setValue("http://cdn.leafletjs.com/leaflet-0.7.3/leaflet.js");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }
}
